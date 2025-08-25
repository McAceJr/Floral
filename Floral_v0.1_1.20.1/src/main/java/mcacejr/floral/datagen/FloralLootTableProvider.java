package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
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

        addDrop(ModBlocks.BLACK_PETUNIA);
        addPottedPlantDrops(ModBlocks.POTTED_BLACK_PETUNIA);

        addDrop(ModBlocks.RED_PETUNIA);
        addPottedPlantDrops(ModBlocks.POTTED_RED_PETUNIA);

        addDrop(ModBlocks.PURPLE_BELLFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_BELLFLOWER);

        addDrop(ModBlocks.GREEN_CONEFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_GREEN_CONEFLOWER);

        addDrop(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER, block -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));

        addDrop(ModBlocks.BLUE_AUBRIETAS);

        addVinePlantDrop(ModBlocks.THICK_STALK, ModBlocks.THICK_STALK_PLANT);
        addVinePlantDrop(ModBlocks.THICK_VINES, ModBlocks.THICK_VINES_PLANT);
        addVinePlantDrop(ModBlocks.PINK_ALCEA, ModBlocks.PINK_ALCEA_PLANT);

        addDrop(ModBlocks.LIGHT_GRAY_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_LIGHT_GRAY_TULIP);
        addDrop(ModBlocks.GRAY_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_GRAY_TULIP);
        addDrop(ModBlocks.BLACK_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_BLACK_TULIP);
        addDrop(ModBlocks.BROWN_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_BROWN_TULIP);
        addDrop(ModBlocks.YELLOW_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_YELLOW_TULIP);
        addDrop(ModBlocks.LIME_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_LIME_TULIP);
        addDrop(ModBlocks.GREEN_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_GREEN_TULIP);
        addDrop(ModBlocks.CYAN_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_CYAN_TULIP);
        addDrop(ModBlocks.LIGHT_BLUE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_LIGHT_BLUE_TULIP);
        addDrop(ModBlocks.BLUE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_TULIP);
        addDrop(ModBlocks.PURPLE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_TULIP);
        addDrop(ModBlocks.MAGENTA_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_MAGENTA_TULIP);

        addDrop(ModBlocks.GREEN_DAHLIA);
        addPottedPlantDrops(ModBlocks.POTTED_GREEN_DAHLIA);
        addDrop(ModBlocks.MAGENTA_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_MAGENTA_TULIP);
        addDrop(ModBlocks.LIME_BELLFLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_LIME_BELLFLOWER);
        addDrop(ModBlocks.PURPLE_WOLFSBANE);
        addPottedPlantDrops(ModBlocks.POTTED_PURPLE_WOLFSBANE);

        addDrop(ModBlocks.LIME_CHIMNEY_BELLFLOWER, block -> this.dropsWithProperty(block, TallPlantBlock.HALF, DoubleBlockHalf.LOWER));

        addDrop(ModBlocks.WEEPING_ROOTS);
        addDrop(ModBlocks.TWISTING_ROOTS);
        addDrop(ModBlocks.WARDEN_PRIMROSE);
        addDrop(ModBlocks.ROCKY_SEDUM);
        addDrop(ModBlocks.STEM_LILY);
        addDrop(ModBlocks.CHORUS_TULIP);
        addDrop(ModBlocks.WHITE_OVERFLOWING_BELLFLOWER);

        addDrop(ModBlocks.FLORAL_STONE);
        addDrop(ModBlocks.FLORAL_STONE_STAIRS);
        addDrop(ModBlocks.FLORAL_STONE_SLAB, slabDrops(ModBlocks.FLORAL_STONE_SLAB));
        addDrop(ModBlocks.FLORAL_STONE_WALL);
        addDrop(ModBlocks.FLORAL_STONE_BRICKS);
        addDrop(ModBlocks.FLORAL_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.FLORAL_STONE_BRICK_SLAB, slabDrops(ModBlocks.FLORAL_STONE_BRICK_SLAB));
        addDrop(ModBlocks.FLORAL_STONE_BRICK_WALL);
        addDrop(ModBlocks.COBBLED_FLORAL_STONE);
        addDrop(ModBlocks.COBBLED_FLORAL_STONE_STAIRS);
        addDrop(ModBlocks.COBBLED_FLORAL_STONE_SLAB, slabDrops(ModBlocks.COBBLED_FLORAL_STONE_SLAB));
        addDrop(ModBlocks.COBBLED_FLORAL_STONE_WALL);

        addDrop(ModBlocks.STEM_LOG);
        addDrop(ModBlocks.STEM_WOOD);
        addDrop(ModBlocks.STRIPPED_STEM_LOG);
        addDrop(ModBlocks.STRIPPED_STEM_WOOD);
        addDrop(ModBlocks.STEM_PLANKS);
        addDrop(ModBlocks.STEM_STAIRS);
        addDrop(ModBlocks.STEM_SLAB, slabDrops(ModBlocks.STEM_SLAB));
        addDrop(ModBlocks.STEM_FENCE);
        addDrop(ModBlocks.STEM_FENCE_GATE);
        addDrop(ModBlocks.STEM_BUTTON);
        addDrop(ModBlocks.STEM_PRESSURE_PLATE);
        addDrop(ModBlocks.STEM_TRAPDOOR);
        addDrop(ModBlocks.STEM_DOOR, doorDrops(ModBlocks.STEM_DOOR));

    }

}
