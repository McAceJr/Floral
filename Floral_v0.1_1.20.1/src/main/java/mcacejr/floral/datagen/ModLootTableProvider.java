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
        addDrop(ModBlocks.THICK_STALK);
        addDrop(ModBlocks.THICK_VINES);
        addDrop(ModBlocks.PINK_ALCEA);

    }

}
