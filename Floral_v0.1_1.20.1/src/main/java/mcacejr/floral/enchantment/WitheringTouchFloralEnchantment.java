package mcacejr.floral.enchantment;

import mcacejr.floral.item.ModItems;
import mcacejr.floral.item.custom.CorpseBlossomSword;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WitheringTouchFloralEnchantment extends Enchantment{

    public WitheringTouchFloralEnchantment() {

        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});

        Registry.register(Registries.ENCHANTMENT, new Identifier("floral", "withering_touch"), this);

    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != FloralEnchantments.IVY_ROOTS &&
                other!= Enchantments.SHARPNESS &&
                other != Enchantments.SMITE &&
                other != Enchantments.BANE_OF_ARTHROPODS;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof CorpseBlossomSword;
    }

}
