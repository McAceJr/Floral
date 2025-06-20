package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {

        super(output);

    }

    public void registerThreeStageFlower(BlockStateModelGenerator blockStateModelGenerator, Block flowerBlock) {

        blockStateModelGenerator.registerItemModel(flowerBlock.asItem());

        blockStateModelGenerator.createSubModel(flowerBlock, "_stage0", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.createSubModel(flowerBlock, "_stage1", Models.CROSS, TextureMap::cross);
        blockStateModelGenerator.createSubModel(flowerBlock, "_stage2", Models.CROSS, TextureMap::cross);

        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.
                create(flowerBlock).coordinate(BlockStateVariantMap.create(Properties.AGE_2)
                .register(0, BlockStateVariant.create().put(VariantSettings.MODEL,
                        ModelIds.getBlockSubModelId(flowerBlock, "_stage0")))
                .register(1, BlockStateVariant.create().put(VariantSettings.MODEL,
                        ModelIds.getBlockSubModelId(flowerBlock, "_stage1")))
                .register(2, BlockStateVariant.create().put(VariantSettings.MODEL,
                        ModelIds.getBlockSubModelId(flowerBlock, "_stage2")))
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

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

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

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_DAHLIA, ModBlocks.POTTED_GREEN_DAHLIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_CABARET, ModBlocks.POTTED_MAGENTA_CABARET,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIME_BELLFLOWER, ModBlocks.POTTED_LIME_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_WOLFSBANE, ModBlocks.POTTED_PURPLE_WOLFSBANE,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LIME_CHIMNEY_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.WEEPING_ROOTS);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.TWISTING_ROOTS);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.WARDEN_PRIMROSE);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.ROCKY_SEDUM);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.STEM_LILY);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.SNOWY_CABARET);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.DRIED_DAHLIA);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.FROSTED_ROSE);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.METALLIC_CONEFLOWER);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.BURNING_PETUNIA);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.ENDER_CLAM_FLOWER);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.SHINY_JASMINE);
        registerThreeStageFlower(blockStateModelGenerator, ModBlocks.PUTTY_PETUNIA);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRAFTING_FLOWER, ModBlocks.POTTED_CRAFTING_FLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool floralstonepool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FLORAL_STONE);
        floralstonepool.stairs(ModBlocks.FLORAL_STONE_STAIRS);
        floralstonepool.slab(ModBlocks.FLORAL_STONE_SLAB);
        floralstonepool.wall(ModBlocks.FLORAL_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool floralstonebrickpool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FLORAL_STONE_BRICKS);
        floralstonebrickpool.stairs(ModBlocks.FLORAL_STONE_BRICK_STAIRS);
        floralstonebrickpool.slab(ModBlocks.FLORAL_STONE_BRICK_SLAB);
        floralstonebrickpool.wall(ModBlocks.FLORAL_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cobbledfloralstonepool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.COBBLED_FLORAL_STONE);
        cobbledfloralstonepool.stairs(ModBlocks.COBBLED_FLORAL_STONE_STAIRS);
        cobbledfloralstonepool.slab(ModBlocks.COBBLED_FLORAL_STONE_SLAB);
        cobbledfloralstonepool.wall(ModBlocks.COBBLED_FLORAL_STONE_WALL);

        blockStateModelGenerator.registerLog(ModBlocks.STEM_LOG)
                .log(ModBlocks.STEM_LOG).wood(ModBlocks.STEM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_STEM_LOG)
                .log(ModBlocks.STRIPPED_STEM_LOG).wood(ModBlocks.STRIPPED_STEM_WOOD);

        BlockStateModelGenerator.BlockTexturePool stemplankpool= blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.STEM_PLANKS);
        stemplankpool.stairs(ModBlocks.STEM_STAIRS);
        stemplankpool.slab(ModBlocks.STEM_SLAB);
        stemplankpool.fence(ModBlocks.STEM_FENCE);
        stemplankpool.fenceGate(ModBlocks.STEM_FENCE_GATE);
        stemplankpool.button(ModBlocks.STEM_BUTTON);
        stemplankpool.pressurePlate(ModBlocks.STEM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.STEM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STEM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor((ArmorItem) ModItems.FLORAL_CROWN);

        itemModelGenerator.register(ModItems.PETUNIA_LANCE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLOWER_TRIMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLORAL_BANE, Models.HANDHELD);

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
        itemModelGenerator.register(ModItems.WITHERED_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONES_BANE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIED_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COLD_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZING_PETAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.TWISTED_WART, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROZEN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWERING_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWERING_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOWER_PEARL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLAY_MEAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLOWERING_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_FLOWERING_GEM, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLORAL_BLOOM_TIER_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLORAL_BLOOM_TIER_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLORAL_BLOOM_TIER_3, Models.GENERATED);

    }

}
