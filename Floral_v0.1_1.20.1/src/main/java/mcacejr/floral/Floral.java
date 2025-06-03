package mcacejr.floral;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.enchantment.FloralEnchantments;
import mcacejr.floral.item.ModItemGroups;
import mcacejr.floral.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Floral implements ModInitializer {
	public static final String MOD_ID = "floral";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();

		FloralEnchantments.init();

	}
}