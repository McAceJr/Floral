package mcacejr.floral.world;


import mcacejr.floral.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_DEFAULT = ConfiguredFeatures.of("floral_flower_default");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_FLOWER_FOREST = ConfiguredFeatures.of("floral_flower_flower_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_SWAMP = ConfiguredFeatures.of("floral_flower_swamp");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_PLAIN = ConfiguredFeatures.of("floral_flower_plain");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_MEADOW = ConfiguredFeatures.of("floral_flower_meadow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FOREST_FLOWERS = ConfiguredFeatures.of("floral_forest_flowers");

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FLOWER_DEFAULT,
                Feature.FLOWER,
                createRandomPatchFeatureConfig(
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.BLACK_PETUNIA.getDefaultState(), 2).add(ModBlocks.RED_PETUNIA.getDefaultState(), 1)), 64
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FLOWER_FLOWER_FOREST,
                Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        96,
                        6,
                        2,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        new NoiseBlockStateProvider(
                                                2345L,
                                                new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                                0.020833334F,
                                                List.of(
                                                        ModBlocks.MAGENTA_CABARET.getDefaultState(),
                                                        ModBlocks.GREEN_DAHLIA.getDefaultState(),
                                                        ModBlocks.PURPLE_BELLFLOWER.getDefaultState(),
                                                        ModBlocks.LIGHT_BLUE_TULIP.getDefaultState(),
                                                        ModBlocks.BLUE_TULIP.getDefaultState(),
                                                        ModBlocks.BLACK_TULIP.getDefaultState(),
                                                        ModBlocks.YELLOW_TULIP.getDefaultState(),
                                                        ModBlocks.GREEN_TULIP.getDefaultState(),
                                                        ModBlocks.BROWN_TULIP.getDefaultState(),
                                                        ModBlocks.LIME_BELLFLOWER.getDefaultState()
                                                )
                                        )
                                )
                        )
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FLOWER_SWAMP,
                Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GREEN_CONEFLOWER)))
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FLOWER_PLAIN,
                Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        6,
                        2,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        new NoiseThresholdBlockStateProvider(
                                                2345L,
                                                new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                                                0.005F,
                                                -0.8F,
                                                0.33333334F,
                                                ModBlocks.MAGENTA_TULIP.getDefaultState(),
                                                List.of(
                                                        ModBlocks.LIGHT_GRAY_TULIP.getDefaultState(), ModBlocks.GRAY_TULIP.getDefaultState(), ModBlocks.PURPLE_TULIP.getDefaultState(), ModBlocks.LIME_TULIP.getDefaultState()
                                                ),
                                                List.of(ModBlocks.RED_PETUNIA.getDefaultState(), ModBlocks.BLUE_AUBRIETAS.getDefaultState(), ModBlocks.MAGENTA_CABARET.getDefaultState(), ModBlocks.PURPLE_BELLFLOWER.getDefaultState())
                                        )
                                )
                        )
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FLOWER_MEADOW,
                Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        96,
                        6,
                        2,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        new DualNoiseBlockStateProvider(
                                                new Range(1, 3),
                                                new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0),
                                                1.0F,
                                                2345L,
                                                new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0),
                                                1.0F,
                                                List.of(
                                                        Blocks.TALL_GRASS.getDefaultState(),
                                                        ModBlocks.BLUE_AUBRIETAS.getDefaultState(),
                                                        ModBlocks.MAGENTA_CABARET.getDefaultState(),
                                                        ModBlocks.GREEN_CONEFLOWER.getDefaultState(),
                                                        ModBlocks.LIME_BELLFLOWER.getDefaultState(),
                                                        ModBlocks.PURPLE_BELLFLOWER.getDefaultState(),
                                                        Blocks.GRASS.getDefaultState()
                                                )
                                        )
                                )
                        )
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                FLORAL_FOREST_FLOWERS,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfig(
                        RegistryEntryList.of(
                                PlacedFeatures.createEntry(
                                        Feature.RANDOM_PATCH,
                                        ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIME_CHIMNEY_BELLFLOWER)))
                                ),
                                PlacedFeatures.createEntry(
                                        Feature.RANDOM_PATCH,
                                        ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER)))
                                )
                        )
                )
        );

    }

}
