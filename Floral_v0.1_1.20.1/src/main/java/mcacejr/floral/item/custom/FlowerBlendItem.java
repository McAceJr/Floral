package mcacejr.floral.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class FlowerBlendItem extends Item {

    public FlowerBlendItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if (!context.getWorld().isClient()) {

            BlockState selectedBlockState = context.getWorld().getBlockState(context.getBlockPos());

            BlockPos pos = context.getBlockPos();

            WorldAccess world = context.getWorld();

            if (selectedBlockState.isIn(BlockTags.FLOWERS))
            {

                Block.dropStack(context.getWorld(), context.getBlockPos(), new ItemStack(selectedBlockState.getBlock().asItem()));

                context.getStack().decrement(1);

                int count = 15;
                double d = 0.5;
                double e;

                if (selectedBlockState.isOf(Blocks.WATER)) {
                    count *= 3;
                    e = 1.0;
                    d = 3.0;
                } else if (selectedBlockState.isOpaqueFullCube(world, pos)) {
                    pos = pos.up();
                    count *= 3;
                    d = 3.0;
                    e = 1.0;
                } else {
                    e = selectedBlockState.getOutlineShape(world, pos).getMax(Direction.Axis.Y);
                }

                world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5,
                        pos.getY() + 0.5, pos.getZ() + 0.5, 0.0, 0.0, 0.0);


                Random random = context.getWorld().getRandom();

                for (int i = 0; i < count; i++) {
                    double f = random.nextGaussian() * 0.02;
                    double g = random.nextGaussian() * 0.02;
                    double h = random.nextGaussian() * 0.02;
                    double j = 0.5 - d;
                    double k = pos.getX() + j + random.nextDouble() * d * 2.0;
                    double l = pos.getY() + random.nextDouble() * e;
                    double m = pos.getZ() + j + random.nextDouble() * d * 2.0;
                    if (!world.getBlockState(BlockPos.ofFloored(k, l, m).down()).isAir()) {
                        world.addParticle(ParticleTypes.HAPPY_VILLAGER, k, l, m, f, g, h);
                    }
                }

                context.getWorld().playSoundAtBlockCenter(pos, SoundEvents.ITEM_BONE_MEAL_USE,
                        SoundCategory.BLOCKS,1.0F, 1.0F, false);

                return ActionResult.SUCCESS;

            }

        }

        return ActionResult.FAIL;

    }

}
