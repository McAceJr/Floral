package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {

        super(output);

    }

    public void registerThreeStageFlower(BlockStateModelGenerator blockStateModelGenerator, Block flowerBlock) {

        blockStateModelGenerator.modelCollector.accept(ModelIds.getItemModelId(flowerBlock.asItem()),
                new SimpleModelSupplier(ModelIds.getBlockSubModelId(flowerBlock, "_stage2")));

        blockStateModelGenerator.createSubModel(flowerBlock, "_stage0", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.createSubModel(flowerBlock, "_stage1", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.createSubModel(flowerBlock, "_stage2", Models.CROSS, TextureMap::cross);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(flowerBlock).coordinate(BlockStateVariantMap.create(Properties.AGE_2)
                .register(0, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(flowerBlock, "_stage0")))
                .register(1, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(flowerBlock, "_stage1")))
                .register(2, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(flowerBlock, "_stage2")))
        ));

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

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_GRAY_TULIP, ModBlocks.POTTED_LIGHT_GRAY_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRAY_TULIP, ModBlocks.POTTED_GRAY_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLACK_TULIP, ModBlocks.POTTED_BLACK_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BROWN_TULIP, ModBlocks.POTTED_BROWN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_TULIP, ModBlocks.POTTED_YELLOW_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIME_TULIP, ModBlocks.POTTED_LIME_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_TULIP, ModBlocks.POTTED_GREEN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_TULIP, ModBlocks.POTTED_CYAN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_TULIP, ModBlocks.POTTED_LIGHT_BLUE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_TULIP, ModBlocks.POTTED_BLUE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_TULIP, ModBlocks.POTTED_PURPLE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_TULIP, ModBlocks.POTTED_MAGENTA_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.WEEPING_ROOTS);

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
