package mcacejr.floral.datagen;

import mcacejr.floral.block.FloralBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;

public class FloralLootTableProvider extends FabricBlockLootTableProvider {

    public FloralLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(FloralBlocks.BLACK_PETUNIA);
        addPottedPlantDrops(FloralBlocks.POTTED_BLACK_PETUNIA);

        addDrop(FloralBlocks.RED_PETUNIA);
        addPottedPlantDrops(FloralBlocks.POTTED_RED_PETUNIA);

        addDrop(FloralBlocks.PURPLE_BELLFLOWER);
        addPottedPlantDrops(FloralBlocks.POTTED_PURPLE_BELLFLOWER);

        addDrop(FloralBlocks.GREEN_CONEFLOWER);
        addPottedPlantDrops(FloralBlocks.POTTED_GREEN_CONEFLOWER);

        addDrop(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER, block -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));

        addDrop(FloralBlocks.BLUE_AUBRIETAS);

        addVinePlantDrop(FloralBlocks.THICK_STALK, FloralBlocks.THICK_STALK_PLANT);
        addVinePlantDrop(FloralBlocks.THICK_VINES, FloralBlocks.THICK_VINES_PLANT);
        addVinePlantDrop(FloralBlocks.PINK_ALCEA, FloralBlocks.PINK_ALCEA_PLANT);

        addDrop(FloralBlocks.LIGHT_GRAY_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_LIGHT_GRAY_TULIP);
        addDrop(FloralBlocks.GRAY_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_GRAY_TULIP);
        addDrop(FloralBlocks.BLACK_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_BLACK_TULIP);
        addDrop(FloralBlocks.BROWN_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_BROWN_TULIP);
        addDrop(FloralBlocks.YELLOW_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_YELLOW_TULIP);
        addDrop(FloralBlocks.LIME_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_LIME_TULIP);
        addDrop(FloralBlocks.GREEN_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_GREEN_TULIP);
        addDrop(FloralBlocks.CYAN_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_CYAN_TULIP);
        addDrop(FloralBlocks.LIGHT_BLUE_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_LIGHT_BLUE_TULIP);
        addDrop(FloralBlocks.BLUE_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_BLUE_TULIP);
        addDrop(FloralBlocks.PURPLE_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_PURPLE_TULIP);
        addDrop(FloralBlocks.MAGENTA_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_MAGENTA_TULIP);

        addDrop(FloralBlocks.GREEN_DAHLIA);
        addPottedPlantDrops(FloralBlocks.POTTED_GREEN_DAHLIA);
        addDrop(FloralBlocks.MAGENTA_TULIP);
        addPottedPlantDrops(FloralBlocks.POTTED_MAGENTA_TULIP);
        addDrop(FloralBlocks.LIME_BELLFLOWER);
        addPottedPlantDrops(FloralBlocks.POTTED_LIME_BELLFLOWER);
        addDrop(FloralBlocks.PURPLE_WOLFSBANE);
        addPottedPlantDrops(FloralBlocks.POTTED_PURPLE_WOLFSBANE);

        addDrop(FloralBlocks.LIME_CHIMNEY_BELLFLOWER, block -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));

        addDrop(FloralBlocks.WEEPING_ROOTS);
        addDrop(FloralBlocks.TWISTING_ROOTS);
        addDrop(FloralBlocks.WARDEN_PRIMROSE);
        addDrop(FloralBlocks.ROCKY_SEDUM);
        addDrop(FloralBlocks.STEM_LILY);
        addDrop(FloralBlocks.CHORUS_TULIP);
        addDrop(FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER);

        addDrop(FloralBlocks.FLORAL_STONE);
        addDrop(FloralBlocks.FLORAL_STONE_STAIRS);
        addDrop(FloralBlocks.FLORAL_STONE_SLAB, slabDrops(FloralBlocks.FLORAL_STONE_SLAB));
        addDrop(FloralBlocks.FLORAL_STONE_WALL);
        addDrop(FloralBlocks.FLORAL_STONE_BRICKS);
        addDrop(FloralBlocks.FLORAL_STONE_BRICK_STAIRS);
        addDrop(FloralBlocks.FLORAL_STONE_BRICK_SLAB, slabDrops(FloralBlocks.FLORAL_STONE_BRICK_SLAB));
        addDrop(FloralBlocks.FLORAL_STONE_BRICK_WALL);
        addDrop(FloralBlocks.COBBLED_FLORAL_STONE);
        addDrop(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS);
        addDrop(FloralBlocks.COBBLED_FLORAL_STONE_SLAB, slabDrops(FloralBlocks.COBBLED_FLORAL_STONE_SLAB));
        addDrop(FloralBlocks.COBBLED_FLORAL_STONE_WALL);

        addDrop(FloralBlocks.STEM_LOG);
        addDrop(FloralBlocks.STEM_WOOD);
        addDrop(FloralBlocks.STRIPPED_STEM_LOG);
        addDrop(FloralBlocks.STRIPPED_STEM_WOOD);
        addDrop(FloralBlocks.STEM_PLANKS);
        addDrop(FloralBlocks.STEM_STAIRS);
        addDrop(FloralBlocks.STEM_SLAB, slabDrops(FloralBlocks.STEM_SLAB));
        addDrop(FloralBlocks.STEM_FENCE);
        addDrop(FloralBlocks.STEM_FENCE_GATE);
        addDrop(FloralBlocks.STEM_BUTTON);
        addDrop(FloralBlocks.STEM_PRESSURE_PLATE);
        addDrop(FloralBlocks.STEM_TRAPDOOR);
        addDrop(FloralBlocks.STEM_DOOR, doorDrops(FloralBlocks.STEM_DOOR));

    }

}
