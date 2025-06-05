package mcacejr.floral.item;

import mcacejr.floral.Floral;
import mcacejr.floral.item.custom.ArmorWithEffect;
import mcacejr.floral.item.custom.CorpseBlossomSword;
import mcacejr.floral.item.custom.FlowerBlendItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
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

    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(Floral.MOD_ID, name), item);

    }

    public static void registerModItems() {

        Floral.LOGGER.info("Registering Mod Items" + Floral.MOD_ID);

    }

}
