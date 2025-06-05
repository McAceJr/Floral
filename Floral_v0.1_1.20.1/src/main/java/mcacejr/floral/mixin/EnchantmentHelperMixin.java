package mcacejr.floral.mixin;


import com.google.common.collect.Lists;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
    @Unique
    @Final
    public EnchantmentTarget type;

    @Inject(method = "getPossibleEntries", at = @At(value = "RETURN"), cancellable = true)
    private static void floral$getPossibleEntries(int power, ItemStack stack, boolean treasureAllowed,
                                                  CallbackInfoReturnable<List<EnchantmentLevelEntry>> cir) {
        List<EnchantmentLevelEntry> list = Lists.<EnchantmentLevelEntry>newArrayList();
        Item item = stack.getItem();
        boolean bl = stack.isOf(Items.BOOK);

        for (Enchantment enchantment : Registries.ENCHANTMENT) {
            if ((!enchantment.isTreasure() || treasureAllowed) && enchantment.isAvailableForRandomSelection() &&
                    (enchantment.isAcceptableItem(new ItemStack(item)) || bl)) {
                for (int i = enchantment.getMaxLevel(); i > enchantment.getMinLevel() - 1; i--) {
                    if (power >= enchantment.getMinPower(i) && power <= enchantment.getMaxPower(i)) {
                        list.add(new EnchantmentLevelEntry(enchantment, i));
                        break;
                    }
                }
            }
        }
        cir.setReturnValue(list);
    }
}
