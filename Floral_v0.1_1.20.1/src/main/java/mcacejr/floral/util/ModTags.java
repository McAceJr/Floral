package mcacejr.floral.util;

import mcacejr.floral.Floral;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Floral.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> FLOWER_TRIMMERS = createTag("flower_trimmers");

        public static final TagKey<Item> WHITE_FLOWERS = createTag("white_flowers");
        public static final TagKey<Item> LIGHT_GRAY_FLOWERS = createTag("light_gray_flowers");
        public static final TagKey<Item> GRAY_FLOWERS = createTag("gray_flowers");
        public static final TagKey<Item> BLACK_FLOWERS = createTag("black_flowers");
        public static final TagKey<Item> RED_FLOWERS = createTag("red_flowers");
        public static final TagKey<Item> ORANGE_FLOWERS = createTag("orange_flowers");
        public static final TagKey<Item> BROWN_FLOWERS = createTag("brown_flowers");
        public static final TagKey<Item> YELLOW_FLOWERS = createTag("yellow_flowers");
        public static final TagKey<Item> LIME_FLOWERS = createTag("lime_flowers");
        public static final TagKey<Item> GREEN_FLOWERS = createTag("green_flowers");
        public static final TagKey<Item> CYAN_FLOWERS = createTag("cyan_flowers");
        public static final TagKey<Item> LIGHT_BLUE_FLOWERS = createTag("light_blue_flowers");
        public static final TagKey<Item> BLUE_FLOWERS = createTag("blue_flowers");
        public static final TagKey<Item> PURPLE_FLOWERS = createTag("purple_flowers");
        public static final TagKey<Item> MAGENTA_FLOWERS = createTag("magenta_flowers");
        public static final TagKey<Item> PINK_FLOWERS = createTag("pink_flowers");

        public static final TagKey<Item> TALL_WHITE_FLOWERS = createTag("tall_white_flowers");
        public static final TagKey<Item> TALL_LIGHT_GRAY_FLOWERS = createTag("tall_light_gray_flowers");
        public static final TagKey<Item> TALL_GRAY_FLOWERS = createTag("tall_gray_flowers");
        public static final TagKey<Item> TALL_BLACK_FLOWERS = createTag("tall_black_flowers");
        public static final TagKey<Item> TALL_RED_FLOWERS = createTag("tall_red_flowers");
        public static final TagKey<Item> TALL_ORANGE_FLOWERS = createTag("tall_orange_flowers");
        public static final TagKey<Item> TALL_BROWN_FLOWERS = createTag("tall_brown_flowers");
        public static final TagKey<Item> TALL_YELLOW_FLOWERS = createTag("tall_yellow_flowers");
        public static final TagKey<Item> TALL_LIME_FLOWERS = createTag("tall_lime_flowers");
        public static final TagKey<Item> TALL_GREEN_FLOWERS = createTag("tall_green_flowers");
        public static final TagKey<Item> TALL_CYAN_FLOWERS = createTag("tall_cyan_flowers");
        public static final TagKey<Item> TALL_LIGHT_BLUE_FLOWERS = createTag("tall_light_blue_flowers");
        public static final TagKey<Item> TALL_BLUE_FLOWERS = createTag("tall_blue_flowers");
        public static final TagKey<Item> TALL_PURPLE_FLOWERS = createTag("tall_purple_flowers");
        public static final TagKey<Item> TALL_MAGENTA_FLOWERS = createTag("tall_magenta_flowers");
        public static final TagKey<Item> TALL_PINK_FLOWERS = createTag("tall_pink_flowers");

        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Floral.MOD_ID, name));
        }

    }

}
