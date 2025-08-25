package mcacejr.floral.item.custom;

import mcacejr.floral.block.FloralBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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

                if (selectedBlockState.isOf(FloralBlocks.PINK_ALCEA_PLANT))
                {

                    Block.dropStack(context.getWorld(), context.getBlockPos(), new ItemStack(FloralBlocks.PINK_ALCEA));

                } else {

                    Block.dropStack(context.getWorld(), context.getBlockPos(), new ItemStack(selectedBlockState.getBlock()));

                }

                world.syncWorldEvent(WorldEvents.BONE_MEAL_USED, context.getBlockPos(), 0);

                context.getStack().decrement(1);

                return ActionResult.SUCCESS;

            }

        }

        return ActionResult.FAIL;

    }

}
