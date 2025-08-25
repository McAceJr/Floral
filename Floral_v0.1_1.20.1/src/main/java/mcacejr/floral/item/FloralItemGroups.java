package mcacejr.floral.item;

import mcacejr.floral.Floral;
import mcacejr.floral.block.FloralBlocks;
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

                        entries.add(FloralBlocks.BLACK_PETUNIA);
                        entries.add(FloralBlocks.RED_PETUNIA);
                        entries.add(FloralBlocks.PURPLE_BELLFLOWER);
                        entries.add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER);
                        entries.add(FloralBlocks.GREEN_CONEFLOWER);
                        entries.add(FloralBlocks.BLUE_AUBRIETAS);

                        entries.add(FloralBlocks.LIGHT_GRAY_TULIP);
                        entries.add(FloralBlocks.GRAY_TULIP);
                        entries.add(FloralBlocks.BLACK_TULIP);
                        entries.add(FloralBlocks.BROWN_TULIP);
                        entries.add(FloralBlocks.YELLOW_TULIP);
                        entries.add(FloralBlocks.LIME_TULIP);
                        entries.add(FloralBlocks.GREEN_TULIP);
                        entries.add(FloralBlocks.CYAN_TULIP);
                        entries.add(FloralBlocks.LIGHT_BLUE_TULIP);
                        entries.add(FloralBlocks.BLUE_TULIP);
                        entries.add(FloralBlocks.PURPLE_TULIP);
                        entries.add(FloralBlocks.MAGENTA_TULIP);

                        entries.add(FloralBlocks.GREEN_DAHLIA);
                        entries.add(FloralBlocks.MAGENTA_CABARET);
                        entries.add(FloralBlocks.LIME_BELLFLOWER);
                        entries.add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER);
                        entries.add(FloralBlocks.PURPLE_WOLFSBANE);

                        entries.add(FloralBlocks.THICK_STALK);
                        entries.add(FloralBlocks.THICK_VINES);
                        entries.add(FloralBlocks.PINK_ALCEA);

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

                        entries.add(FloralBlocks.WEEPING_ROOTS);
                        entries.add(FloralBlocks.TWISTING_ROOTS);
                        entries.add(FloralBlocks.WARDEN_PRIMROSE);
                        entries.add(FloralBlocks.ROCKY_SEDUM);
                        entries.add(FloralBlocks.STEM_LILY);
                        entries.add(FloralBlocks.BONES_BANE);
                        entries.add(FloralBlocks.CHORUS_TULIP);
                        entries.add(FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER);

                        entries.add(FloralItems.TWISTED_WART);

                        entries.add(FloralBlocks.FLORAL_STONE);
                        entries.add(FloralBlocks.FLORAL_STONE_STAIRS);
                        entries.add(FloralBlocks.FLORAL_STONE_SLAB);
                        entries.add(FloralBlocks.FLORAL_STONE_WALL);
                        entries.add(FloralBlocks.FLORAL_STONE_BRICKS);
                        entries.add(FloralBlocks.FLORAL_STONE_BRICK_STAIRS);
                        entries.add(FloralBlocks.FLORAL_STONE_BRICK_SLAB);
                        entries.add(FloralBlocks.FLORAL_STONE_BRICK_WALL);
                        entries.add(FloralBlocks.COBBLED_FLORAL_STONE);
                        entries.add(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS);
                        entries.add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB);
                        entries.add(FloralBlocks.COBBLED_FLORAL_STONE_WALL);

                        entries.add(FloralBlocks.STEM_LOG);
                        entries.add(FloralBlocks.STEM_WOOD);
                        entries.add(FloralBlocks.STRIPPED_STEM_LOG);
                        entries.add(FloralBlocks.STRIPPED_STEM_WOOD);
                        entries.add(FloralBlocks.STEM_PLANKS);
                        entries.add(FloralBlocks.STEM_STAIRS);
                        entries.add(FloralBlocks.STEM_SLAB);
                        entries.add(FloralBlocks.STEM_FENCE);
                        entries.add(FloralBlocks.STEM_FENCE_GATE);
                        entries.add(FloralBlocks.STEM_TRAPDOOR);
                        entries.add(FloralBlocks.STEM_DOOR);
                        entries.add(FloralBlocks.STEM_BUTTON);
                        entries.add(FloralBlocks.STEM_PRESSURE_PLATE);

                    }).build());

    public static void registerItemGroups(){

        Floral.LOGGER.info("Registering Item Groups for "+ Floral.MOD_ID);

    }


}
