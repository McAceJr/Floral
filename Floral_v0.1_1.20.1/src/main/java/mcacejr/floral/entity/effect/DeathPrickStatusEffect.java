package mcacejr.floral.entity.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DeathPrickStatusEffect extends StatusEffect {

    public DeathPrickStatusEffect() {
        super(StatusEffectCategory.HARMFUL,0x47542d);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {

        return true;

    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        entity.damage(entity.getDamageSources().magic(), 1 << amplifier);

    }

}
