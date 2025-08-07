package mcacejr.floral.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

public class ModPlacedFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_DEFAULT = ConfiguredFeatures.of("floral_flower_default");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_FLOWER_FOREST = ConfiguredFeatures.of("floral_flower_flower_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_SWAMP = ConfiguredFeatures.of("floral_flower_swamp");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_PLAIN = ConfiguredFeatures.of("floral_flower_plain");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLORAL_FLOWER_MEADOW = ConfiguredFeatures.of("floral_flower_meadow");
    public static final RegistryKey<PlacedFeature> FLORAL_FOREST_FLOWERS = PlacedFeatures.of("floral_forest_flowers");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {

        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry20 = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.FLOWER_DEFAULT);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry21 = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.FLOWER_FLOWER_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry22 = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.FLOWER_SWAMP);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry23 = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.FLOWER_PLAIN);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry24 = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.FLOWER_MEADOW);

    }

}
