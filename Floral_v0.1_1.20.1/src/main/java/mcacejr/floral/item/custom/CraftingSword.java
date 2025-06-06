package mcacejr.floral.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CraftingSword extends SwordItem {


    public CraftingSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack newStack = stack.copy();
        newStack.setDamage(newStack.getDamage() + 1);
        if (newStack.getDamage() >= newStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return newStack;
    }

}
