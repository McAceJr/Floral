package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
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

    }

}
