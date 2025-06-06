package mcacejr.floral.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class ThickVineBlock extends AbstractPlantStemBlock{

    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

    private static Block CUSTOMPLANT = null;

    public ThickVineBlock(AbstractBlock.Settings settings, Block customPlant, boolean tickWater, float growthChance) {
        super(settings, Direction.DOWN, SHAPE, tickWater, growthChance);

        CUSTOMPLANT = customPlant;

    }

    @Override
    protected int getGrowthLength(Random random) {
        return VineLogic.getGrowthLength(random);
    }

    @Override
    protected Block getPlant() {
        return CUSTOMPLANT;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return VineLogic.isValidForWeepingStem(state);
    }

}
