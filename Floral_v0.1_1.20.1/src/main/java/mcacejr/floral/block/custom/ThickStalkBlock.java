package mcacejr.floral.block.custom;

import mcacejr.floral.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class ThickStalkBlock extends AbstractPlantStemBlock{

    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

    public ThickStalkBlock(Settings settings, boolean tickWater, float growthChance) {
        super(settings, Direction.UP, SHAPE, tickWater, growthChance);
    }

    @Override
    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }

    @Override
    protected Block getPlant() {
        return ModBlocks.THICK_STALK_PLANT;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }

}
