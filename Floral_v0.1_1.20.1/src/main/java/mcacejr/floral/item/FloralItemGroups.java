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

public class FloralItemGroups {

    public static final ItemGroup FLORAL_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Floral.MOD_ID, "floral_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.floral_tab"))
                    .icon(() -> new ItemStack(FloralItems.FLORAL_CROWN)).entries((displayContext, entries) -> {

                        entries.add(FloralItems.FLORAL_CROWN);

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

                        entries.add(FloralItems.FLOWER_BLEND);

                        entries.add(FloralItems.PETUNIA_LANCE);
                        entries.add(FloralItems.CORPSE_BLOSSOM);
                        entries.add(FloralItems.FLOWER_TRIMMER);
                        entries.add(FloralItems.DEADHEADER);
                        entries.add(FloralItems.FLORAL_BANE);

                        entries.add(FloralItems.WHITE_PETAL);
                        entries.add(FloralItems.LIGHT_GRAY_PETAL);
                        entries.add(FloralItems.GRAY_PETAL);
                        entries.add(FloralItems.BLACK_PETAL);
                        entries.add(FloralItems.RED_PETAL);
                        entries.add(FloralItems.ORANGE_PETAL);
                        entries.add(FloralItems.BROWN_PETAL);
                        entries.add(FloralItems.YELLOW_PETAL);
                        entries.add(FloralItems.LIME_PETAL);
                        entries.add(FloralItems.GREEN_PETAL);
                        entries.add(FloralItems.CYAN_PETAL);
                        entries.add(FloralItems.LIGHT_BLUE_PETAL);
                        entries.add(FloralItems.BLUE_PETAL);
                        entries.add(FloralItems.PURPLE_PETAL);
                        entries.add(FloralItems.MAGENTA_PETAL);
                        entries.add(FloralItems.PINK_PETAL);
                        entries.add(FloralItems.WITHERED_PETAL);
                        entries.add(FloralItems.BONES_BANE_PETAL);

                        entries.add(ModBlocks.WEEPING_ROOTS);
                        entries.add(ModBlocks.TWISTING_ROOTS);
                        entries.add(ModBlocks.WARDEN_PRIMROSE);
                        entries.add(ModBlocks.ROCKY_SEDUM);
                        entries.add(ModBlocks.STEM_LILY);
                        entries.add(ModBlocks.BONES_BANE);
                        entries.add(ModBlocks.CHORUS_TULIP);
                        entries.add(ModBlocks.WHITE_OVERFLOWING_BELLFLOWER);

                        entries.add(FloralItems.TWISTED_WART);

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

                    }).build());

    public static void registerItemGroups(){

        Floral.LOGGER.info("Registering Item Groups for "+ Floral.MOD_ID);

    }


}
