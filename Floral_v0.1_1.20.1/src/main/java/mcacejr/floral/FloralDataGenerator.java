package mcacejr.floral;

import mcacejr.floral.datagen.*;
import mcacejr.floral.world.FloralConfiguredFeatures;
import mcacejr.floral.world.FloralPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class FloralDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(FloralRecipeProvider::new);
		pack.addProvider(FloralModelProvider::new);
		pack.addProvider(FloralLootTableProvider::new);
		pack.addProvider(FloralItemTagProvider::new);
		pack.addProvider(FloralBlockTagProvider::new);
		pack.addProvider(FloralRegistryDataGenerator::new);
        pack.addProvider(FloralAdvancementProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, FloralConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, FloralPlacedFeatures::bootstrap);
	}
}
