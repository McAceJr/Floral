package mcacejr.floral.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;

public class ThickStalkPlantBlock extends AbstractPlantBlock {

    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

    private static Block PLANTSTEMBLOCK = null;

    public ThickStalkPlantBlock(AbstractBlock.Settings settings, Block plantStemBlock, boolean bl) {
        super(settings, Direction.UP, SHAPE, bl);

        PLANTSTEMBLOCK = plantStemBlock;

    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) PLANTSTEMBLOCK;
    }

}
