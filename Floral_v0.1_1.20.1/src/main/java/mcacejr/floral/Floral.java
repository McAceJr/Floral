package mcacejr.floral;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.enchantment.FloralEnchantments;
import mcacejr.floral.entity.effect.DeathPrickStatusEffect;
import mcacejr.floral.item.ModItemGroups;
import mcacejr.floral.item.ModItems;
import net.fabricmc.api.ModInitializer;

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

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();

		FloralEnchantments.init();

		Registry.register(Registries.STATUS_EFFECT, new Identifier("floral", "death_prick"), DEATH_PRICK);


	}
}