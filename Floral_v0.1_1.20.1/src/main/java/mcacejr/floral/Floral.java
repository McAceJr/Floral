package mcacejr.floral;

import mcacejr.floral.block.FloralBlocks;
import mcacejr.floral.enchantment.FloralEnchantments;
import mcacejr.floral.entity.effect.DeathPrickStatusEffect;
import mcacejr.floral.item.FloralItemGroups;
import mcacejr.floral.item.FloralItems;
import mcacejr.floral.world.gen.FloralWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Floral implements ModInitializer {
	public static final String MOD_ID = "floral";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final StatusEffect DEATH_PRICK = new DeathPrickStatusEffect();

	@Override
	public void onInitialize() {

		FloralItems.registerModItems();

		FloralBlocks.registerModBlocks();

		FloralItemGroups.registerItemGroups();

		FloralWorldGen.generateModWorldGen();

		FloralEnchantments.init();

		Registry.register(Registries.STATUS_EFFECT, new Identifier("floral", "death_prick"), DEATH_PRICK);


		LOGGER.info("Adding blocks to StrippableBlockRegistry");
		StrippableBlockRegistry.register(FloralBlocks.STEM_LOG, FloralBlocks.STRIPPED_STEM_LOG);
		StrippableBlockRegistry.register(FloralBlocks.STEM_WOOD, FloralBlocks.STRIPPED_STEM_WOOD);

		LOGGER.info("Adding blocks to FlammableBlockRegistry");
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STRIPPED_STEM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STRIPPED_STEM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_BUTTON, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(FloralBlocks.STEM_DOOR, 5, 20);
	}

}