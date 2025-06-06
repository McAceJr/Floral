package mcacejr.floral.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class ThickVinePlantBlock extends AbstractPlantBlock {

    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    private static Block PLANTSTEMBLOCK = null;

    public ThickVinePlantBlock(AbstractBlock.Settings settings, Block plantStemBlock, boolean bl) {
        super(settings, Direction.DOWN, SHAPE, bl);

        PLANTSTEMBLOCK = plantStemBlock;

    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) PLANTSTEMBLOCK;
    }

}
