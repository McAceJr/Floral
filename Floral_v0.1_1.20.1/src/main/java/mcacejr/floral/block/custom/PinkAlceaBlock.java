package mcacejr.floral.block.custom;

import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

public class PinkAlceaBlock extends AbstractPlantStemBlock{

    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

    private static Block CUSTOMPLANT = null;

    public PinkAlceaBlock(Settings settings, Block customPlant, boolean tickWater, float growthChance) {

        super(settings, Direction.UP, SHAPE, tickWater, growthChance);

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
