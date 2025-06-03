package mcacejr.floral.item.custom;

import mcacejr.floral.enchantment.FloralEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CorpseBlossomSword extends SwordItem {

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int hungerLevel = EnchantmentHelper.getLevel(FloralEnchantments.HUNGRY_FAUNA, stack);
        if (hungerLevel > 0) {

            target.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30 * 20, hungerLevel - 1));

        }

        int witherLevel = EnchantmentHelper.getLevel(FloralEnchantments.WITHERING_TOUCH, stack);
        if (witherLevel > 0) {

            target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 30 * 20, witherLevel - 1));

        }

        int poisoningLevel = EnchantmentHelper.getLevel(FloralEnchantments.IVY_ROOTS, stack);
        if (poisoningLevel > 0) {

            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 30 * 20, poisoningLevel - 1));

        }

        return super.postHit(stack, target, attacker);

    }

    public CorpseBlossomSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
