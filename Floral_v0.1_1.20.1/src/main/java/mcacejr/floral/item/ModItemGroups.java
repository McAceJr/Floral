package mcacejr.floral.item;

import mcacejr.floral.Floral;
import mcacejr.floral.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
                        entries.add(ModBlocks.BLUE_AUBRIETAS);

                        entries.add(ModBlocks.LIGHT_GRAY_TULIP);
                        entries.add(ModBlocks.GRAY_TULIP);
                        entries.add(ModBlocks.BLACK_TULIP);
                        entries.add(ModBlocks.BROWN_TULIP);
                        entries.add(ModBlocks.YELLOW_TULIP);
                        entries.add(ModBlocks.LIME_TULIP);
                        entries.add(ModBlocks.GREEN_TULIP);
                        entries.add(ModBlocks.CYAN_TULIP);
                        entries.add(ModBlocks.LIGHT_BLUE_TULIP);
                        entries.add(ModBlocks.BLUE_TULIP);
                        entries.add(ModBlocks.PURPLE_TULIP);
                        entries.add(ModBlocks.MAGENTA_TULIP);

                        entries.add(ModBlocks.GREEN_DAHLIA);
                        entries.add(ModBlocks.MAGENTA_CABARET);
                        entries.add(ModBlocks.LIME_BELLFLOWER);
                        entries.add(ModBlocks.LIME_CHIMNEY_BELLFLOWER);
                        entries.add(ModBlocks.PURPLE_WOLFSBANE);

                        entries.add(ModBlocks.THICK_STALK);
                        entries.add(ModBlocks.THICK_VINES);
                        entries.add(ModBlocks.PINK_ALCEA);

                        entries.add(ModItems.FLOWER_BLEND);

                        entries.add(ModItems.PETUNIA_LANCE);
                        entries.add(ModItems.CORPSE_BLOSSOM);
                        entries.add(ModItems.FLOWER_TRIMMER);
                        entries.add(ModItems.DEADHEADER);
                        entries.add(ModItems.FLORAL_BANE);

                        entries.add(ModItems.WHITE_PETAL);
                        entries.add(ModItems.LIGHT_GRAY_PETAL);
                        entries.add(ModItems.GRAY_PETAL);
                        entries.add(ModItems.BLACK_PETAL);
                        entries.add(ModItems.RED_PETAL);
                        entries.add(ModItems.ORANGE_PETAL);
                        entries.add(ModItems.BROWN_PETAL);
                        entries.add(ModItems.YELLOW_PETAL);
                        entries.add(ModItems.LIME_PETAL);
                        entries.add(ModItems.GREEN_PETAL);
                        entries.add(ModItems.CYAN_PETAL);
                        entries.add(ModItems.LIGHT_BLUE_PETAL);
                        entries.add(ModItems.BLUE_PETAL);
                        entries.add(ModItems.PURPLE_PETAL);
                        entries.add(ModItems.MAGENTA_PETAL);
                        entries.add(ModItems.PINK_PETAL);
                        entries.add(ModItems.WITHERED_PETAL);
                        entries.add(ModItems.BONES_BANE_PETAL);

                        entries.add(ModBlocks.WEEPING_ROOTS);
                        entries.add(ModBlocks.TWISTING_ROOTS);
                        entries.add(ModBlocks.WARDEN_PRIMROSE);
                        entries.add(ModBlocks.ROCKY_SEDUM);
                        entries.add(ModBlocks.STEM_LILY);
                        entries.add(ModBlocks.BONES_BANE);

                        entries.add(ModItems.TWISTED_WART);

                        entries.add(ModBlocks.FLORAL_STONE);
                        entries.add(ModBlocks.FLORAL_STONE_STAIRS);
                        entries.add(ModBlocks.FLORAL_STONE_SLAB);
                        entries.add(ModBlocks.FLORAL_STONE_WALL);
                        entries.add(ModBlocks.FLORAL_STONE_BRICKS);
                        entries.add(ModBlocks.FLORAL_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.FLORAL_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.FLORAL_STONE_BRICK_WALL);
                        entries.add(ModBlocks.COBBLED_FLORAL_STONE);
                        entries.add(ModBlocks.COBBLED_FLORAL_STONE_STAIRS);
                        entries.add(ModBlocks.COBBLED_FLORAL_STONE_SLAB);
                        entries.add(ModBlocks.COBBLED_FLORAL_STONE_WALL);

                        entries.add(ModBlocks.STEM_LOG);
                        entries.add(ModBlocks.STEM_WOOD);
                        entries.add(ModBlocks.STRIPPED_STEM_LOG);
                        entries.add(ModBlocks.STRIPPED_STEM_WOOD);
                        entries.add(ModBlocks.STEM_PLANKS);
                        entries.add(ModBlocks.STEM_STAIRS);
                        entries.add(ModBlocks.STEM_SLAB);
                        entries.add(ModBlocks.STEM_FENCE);
                        entries.add(ModBlocks.STEM_FENCE_GATE);
                        entries.add(ModBlocks.STEM_TRAPDOOR);
                        entries.add(ModBlocks.STEM_DOOR);
                        entries.add(ModBlocks.STEM_BUTTON);
                        entries.add(ModBlocks.STEM_PRESSURE_PLATE);

                        entries.add(ModItems.FLORAL_BLOOM_TIER_1);
                        entries.add(ModItems.FLORAL_BLOOM_TIER_2);
                        entries.add(ModItems.FLORAL_BLOOM_TIER_3);

                    }).build());

    public static void registerItemGroups(){

        Floral.LOGGER.info("Registering Item Groups for "+ Floral.MOD_ID);

    }


}
