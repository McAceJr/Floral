package mcacejr.floral.datagen;

import mcacejr.floral.block.FloralBlocks;
import mcacejr.floral.item.FloralItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;

public class FloralModelProvider extends FabricModelProvider {

    public FloralModelProvider(FabricDataOutput output) {

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

        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.BLACK_PETUNIA, FloralBlocks.POTTED_BLACK_PETUNIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.RED_PETUNIA, FloralBlocks.POTTED_RED_PETUNIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.PURPLE_BELLFLOWER, FloralBlocks.POTTED_PURPLE_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.GREEN_CONEFLOWER, FloralBlocks.POTTED_GREEN_CONEFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerbed(FloralBlocks.BLUE_AUBRIETAS);

        blockStateModelGenerator.registerPlantPart(FloralBlocks.THICK_STALK,
                FloralBlocks.THICK_STALK_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(FloralBlocks.THICK_STALK, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(FloralBlocks.THICK_STALK_PLANT);

        blockStateModelGenerator.registerPlantPart(FloralBlocks.THICK_VINES,
                FloralBlocks.THICK_VINES_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(FloralBlocks.THICK_VINES, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(FloralBlocks.THICK_VINES_PLANT);

        blockStateModelGenerator.registerPlantPart(FloralBlocks.PINK_ALCEA,
                FloralBlocks.PINK_ALCEA_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(FloralBlocks.PINK_ALCEA, "_plant");
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(FloralBlocks.PINK_ALCEA_PLANT);

        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.LIGHT_GRAY_TULIP, FloralBlocks.POTTED_LIGHT_GRAY_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.GRAY_TULIP, FloralBlocks.POTTED_GRAY_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.BLACK_TULIP, FloralBlocks.POTTED_BLACK_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.BROWN_TULIP, FloralBlocks.POTTED_BROWN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.YELLOW_TULIP, FloralBlocks.POTTED_YELLOW_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.LIME_TULIP, FloralBlocks.POTTED_LIME_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.GREEN_TULIP, FloralBlocks.POTTED_GREEN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.CYAN_TULIP, FloralBlocks.POTTED_CYAN_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.LIGHT_BLUE_TULIP, FloralBlocks.POTTED_LIGHT_BLUE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.BLUE_TULIP, FloralBlocks.POTTED_BLUE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.PURPLE_TULIP, FloralBlocks.POTTED_PURPLE_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.MAGENTA_TULIP, FloralBlocks.POTTED_MAGENTA_TULIP,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.GREEN_DAHLIA, FloralBlocks.POTTED_GREEN_DAHLIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.MAGENTA_CABARET, FloralBlocks.POTTED_MAGENTA_CABARET,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.LIME_BELLFLOWER, FloralBlocks.POTTED_LIME_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(FloralBlocks.PURPLE_WOLFSBANE, FloralBlocks.POTTED_PURPLE_WOLFSBANE,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(FloralBlocks.LIME_CHIMNEY_BELLFLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.WEEPING_ROOTS);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.TWISTING_ROOTS);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.WARDEN_PRIMROSE);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.ROCKY_SEDUM);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.STEM_LILY);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.BONES_BANE);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.CHORUS_TULIP);
        registerThreeStageFlower(blockStateModelGenerator, FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER);

        BlockStateModelGenerator.BlockTexturePool floralstonepool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(FloralBlocks.FLORAL_STONE);
        floralstonepool.stairs(FloralBlocks.FLORAL_STONE_STAIRS);
        floralstonepool.slab(FloralBlocks.FLORAL_STONE_SLAB);
        floralstonepool.wall(FloralBlocks.FLORAL_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool floralstonebrickpool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(FloralBlocks.FLORAL_STONE_BRICKS);
        floralstonebrickpool.stairs(FloralBlocks.FLORAL_STONE_BRICK_STAIRS);
        floralstonebrickpool.slab(FloralBlocks.FLORAL_STONE_BRICK_SLAB);
        floralstonebrickpool.wall(FloralBlocks.FLORAL_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool cobbledfloralstonepool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(FloralBlocks.COBBLED_FLORAL_STONE);
        cobbledfloralstonepool.stairs(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS);
        cobbledfloralstonepool.slab(FloralBlocks.COBBLED_FLORAL_STONE_SLAB);
        cobbledfloralstonepool.wall(FloralBlocks.COBBLED_FLORAL_STONE_WALL);

        blockStateModelGenerator.registerLog(FloralBlocks.STEM_LOG)
                .log(FloralBlocks.STEM_LOG).wood(FloralBlocks.STEM_WOOD);
        blockStateModelGenerator.registerLog(FloralBlocks.STRIPPED_STEM_LOG)
                .log(FloralBlocks.STRIPPED_STEM_LOG).wood(FloralBlocks.STRIPPED_STEM_WOOD);

        BlockStateModelGenerator.BlockTexturePool stemplankpool= blockStateModelGenerator
                .registerCubeAllModelTexturePool(FloralBlocks.STEM_PLANKS);
        stemplankpool.stairs(FloralBlocks.STEM_STAIRS);
        stemplankpool.slab(FloralBlocks.STEM_SLAB);
        stemplankpool.fence(FloralBlocks.STEM_FENCE);
        stemplankpool.fenceGate(FloralBlocks.STEM_FENCE_GATE);
        stemplankpool.button(FloralBlocks.STEM_BUTTON);
        stemplankpool.pressurePlate(FloralBlocks.STEM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(FloralBlocks.STEM_DOOR);
        blockStateModelGenerator.registerTrapdoor(FloralBlocks.STEM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.registerArmor((ArmorItem) FloralItems.FLORAL_CROWN);

        itemModelGenerator.register(FloralItems.PETUNIA_LANCE, Models.HANDHELD);

        itemModelGenerator.register(FloralItems.FLOWER_TRIMMER, Models.HANDHELD);

        itemModelGenerator.register(FloralItems.FLORAL_BANE, Models.HANDHELD);

        itemModelGenerator.register(FloralItems.FLOWER_BLEND, Models.GENERATED);

        itemModelGenerator.register(FloralItems.WHITE_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.LIGHT_GRAY_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.GRAY_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.BLACK_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.RED_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.ORANGE_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.BROWN_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.YELLOW_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.LIME_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.GREEN_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.CYAN_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.LIGHT_BLUE_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.BLUE_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.PURPLE_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.MAGENTA_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.PINK_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.WITHERED_PETAL, Models.GENERATED);
        itemModelGenerator.register(FloralItems.BONES_BANE_PETAL, Models.GENERATED);

        itemModelGenerator.register(FloralItems.TWISTED_WART, Models.GENERATED);

    }

}
