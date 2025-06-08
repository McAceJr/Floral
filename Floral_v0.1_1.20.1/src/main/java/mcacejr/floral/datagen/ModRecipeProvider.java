package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import mcacejr.floral.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    public static void offerPetalRecipe(Consumer<RecipeJsonProvider> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, petalItem, 3)
                .input(ModTags.Items.FLOWER_TRIMMERS)
                .input(flowerItem)
                .criterion(hasItem(ModItems.FLOWER_TRIMMER), conditionsFromItem(ModItems.FLOWER_TRIMMER))
                .criterion(hasItem(ModItems.DEADHEADER), conditionsFromItem(ModItems.DEADHEADER))
                .offerTo(exporter, petalItem + "_from_" + flowerItem.id());

    }

    public static void offerTallPetalRecipe(Consumer<RecipeJsonProvider> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, petalItem, 6)
                .input(ModTags.Items.FLOWER_TRIMMERS)
                .input(flowerItem)
                .criterion(hasItem(ModItems.FLOWER_TRIMMER), conditionsFromItem(ModItems.FLOWER_TRIMMER))
                .criterion(hasItem(ModItems.DEADHEADER), conditionsFromItem(ModItems.DEADHEADER))
                .offerTo(exporter, petalItem + "_from_" + flowerItem.id());

    }

    public static void offerPetalToDyeRecipe(Consumer<RecipeJsonProvider> exporter, Item petalItem, Item dyeItem) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, dyeItem, 1)
                .input(petalItem)
                .criterion(hasItem(petalItem), conditionsFromItem(petalItem))
                .offerTo(exporter, dyeItem + "_from_" + petalItem);

    }

    public static void offerFlowerToDyeRecipe(Consumer<RecipeJsonProvider> exporter, Item flowerItem, Item dyeItem, int count) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, dyeItem, count)
                .input(flowerItem)
                .criterion(hasItem(flowerItem), conditionsFromItem(flowerItem))
                .offerTo(exporter, dyeItem + "_from_" + flowerItem);

    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLOWER_TRIMMER)
                .pattern(" I ")
                .pattern("LSI")
                .pattern("G  ")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .input('L', Items.LEATHER)
                .input('G', Items.GREEN_DYE)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.LEATHER), conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DEADHEADER)
                .pattern("N N")
                .pattern(" T ")
                .pattern("LRL")
                .input('N', Items.NETHERITE_INGOT)
                .input('T', ModItems.FLOWER_TRIMMER)
                .input('L', ModItems.RED_PETAL)
                .input('R', Items.LEATHER)
                .criterion(hasItem(ModItems.FLOWER_TRIMMER), conditionsFromItem(ModItems.FLOWER_TRIMMER))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERED_PETAL)
                .input(ModTags.Items.FLOWER_TRIMMERS)
                .input(Blocks.WITHER_ROSE)
                .criterion(hasItem(ModItems.FLOWER_TRIMMER), conditionsFromItem(ModItems.FLOWER_TRIMMER))
                .criterion(hasItem(ModItems.DEADHEADER), conditionsFromItem(ModItems.DEADHEADER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CORPSE_BLOSSOM)
                .pattern("WWW")
                .pattern("WOW")
                .pattern("WWW")
                .input('W', ModItems.WITHERED_PETAL)
                .input('O', Items.OXEYE_DAISY)
                .criterion(hasItem(ModItems.WITHERED_PETAL), conditionsFromItem(ModItems.WITHERED_PETAL))
                .offerTo(exporter);

        offerPetalRecipe(exporter, ModTags.Items.WHITE_FLOWERS, ModItems.WHITE_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.LIGHT_GRAY_FLOWERS, ModItems.LIGHT_GRAY_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.GRAY_FLOWERS, ModItems.GRAY_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.BLACK_FLOWERS, ModItems.BLACK_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.RED_FLOWERS, ModItems.RED_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.ORANGE_FLOWERS, ModItems.ORANGE_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.BROWN_FLOWERS, ModItems.BROWN_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.YELLOW_FLOWERS, ModItems.YELLOW_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.LIME_FLOWERS, ModItems.LIME_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.GREEN_FLOWERS, ModItems.GREEN_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.CYAN_FLOWERS, ModItems.CYAN_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.LIGHT_BLUE_FLOWERS, ModItems.LIGHT_BLUE_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.BLUE_FLOWERS, ModItems.BLUE_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.PURPLE_FLOWERS, ModItems.PURPLE_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.MAGENTA_FLOWERS, ModItems.MAGENTA_PETAL);
        offerPetalRecipe(exporter, ModTags.Items.PINK_FLOWERS, ModItems.PINK_PETAL);

        offerTallPetalRecipe(exporter, ModTags.Items.TALL_WHITE_FLOWERS, ModItems.WHITE_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_LIGHT_GRAY_FLOWERS, ModItems.LIGHT_GRAY_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_GRAY_FLOWERS, ModItems.GRAY_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_BLACK_FLOWERS, ModItems.BLACK_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_RED_FLOWERS, ModItems.RED_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_ORANGE_FLOWERS, ModItems.ORANGE_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_BROWN_FLOWERS, ModItems.BROWN_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_YELLOW_FLOWERS, ModItems.YELLOW_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_LIME_FLOWERS, ModItems.LIME_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_GREEN_FLOWERS, ModItems.GREEN_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_CYAN_FLOWERS, ModItems.CYAN_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_LIGHT_BLUE_FLOWERS, ModItems.LIGHT_BLUE_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_BLUE_FLOWERS, ModItems.BLUE_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_PURPLE_FLOWERS, ModItems.PURPLE_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_MAGENTA_FLOWERS, ModItems.MAGENTA_PETAL);
        offerTallPetalRecipe(exporter, ModTags.Items.TALL_PINK_FLOWERS, ModItems.PINK_PETAL);

        offerPetalToDyeRecipe(exporter, ModItems.WHITE_PETAL, Items.WHITE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.LIGHT_GRAY_PETAL, Items.LIGHT_GRAY_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.GRAY_PETAL, Items.GRAY_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.BLACK_PETAL, Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.RED_PETAL, Items.RED_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.ORANGE_PETAL, Items.ORANGE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.BROWN_PETAL, Items.BROWN_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.YELLOW_PETAL, Items.YELLOW_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.LIME_PETAL, Items.LIME_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.GREEN_PETAL, Items.GREEN_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.CYAN_PETAL, Items.CYAN_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.LIGHT_BLUE_PETAL, Items.LIGHT_BLUE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.BLUE_PETAL, Items.BLUE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.PURPLE_PETAL, Items.PURPLE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.MAGENTA_PETAL, Items.MAGENTA_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.PINK_PETAL, Items.PINK_DYE);

        offerFlowerToDyeRecipe(exporter, ModBlocks.BLACK_PETUNIA.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.RED_PETUNIA.asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PURPLE_BELLFLOWER.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem(), Items.PURPLE_DYE, 2);
        offerFlowerToDyeRecipe(exporter, ModBlocks.GREEN_CONEFLOWER.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BLUE_AUBRIETAS.asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PINK_ALCEA.asItem(), Items.PINK_DYE, 1);

        offerFlowerToDyeRecipe(exporter, ModBlocks.LIGHT_GRAY_TULIP.asItem(), Items.LIGHT_GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.GRAY_TULIP.asItem(), Items.GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BLACK_TULIP.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BROWN_TULIP.asItem(), Items.BROWN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.YELLOW_TULIP.asItem(), Items.YELLOW_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.LIME_TULIP.asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.GREEN_TULIP.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.CYAN_TULIP.asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.LIGHT_BLUE_TULIP.asItem(), Items.LIGHT_BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BLUE_TULIP.asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PURPLE_TULIP.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.MAGENTA_TULIP.asItem(), Items.MAGENTA_DYE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICKS, ModBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_STAIRS, ModBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_SLAB, ModBlocks.FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_WALL, ModBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_STAIRS, ModBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_SLAB, ModBlocks.FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_WALL, ModBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE, ModBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_STAIRS, ModBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_SLAB, ModBlocks.FLORAL_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_WALL, ModBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_FLORAL_STONE_STAIRS, ModBlocks.COBBLED_FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_FLORAL_STONE_SLAB, ModBlocks.COBBLED_FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_FLORAL_STONE_WALL, ModBlocks.COBBLED_FLORAL_STONE);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_SLAB, Ingredient.ofItems(ModBlocks.FLORAL_STONE))
                .criterion(hasItem(ModBlocks.FLORAL_STONE), conditionsFromItem(ModBlocks.FLORAL_STONE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.FLORAL_STONE_BRICKS))
                .criterion(hasItem(ModBlocks.FLORAL_STONE_BRICKS), conditionsFromItem(ModBlocks.FLORAL_STONE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_FLORAL_STONE_SLAB, Ingredient.ofItems(ModBlocks.COBBLED_FLORAL_STONE))
                .criterion(hasItem(ModBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(ModBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        createStairsRecipe(ModBlocks.FLORAL_STONE_STAIRS, Ingredient.ofItems(ModBlocks.FLORAL_STONE))
                .criterion(hasItem(ModBlocks.FLORAL_STONE), conditionsFromItem(ModBlocks.FLORAL_STONE))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.FLORAL_STONE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.FLORAL_STONE_BRICKS))
                .criterion(hasItem(ModBlocks.FLORAL_STONE_BRICKS), conditionsFromItem(ModBlocks.FLORAL_STONE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.COBBLED_FLORAL_STONE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_FLORAL_STONE))
                .criterion(hasItem(ModBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(ModBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_WALL, ModBlocks.FLORAL_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICK_WALL, ModBlocks.FLORAL_STONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_FLORAL_STONE_WALL, ModBlocks.COBBLED_FLORAL_STONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModBlocks.COBBLED_FLORAL_STONE), RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.FLORAL_STONE, 0.1f, 200)
                .criterion(hasItem(ModBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(ModBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLORAL_STONE_BRICKS, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.FLORAL_STONE)
                .criterion(hasItem(ModBlocks.FLORAL_STONE), conditionsFromItem(ModBlocks.FLORAL_STONE))
                .offerTo(exporter);

    }

}
