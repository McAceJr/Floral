package mcacejr.floral.item;

import mcacejr.floral.Floral;
import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.enchantment.FloralEnchantments;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FLORAL_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Floral.MOD_ID, "floral_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.floral_tab"))
                    .icon(() -> new ItemStack(ModItems.FLORAL_CROWN)).entries((displayContext, entries) -> {

                        entries.add(ModItems.FLORAL_CROWN);

                        entries.add(ModBlocks.BLACK_PETUNIA);
                        entries.add(ModBlocks.RED_PETUNIA);
                        entries.add(ModBlocks.PURPLE_BELLFLOWER);
                        entries.add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER);
                        entries.add(ModBlocks.GREEN_CONEFLOWER);

                        entries.add(ModItems.PETUNIA_LANCE);
                        entries.add(ModItems.CORPSE_BLOSSOM);

                    }).build());

    public static void registerItemGroups(){

        Floral.LOGGER.info("Registering Item Groups for "+ Floral.MOD_ID);

    }


}
