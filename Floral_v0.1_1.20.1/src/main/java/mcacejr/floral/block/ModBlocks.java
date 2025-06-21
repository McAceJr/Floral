package mcacejr.floral.block;

import mcacejr.floral.Floral;
import mcacejr.floral.block.custom.*;
import mcacejr.floral.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLACK_PETUNIA = registerBlock("black_petunia",
            new FlowerBlock(StatusEffects.WEAKNESS, 10,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_BLACK_PETUNIA = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_black_petunia"),
            new FlowerPotBlock(BLACK_PETUNIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block RED_PETUNIA = registerBlock("red_petunia",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_RED_PETUNIA = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_red_petunia"),
            new FlowerPotBlock(RED_PETUNIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block PURPLE_BELLFLOWER = registerBlock("purple_bellflower",
            new FlowerBlock(StatusEffects.LEVITATION, 7,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_BELLFLOWER = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_purple_bellflower"),
            new FlowerPotBlock(PURPLE_BELLFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block GREEN_CONEFLOWER = registerBlock("green_coneflower",
            new FlowerBlock(StatusEffects.LUCK, 10,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_GREEN_CONEFLOWER = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_greed_coneflower"),
            new FlowerPotBlock(GREEN_CONEFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block PURPLE_CHIMNEY_BELLFLOWER = registerBlock("purple_chimney_bellflower",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    public static final Block BLUE_AUBRIETAS = registerBlock("blue_aubrietas",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS).nonOpaque().noCollision()));

    public static final Block THICK_STALK = registerBlock("thick_stalk",
            new ThickStalkBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES).nonOpaque().noCollision(),
                    false, 0.1f));
    public static final Block THICK_STALK_PLANT = registerBlock("thick_stalk_plant",
            new ThickStalkPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).nonOpaque().noCollision()));

    public static final Block THICK_VINES = registerBlock("thick_vines",
            new ThickVineBlock(FabricBlockSettings.copyOf(Blocks.WEEPING_VINES).nonOpaque().noCollision(),
                    false, 0.1f));
    public static final Block THICK_VINES_PLANT = registerBlock("thick_vines_plant",
            new ThickVinePlantBlock(FabricBlockSettings.copyOf(Blocks.WEEPING_VINES_PLANT).nonOpaque().noCollision()));

    public static final Block PINK_ALCEA = registerBlock("pink_alcea",
            new PinkAlceaBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES).nonOpaque().noCollision(),
                    false, 0.1f));
    public static final Block PINK_ALCEA_PLANT = registerBlock("pink_alcea_plant",
            new PinkAlceaPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).nonOpaque().noCollision()));

    public static final Block LIGHT_GRAY_TULIP = registerBlock("light_gray_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_LIGHT_GRAY_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_light_gray_tulip"),
            new FlowerPotBlock(LIGHT_GRAY_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block GRAY_TULIP = registerBlock("gray_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_GRAY_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_gray_tulip"),
            new FlowerPotBlock(GRAY_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block BLACK_TULIP = registerBlock("black_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_BLACK_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_black_tulip"),
            new FlowerPotBlock(BLACK_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block BROWN_TULIP = registerBlock("brown_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_BROWN_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_brown_tulip"),
            new FlowerPotBlock(BROWN_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block YELLOW_TULIP = registerBlock("yellow_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_yellow_tulip"),
            new FlowerPotBlock(YELLOW_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block LIME_TULIP = registerBlock("lime_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_LIME_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_lime_tulip"),
            new FlowerPotBlock(LIME_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block GREEN_TULIP = registerBlock("green_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_GREEN_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_green_tulip"),
            new FlowerPotBlock(GREEN_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block CYAN_TULIP = registerBlock("cyan_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_CYAN_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_cyan_tulip"),
            new FlowerPotBlock(CYAN_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block LIGHT_BLUE_TULIP = registerBlock("light_blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_LIGHT_BLUE_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_light_blue_tulip"),
            new FlowerPotBlock(LIGHT_BLUE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block BLUE_TULIP = registerBlock("blue_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_BLUE_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_blue_tulip"),
            new FlowerPotBlock(BLUE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block PURPLE_TULIP = registerBlock("purple_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_purple_tulip"),
            new FlowerPotBlock(PURPLE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block MAGENTA_TULIP = registerBlock("magenta_tulip",
            new FlowerBlock(StatusEffects.WEAKNESS, 7, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_TULIP = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_magenta_tulip"),
            new FlowerPotBlock(MAGENTA_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP).nonOpaque()));

    public static final Block GREEN_DAHLIA = registerBlock("green_dahlia",
            new FlowerBlock(StatusEffects.SATURATION, 7, FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_GREEN_DAHLIA = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_green_dahlia"),
            new FlowerPotBlock(GREEN_DAHLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block MAGENTA_CABARET = registerBlock("magenta_cabaret",
            new FlowerBlock(StatusEffects.SATURATION, 7, FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_CABARET = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_magenta_cabaret"),
            new FlowerPotBlock(MAGENTA_CABARET, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block LIME_BELLFLOWER = registerBlock("lime_bellflower",
            new FlowerBlock(StatusEffects.SATURATION, 7, FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_LIME_BELLFLOWER = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_lime_bellflower"),
            new FlowerPotBlock(LIME_BELLFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block LIME_CHIMNEY_BELLFLOWER = registerBlock("lime_chimney_bellflower",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH)));

    public static final Block FLORAL_STONE = registerBlock("floral_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLORAL_STONE_BRICKS = registerBlock("floral_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block COBBLED_FLORAL_STONE = registerBlock("cobbled_floral_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block FLORAL_STONE_STAIRS = registerBlock("floral_stone_stairs",
            new StairsBlock(ModBlocks.FLORAL_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block FLORAL_STONE_SLAB = registerBlock("floral_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block FLORAL_STONE_WALL = registerBlock("floral_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block FLORAL_STONE_BRICK_STAIRS = registerBlock("floral_stone_brick_stairs",
            new StairsBlock(ModBlocks.FLORAL_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block FLORAL_STONE_BRICK_SLAB = registerBlock("floral_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block FLORAL_STONE_BRICK_WALL = registerBlock("floral_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block COBBLED_FLORAL_STONE_STAIRS = registerBlock("cobbled_floral_stone_stairs",
            new StairsBlock(ModBlocks.COBBLED_FLORAL_STONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
    public static final Block COBBLED_FLORAL_STONE_SLAB = registerBlock("cobbled_floral_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
    public static final Block COBBLED_FLORAL_STONE_WALL = registerBlock("cobbled_floral_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));

    public static final Block STEM_LOG = registerBlock("stem_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block STEM_WOOD = registerBlock("stem_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_STEM_LOG = registerBlock("stripped_stem_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_STEM_WOOD = registerBlock("stripped_stem_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block STEM_PLANKS = registerBlock("stem_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block STEM_STAIRS = registerBlock("stem_stairs",
            new StairsBlock(ModBlocks.STEM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block STEM_SLAB = registerBlock("stem_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block STEM_FENCE = registerBlock("stem_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block STEM_FENCE_GATE = registerBlock("stem_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));
    public static final Block STEM_TRAPDOOR = registerBlock("stem_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));
    public static final Block STEM_DOOR = registerBlock("stem_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block STEM_BUTTON = registerBlock("stem_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON),
                    BlockSetType.CHERRY, 10, true));
    public static final Block STEM_PRESSURE_PLATE = registerBlock("stem_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));

    public static final Block PURPLE_WOLFSBANE = registerBlock("purple_wolfsbane",
            new FlowerBlock(Floral.DEATH_PRICK, 100, FabricBlockSettings.copyOf(Blocks.ALLIUM)
                    .nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_WOLFSBANE = Registry.register(Registries.BLOCK,
            new Identifier(Floral.MOD_ID, "potted_purple_wolfsbane"),
            new FlowerPotBlock(PURPLE_WOLFSBANE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));



    //
    // Floral Bloom Material Flowers
    //

    // Tier 0 Harvestable Flowers

    public static final Block ROCKY_SEDUM = registerBlock("rocky_sedum",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), COBBLED_FLORAL_STONE.asItem()));
    public static final Block STEM_LILY = registerBlock("stem_lily",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), STEM_LOG.asItem()));
    public static final Block SNOWY_CABARET = registerBlock("snowy_cabaret",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.COLD_PETAL));
    public static final Block DRIED_DAHLIA = registerBlock("dried_dahlia",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.DRIED_PETAL));

    // Tier 1 Harvestable Flowers

    public static final Block TWISTING_ROOTS = registerBlock("twisting_roots",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.TWISTED_WART));
    public static final Block FROSTED_ROSE = registerBlock("frosted_rose",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FROZEN_DUST));
    public static final Block METALLIC_CONEFLOWER = registerBlock("metallic_coneflower",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FLOWERING_INGOT));
    public static final Block BURNING_PETUNIA = registerBlock("burning_petunia",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.BLAZING_PETAL));

    // Tier 2 Harvestable Flowers

    public static final Block BONES_BANE = registerBlock("bones_bane",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.BONES_BANE_PETAL));
    public static final Block ENDER_CLAM_FLOWER = registerBlock("ender_clam_flower",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FLOWER_PEARL));
    public static final Block SHINY_JASMINE = registerBlock("shiny_jasmine",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FLOWERING_GEM));
    public static final Block PUTTY_PETUNIA = registerBlock("putty_petunia",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FLOWER_BLEND));

    // Tier 3 Harvestable Flowers

    public static final Block CRAFTING_FLOWER = registerBlock("crafting_flower",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).nonOpaque().noCollision()));
    public static final Block POTTED_CRAFTING_FLOWER = registerBlock("crafting_flower",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).nonOpaque().noCollision()));

    //
    // Non Floral Bloom Material Flowers
    //

    // Tier 0 Harvestable Flowers

    public static final Block GLOWING_BELLFLOWER = registerBlock("glowing_bellflower",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.GLOW_BERRIES));
    public static final Block WEEPING_ROOTS = registerBlock("weeping_roots",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.NETHER_WART));
    public static final Block BLAZING_ROSE = registerBlock("blazing_rose",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.BLAZE_POWDER));

    // Tier 1 Harvestable Flowers

    public static final Block GLOWING_ROOTS = registerBlock("glowing_roots",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.GLOWSTONE_DUST));
    public static final Block SHARD_OXALIS = registerBlock("blazing_rose",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.QUARTZ));

    // Tier 2 Harvestable Flowers

    public static final Block GREEN_OVERFLOWING_BELLFLOWER = registerBlock("green_overflowing_bellflower",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), ModItems.FLOWER_BLEND));
    public static final Block WARDEN_PRIMROSE = registerBlock("warden_primrose",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.ECHO_SHARD));
    public static final Block CHORUS_TULIP = registerBlock("chorus_tulip",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.CHORUS_FRUIT));

    // Tier 3 Harvestable Flowers

    public static final Block WHITE_OVERFLOWING_BELLFLOWER = registerBlock("white_overflowing_bellflower",
            new FloralHarvestableBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH), Items.BONE_MEAL));


    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Floral.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(Floral.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks() {

        Floral.LOGGER.info("Registering ModBlocks for " + Floral.MOD_ID);

    }

}
