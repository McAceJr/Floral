package mcacejr.floral.item;

import mcacejr.floral.Floral;
import mcacejr.floral.item.custom.ArmorWithEffect;
import mcacejr.floral.item.custom.CorpseBlossomSword;
import mcacejr.floral.item.custom.CraftingSword;
import mcacejr.floral.item.custom.FlowerBlendItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLORAL_CROWN = registerItem("floral_crown",
            new ArmorWithEffect(ModArmorMaterials.FLORAL, ArmorItem.Type.HELMET,
                    new FabricItemSettings(), ModArmorMaterials.FLORAL_ARMOR_EFFECT));

    public static final Item PETUNIA_LANCE = registerItem("petunia_lance",
            new SwordItem(ModToolMaterials.PETUNIA, 3, -1.8f, new FabricItemSettings()));

    public static final Item CORPSE_BLOSSOM = registerItem("corpse_blossom",
            new CorpseBlossomSword(ModToolMaterials.PETUNIA, 3, -1f, new FabricItemSettings()));

    public static final Item FLOWER_BLEND = registerItem("flower_blend",
            new FlowerBlendItem(new FabricItemSettings()));

    public static final Item FLOWER_TRIMMER = registerItem("flower_trimmer",
            new CraftingSword(ToolMaterials.IRON, 0, -2.4f, new FabricItemSettings()));
    public static final Item DEADHEADER = registerItem("deadheader",
            new CraftingSword(ModToolMaterials.DEADHEADER, 7, -3.0f, new FabricItemSettings()));

    public static final Item WHITE_PETAL = registerItem("white_petal",
            new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_PETAL = registerItem("light_gray_petal",
            new Item(new FabricItemSettings()));
    public static final Item GRAY_PETAL = registerItem("gray_petal",
            new Item(new FabricItemSettings()));
    public static final Item BLACK_PETAL = registerItem("black_petal",
            new Item(new FabricItemSettings()));
    public static final Item RED_PETAL = registerItem("red_petal",
            new Item(new FabricItemSettings()));
    public static final Item ORANGE_PETAL = registerItem("orange_petal",
            new Item(new FabricItemSettings()));
    public static final Item BROWN_PETAL = registerItem("brown_petal",
            new Item(new FabricItemSettings()));
    public static final Item YELLOW_PETAL = registerItem("yellow_petal",
            new Item(new FabricItemSettings()));
    public static final Item LIME_PETAL = registerItem("lime_petal",
            new Item(new FabricItemSettings()));
    public static final Item GREEN_PETAL = registerItem("green_petal",
            new Item(new FabricItemSettings()));
    public static final Item CYAN_PETAL = registerItem("cyan_petal",
            new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_PETAL = registerItem("light_blue_petal",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_PETAL = registerItem("blue_petal",
            new Item(new FabricItemSettings()));
    public static final Item PURPLE_PETAL = registerItem("purple_petal",
            new Item(new FabricItemSettings()));
    public static final Item MAGENTA_PETAL = registerItem("magenta_petal",
            new Item(new FabricItemSettings()));
    public static final Item PINK_PETAL = registerItem("pink_petal",
            new Item(new FabricItemSettings()));
    public static final Item WITHERED_PETAL = registerItem("withered_petal",
            new Item(new FabricItemSettings()));

    public static final Item TWISTED_WART = registerItem("twisted_wart",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Floral.MOD_ID, name), item);

    }

    public static void registerModItems() {

        Floral.LOGGER.info("Registering Mod Items" + Floral.MOD_ID);

    }

}
