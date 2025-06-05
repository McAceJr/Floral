package mcacejr.floral.enchantment;

import mcacejr.floral.item.ModItems;
import mcacejr.floral.item.custom.CorpseBlossomSword;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HungryFaunaFloralEnchantment extends Enchantment{


    public HungryFaunaFloralEnchantment() {

        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND});

        Registry.register(Registries.ENCHANTMENT, new Identifier("floral", "hungry_fauna"), this);

    }

    @Override
    public int getMaxLevel() {

        return 5;

    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof CorpseBlossomSword;
    }

}
