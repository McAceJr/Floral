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

        itemModelGenerator.register(ModItems.FLOWER_TRIMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLOWER_BLEND, Models.GENERATED);

        itemModelGenerator.register(ModItems.WHITE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_PETAL, Models.GENERATED);

    }

}
