package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {

        super(output);

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLACK_PETUNIA, ModBlocks.POTTED_BLACK_PETUNIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_PETUNIA, ModBlocks.POTTED_RED_PETUNIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_BELLFLOWER, ModBlocks.POTTED_PURPLE_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_CONEFLOWER, ModBlocks.POTTED_GREEN_CONEFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerbed(ModBlocks.BLUE_AUBRIETAS);

        blockStateModelGenerator.registerPlantPart(ModBlocks.THICK_STALK,
                ModBlocks.THICK_STALK_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.THICK_STALK, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(ModBlocks.THICK_STALK_PLANT);

        blockStateModelGenerator.registerPlantPart(ModBlocks.THICK_VINES,
                ModBlocks.THICK_VINES_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.THICK_VINES, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(ModBlocks.THICK_VINES_PLANT);

        blockStateModelGenerator.registerPlantPart(ModBlocks.PINK_ALCEA,
                ModBlocks.PINK_ALCEA_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.PINK_ALCEA, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(ModBlocks.PINK_ALCEA_PLANT);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor((ArmorItem) ModItems.FLORAL_CROWN);

        itemModelGenerator.register(ModItems.PETUNIA_LANCE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLOWER_BLEND, Models.GENERATED);

    }

}
