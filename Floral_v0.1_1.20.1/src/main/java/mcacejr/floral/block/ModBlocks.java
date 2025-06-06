package mcacejr.floral.block;

import mcacejr.floral.Floral;
import mcacejr.floral.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
                    ModBlocks.THICK_STALK_PLANT, false, 0.1f));
    public static final Block THICK_STALK_PLANT = registerBlock("thick_stalk_plant",
            new ThickStalkPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).nonOpaque().noCollision(),
                    ModBlocks.THICK_STALK, false));

    public static final Block THICK_VINES = registerBlock("thick_vines",
            new ThickVineBlock(FabricBlockSettings.copyOf(Blocks.WEEPING_VINES).nonOpaque().noCollision(),
                    ModBlocks.THICK_VINES_PLANT, false, 0.1f));
    public static final Block THICK_VINES_PLANT = registerBlock("thick_vines_plant",
            new ThickVinePlantBlock(FabricBlockSettings.copyOf(Blocks.WEEPING_VINES_PLANT).nonOpaque().noCollision(),
                    ModBlocks.THICK_VINES, false));

    public static final Block PINK_ALCEA = registerBlock("pink_alcea",
            new PinkAlceaBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES).nonOpaque().noCollision(),
                    ModBlocks.PINK_ALCEA_PLANT, false, 0.1f));
    public static final Block PINK_ALCEA_PLANT = registerBlock("pink_alcea_plant",
            new PinkAlceaPlantBlock(FabricBlockSettings.copyOf(Blocks.TWISTING_VINES_PLANT).nonOpaque().noCollision(),
                    ModBlocks.PINK_ALCEA, false));


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
