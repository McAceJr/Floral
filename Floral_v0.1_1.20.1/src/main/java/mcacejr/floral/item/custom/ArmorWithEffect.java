package mcacejr.floral.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorWithEffect extends ArmorItem {
    private final StatusEffectInstance statusEffect;
    private int ticksUntilReapply;

    public ArmorWithEffect(ArmorMaterial material, Type type, Settings settings, StatusEffectInstance statusEffect) {
        super(material, type, settings);
        this.statusEffect = statusEffect;
        this.ticksUntilReapply = 0;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (this.ticksUntilReapply > 0) {
            this.ticksUntilReapply--;
        }
        else if (!world.isClient()) {
            this.ticksUntilReapply = 201;
            if (entity instanceof PlayerEntity player)  {
                if (isWearing(player)) {
                    player.addStatusEffect(new StatusEffectInstance(this.statusEffect));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean isWearing(PlayerEntity player) {
        for (int i = 0; i < 4; i++) {
            Item item = player.getInventory().getArmorStack(i).getItem();
            if (item instanceof ArmorItem armor) {
                if (armor.getMaterial() == this.material)
                    return true;
            }
        }
        return false;
    }
}