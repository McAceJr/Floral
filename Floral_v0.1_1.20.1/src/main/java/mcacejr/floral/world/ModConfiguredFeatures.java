package mcacejr.floral.world;

import mcacejr.floral.Floral;
import mcacejr.floral.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_PETUNIA_KEY = registryKey("black_petunia");

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PETUNIA_KEY = registryKey("red_petunia");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PETUNIA_BUNCH_KEY = registryKey("petunia_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_BELLFLOWER_KEY = registryKey("purple_bellflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_BELLFLOWER_KEY = registryKey("lime_bellflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_CHIMNEY_BELLFLOWER_KEY = registryKey("purple_chimney_bellflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_CHIMNEY_BELLFLOWER_KEY = registryKey("lime_chimney_bellflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> BELLFLOWER_BUNCH_KEY = registryKey("bellflower_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_CONEFLOWER_KEY = registryKey("green_coneflower");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FULL_TULIP_BUNCH_KEY = registryKey("full_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> COLORLESS_TULIP_BUNCH_KEY = registryKey("colorless_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> WARM_TULIP_BUNCH_KEY = registryKey("warm_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> COLD_TULIP_BUNCH_KEY = registryKey("cold_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_TULIP_BUNCH_KEY = registryKey("purple_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_TULIP_BUNCH_KEY = registryKey("lime_tulip_bunch");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_CABARET_KEY = registryKey("magenta_cabaret");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_DAHLIA_KEY = registryKey("green_dahlia");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_WOLFSBANE_KEY = registryKey("purple_wolfsbane");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context,
                BLACK_PETUNIA_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.BLACK_PETUNIA.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                RED_PETUNIA_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.RED_PETUNIA.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                PETUNIA_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.RED_PETUNIA.getDefaultState(), 1)
                                .add(ModBlocks.BLACK_PETUNIA.getDefaultState(), 2)),
                        16
                )
        );

        register(context,
                PURPLE_BELLFLOWER_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.PURPLE_BELLFLOWER.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                LIME_BELLFLOWER_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LIME_BELLFLOWER.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                PURPLE_CHIMNEY_BELLFLOWER_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                LIME_CHIMNEY_BELLFLOWER_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                BELLFLOWER_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LIME_BELLFLOWER.getDefaultState(), 2)
                                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.getDefaultState(), 1)
                                .add(ModBlocks.PURPLE_BELLFLOWER.getDefaultState(), 2)
                                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.getDefaultState(), 1)),
                        32
                )
        );

        register(context,
                GREEN_CONEFLOWER_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.GREEN_CONEFLOWER.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                FULL_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(Blocks.WHITE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.LIGHT_GRAY_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.GRAY_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.BLACK_TULIP.getDefaultState(), 1)
                                .add(Blocks.RED_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.BROWN_TULIP.getDefaultState(), 1)
                                .add(Blocks.ORANGE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.YELLOW_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.LIME_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.GREEN_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.CYAN_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.LIGHT_BLUE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.BLUE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.PURPLE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.MAGENTA_TULIP.getDefaultState(), 1)
                                .add(Blocks.PINK_TULIP.getDefaultState(), 1)),
                        36
                )
        );

        register(context,
                COLORLESS_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(Blocks.WHITE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.LIGHT_GRAY_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.GRAY_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.BLACK_TULIP.getDefaultState(), 1)),
                        32
                )
        );

        register(context,
                WARM_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(Blocks.RED_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.BROWN_TULIP.getDefaultState(), 1)
                                .add(Blocks.ORANGE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.YELLOW_TULIP.getDefaultState(), 1)),
                        32
                )
        );

        register(context,
                COLD_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.BLUE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.LIGHT_BLUE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.CYAN_TULIP.getDefaultState(), 1)),
                        24
                )
        );

        register(context,
                PURPLE_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.PURPLE_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.MAGENTA_TULIP.getDefaultState(), 1)
                                .add(Blocks.PINK_TULIP.getDefaultState(), 1)),
                        24
                )
        );

        register(context,
                LIME_TULIP_BUNCH_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.LIME_TULIP.getDefaultState(), 1)
                                .add(ModBlocks.GREEN_TULIP.getDefaultState(), 1)),
                        20
                )
        );

        register(context,
                MAGENTA_CABARET_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.MAGENTA_CABARET.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                GREEN_DAHLIA_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.GREEN_DAHLIA.getDefaultState(), 1)),
                        16
                )
        );

        register(context,
                PURPLE_WOLFSBANE_KEY,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.PURPLE_WOLFSBANE.getDefaultState(), 1)),
                        16
                )
        );

    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Floral.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
