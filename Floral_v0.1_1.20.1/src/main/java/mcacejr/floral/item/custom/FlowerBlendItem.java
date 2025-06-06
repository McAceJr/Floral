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
import net.minecraft.world.WorldEvents;

public class FlowerBlendItem extends Item {

    public FlowerBlendItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if (!context.getWorld().isClient()) {

            BlockState selectedBlockState = context.getWorld().getBlockState(context.getBlockPos());

            BlockPos pos = context.getBlockPos();

            World world = context.getWorld();

            if (selectedBlockState.isIn(BlockTags.FLOWERS))
            {

                Block.dropStack(context.getWorld(), context.getBlockPos(), new ItemStack(selectedBlockState.getBlock().asItem()));

                world.syncWorldEvent(WorldEvents.BONE_MEAL_USED, context.getBlockPos(), 0);

                context.getStack().decrement(1);

                return ActionResult.SUCCESS;

            }

        }

        return ActionResult.FAIL;

    }

}
