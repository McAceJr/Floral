package mcacejr.floral.world;

import mcacejr.floral.Floral;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> BLACK_PETUNIA_PLACED_KEY = registerKey("black_petunia_placed");

    public static final RegistryKey<PlacedFeature> RED_PETUNIA_PLACED_KEY = registerKey("red_petunia_placed");

    public static final RegistryKey<PlacedFeature> PETUNIA_BUNCH_PLACED_KEY = registerKey("petunia_bunch_placed");

    public static final RegistryKey<PlacedFeature> PURPLE_BELLFLOWER_PLACED_KEY = registerKey("purple_bellflower_placed");

    public static final RegistryKey<PlacedFeature> LIME_BELLFLOWER_PLACED_KEY = registerKey("lime_bellflower_placed");

    public static final RegistryKey<PlacedFeature> PURPLE_CHIMNEY_BELLFLOWER_PLACED_KEY = registerKey("purple_chimney_bellflower_placed");

    public static final RegistryKey<PlacedFeature> LIME_CHIMNEY_BELLFLOWER_PLACED_KEY = registerKey("lime_chimney_bellflower_placed");

    public static final RegistryKey<PlacedFeature> BELLFLOWER_BUNCH_PLACED_KEY = registerKey("bellflower_bunch_placed");

    public static final RegistryKey<PlacedFeature> GREEN_CONEFLOWER_PLACED_KEY = registerKey("green_coneflower_placed");

    public static final RegistryKey<PlacedFeature> FULL_TULIP_BUNCH_PLACED_KEY = registerKey("full_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> COLORLESS_TULIP_BUNCH_PLACED_KEY = registerKey("colorless_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> WARM_TULIP_BUNCH_PLACED_KEY = registerKey("warm_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> COLD_TULIP_BUNCH_PLACED_KEY = registerKey("cold_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> PURPLE_TULIP_BUNCH_PLACED_KEY = registerKey("purple_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> LIME_TULIP_BUNCH_PLACED_KEY = registerKey("lime_tulip_bunch_placed");

    public static final RegistryKey<PlacedFeature> MAGENTA_CABARET_PLACED_KEY = registerKey("magenta_cabaret_placed");

    public static final RegistryKey<PlacedFeature> GREEN_DAHLIA_PLACED_KEY = registerKey("green_dahlia_placed");

    public static final RegistryKey<PlacedFeature> PURPLE_WOLFSBANE_PLACED_KEY = registerKey("purple_wolfsbane_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BLACK_PETUNIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_PETUNIA_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, RED_PETUNIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_PETUNIA_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, PETUNIA_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PETUNIA_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, PURPLE_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_BELLFLOWER_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, PURPLE_CHIMNEY_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHIMNEY_BELLFLOWER_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, LIME_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_BELLFLOWER_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, LIME_CHIMNEY_BELLFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_CHIMNEY_BELLFLOWER_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, BELLFLOWER_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BELLFLOWER_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, GREEN_CONEFLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CONEFLOWER_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, FULL_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FULL_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, COLORLESS_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COLORLESS_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, WARM_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARM_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, COLD_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COLD_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, PURPLE_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, LIME_TULIP_BUNCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIME_TULIP_BUNCH_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, MAGENTA_CABARET_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGENTA_CABARET_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, GREEN_DAHLIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_DAHLIA_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        register(context, PURPLE_WOLFSBANE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_WOLFSBANE_KEY),
                RarityFilterPlacementModifier.of(16),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Floral.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
