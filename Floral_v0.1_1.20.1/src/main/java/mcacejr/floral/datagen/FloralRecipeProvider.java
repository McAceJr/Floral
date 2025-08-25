package mcacejr.floral.datagen;

import mcacejr.floral.block.FloralBlocks;
import mcacejr.floral.item.FloralItems;
import mcacejr.floral.util.FloralTags;
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
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Consumer;

public class FloralRecipeProvider extends FabricRecipeProvider {

    public FloralRecipeProvider(FabricDataOutput output) { super(output); }

    public static void offerPetalRecipe(Consumer<RecipeJsonProvider> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, petalItem, 3)
                .input(FloralTags.Items.FLOWER_TRIMMERS)
                .input(flowerItem)
                .criterion(hasItem(FloralItems.FLOWER_TRIMMER), conditionsFromItem(FloralItems.FLOWER_TRIMMER))
                .criterion(hasItem(FloralItems.DEADHEADER), conditionsFromItem(FloralItems.DEADHEADER))
                .offerTo(exporter, petalItem + "_from_" + flowerItem.id());

    }

    public static void offerTallPetalRecipe(Consumer<RecipeJsonProvider> exporter, TagKey<Item> flowerItem, Item petalItem) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, petalItem, 6)
                .input(FloralTags.Items.FLOWER_TRIMMERS)
                .input(flowerItem)
                .criterion(hasItem(FloralItems.FLOWER_TRIMMER), conditionsFromItem(FloralItems.FLOWER_TRIMMER))
                .criterion(hasItem(FloralItems.DEADHEADER), conditionsFromItem(FloralItems.DEADHEADER))
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, FloralItems.FLOWER_TRIMMER)
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, FloralItems.DEADHEADER)
                .pattern("N N")
                .pattern("LTL")
                .pattern(" R ")
                .input('N', Items.NETHERITE_INGOT)
                .input('T', FloralItems.FLOWER_TRIMMER)
                .input('L', FloralItems.RED_PETAL)
                .input('R', Items.LEATHER)
                .criterion(hasItem(FloralItems.FLOWER_TRIMMER), conditionsFromItem(FloralItems.FLOWER_TRIMMER))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, FloralItems.WITHERED_PETAL)
                .input(FloralTags.Items.FLOWER_TRIMMERS)
                .input(Blocks.WITHER_ROSE)
                .criterion(hasItem(FloralItems.FLOWER_TRIMMER), conditionsFromItem(FloralItems.FLOWER_TRIMMER))
                .criterion(hasItem(FloralItems.DEADHEADER), conditionsFromItem(FloralItems.DEADHEADER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, FloralItems.CORPSE_BLOSSOM)
                .pattern("WBW")
                .pattern("WOW")
                .pattern("WBW")
                .input('W', FloralItems.WITHERED_PETAL)
                .input('O', Items.OXEYE_DAISY)
                .input('B', FloralItems.FLOWER_BLEND)
                .criterion(hasItem(FloralItems.WITHERED_PETAL), conditionsFromItem(FloralItems.WITHERED_PETAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, FloralItems.FLORAL_BANE)
                .pattern(" PP")
                .pattern("MPB")
                .pattern("BN ")
                .input('P', FloralItems.BONES_BANE_PETAL)
                .input('B', Items.BONE)
                .input('M', Items.BONE_BLOCK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(FloralItems.BONES_BANE_PETAL), conditionsFromItem(FloralItems.BONES_BANE_PETAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralItems.FLOWER_BLEND, 2)
                .pattern("FFF")
                .pattern("FBF")
                .pattern("FFF")
                .input('F', ItemTags.FLOWERS)
                .input('B', Items.BONE_MEAL)
                .criterion(hasItem(Items.BONE_MEAL), conditionsFromItem(Items.BONE_MEAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralItems.FLORAL_CROWN)
                .pattern("FFF")
                .pattern("FBF")
                .pattern("FFF")
                .input('F', ItemTags.FLOWERS)
                .input('B', FloralItems.FLOWER_BLEND)
                .criterion(hasItem(FloralItems.FLOWER_BLEND), conditionsFromItem(FloralItems.FLOWER_BLEND))
                .offerTo(exporter);

        offerPetalRecipe(exporter, FloralTags.Items.WHITE_FLOWERS, FloralItems.WHITE_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.LIGHT_GRAY_FLOWERS, FloralItems.LIGHT_GRAY_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.GRAY_FLOWERS, FloralItems.GRAY_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.BLACK_FLOWERS, FloralItems.BLACK_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.RED_FLOWERS, FloralItems.RED_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.ORANGE_FLOWERS, FloralItems.ORANGE_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.BROWN_FLOWERS, FloralItems.BROWN_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.YELLOW_FLOWERS, FloralItems.YELLOW_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.LIME_FLOWERS, FloralItems.LIME_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.GREEN_FLOWERS, FloralItems.GREEN_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.CYAN_FLOWERS, FloralItems.CYAN_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.LIGHT_BLUE_FLOWERS, FloralItems.LIGHT_BLUE_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.BLUE_FLOWERS, FloralItems.BLUE_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.PURPLE_FLOWERS, FloralItems.PURPLE_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.MAGENTA_FLOWERS, FloralItems.MAGENTA_PETAL);
        offerPetalRecipe(exporter, FloralTags.Items.PINK_FLOWERS, FloralItems.PINK_PETAL);

        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_WHITE_FLOWERS, FloralItems.WHITE_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_LIGHT_GRAY_FLOWERS, FloralItems.LIGHT_GRAY_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_GRAY_FLOWERS, FloralItems.GRAY_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_BLACK_FLOWERS, FloralItems.BLACK_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_RED_FLOWERS, FloralItems.RED_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_ORANGE_FLOWERS, FloralItems.ORANGE_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_BROWN_FLOWERS, FloralItems.BROWN_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_YELLOW_FLOWERS, FloralItems.YELLOW_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_LIME_FLOWERS, FloralItems.LIME_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_GREEN_FLOWERS, FloralItems.GREEN_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_CYAN_FLOWERS, FloralItems.CYAN_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_LIGHT_BLUE_FLOWERS, FloralItems.LIGHT_BLUE_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_BLUE_FLOWERS, FloralItems.BLUE_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_PURPLE_FLOWERS, FloralItems.PURPLE_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_MAGENTA_FLOWERS, FloralItems.MAGENTA_PETAL);
        offerTallPetalRecipe(exporter, FloralTags.Items.TALL_PINK_FLOWERS, FloralItems.PINK_PETAL);

        offerPetalToDyeRecipe(exporter, FloralItems.WHITE_PETAL, Items.WHITE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIGHT_GRAY_PETAL, Items.LIGHT_GRAY_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.GRAY_PETAL, Items.GRAY_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BLACK_PETAL, Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.RED_PETAL, Items.RED_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.ORANGE_PETAL, Items.ORANGE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BROWN_PETAL, Items.BROWN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.YELLOW_PETAL, Items.YELLOW_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIME_PETAL, Items.LIME_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.GREEN_PETAL, Items.GREEN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.CYAN_PETAL, Items.CYAN_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.LIGHT_BLUE_PETAL, Items.LIGHT_BLUE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BLUE_PETAL, Items.BLUE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.PURPLE_PETAL, Items.PURPLE_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.MAGENTA_PETAL, Items.MAGENTA_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.PINK_PETAL, Items.PINK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.WITHERED_PETAL, Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, FloralItems.BONES_BANE_PETAL, Items.PURPLE_DYE);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLACK_PETUNIA.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.RED_PETUNIA.asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_BELLFLOWER.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem(), Items.PURPLE_DYE, 2);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_CONEFLOWER.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLUE_AUBRIETAS.asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PINK_ALCEA.asItem(), Items.PINK_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIGHT_GRAY_TULIP.asItem(), Items.LIGHT_GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GRAY_TULIP.asItem(), Items.GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLACK_TULIP.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BROWN_TULIP.asItem(), Items.BROWN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.YELLOW_TULIP.asItem(), Items.YELLOW_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_TULIP.asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_TULIP.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.CYAN_TULIP.asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIGHT_BLUE_TULIP.asItem(), Items.LIGHT_BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BLUE_TULIP.asItem(), Items.BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_TULIP.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.MAGENTA_TULIP.asItem(), Items.MAGENTA_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.GREEN_DAHLIA.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.MAGENTA_CABARET.asItem(), Items.MAGENTA_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_BELLFLOWER.asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.LIME_CHIMNEY_BELLFLOWER.asItem(), Items.LIME_DYE, 2);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.PURPLE_WOLFSBANE.asItem(), Items.PURPLE_DYE, 1);

        offerFlowerToDyeRecipe(exporter, FloralBlocks.ROCKY_SEDUM.asItem(), Items.ORANGE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.STEM_LILY.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.BONES_BANE.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.TWISTING_ROOTS.asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WEEPING_ROOTS.asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WARDEN_PRIMROSE.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.CHORUS_TULIP.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER.asItem(), Items.WHITE_DYE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICKS, FloralBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_STAIRS, FloralBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_SLAB, FloralBlocks.FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_WALL, FloralBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_STAIRS, FloralBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB, FloralBlocks.FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL, FloralBlocks.FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE, FloralBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_STAIRS, FloralBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB, FloralBlocks.FLORAL_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL, FloralBlocks.FLORAL_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_STAIRS, FloralBlocks.COBBLED_FLORAL_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_SLAB, FloralBlocks.COBBLED_FLORAL_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_WALL, FloralBlocks.COBBLED_FLORAL_STONE);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_SLAB, Ingredient.ofItems(FloralBlocks.FLORAL_STONE))
                .criterion(hasItem(FloralBlocks.FLORAL_STONE), conditionsFromItem(FloralBlocks.FLORAL_STONE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_SLAB, Ingredient.ofItems(FloralBlocks.FLORAL_STONE_BRICKS))
                .criterion(hasItem(FloralBlocks.FLORAL_STONE_BRICKS), conditionsFromItem(FloralBlocks.FLORAL_STONE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_SLAB, Ingredient.ofItems(FloralBlocks.COBBLED_FLORAL_STONE))
                .criterion(hasItem(FloralBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(FloralBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        createStairsRecipe(FloralBlocks.FLORAL_STONE_STAIRS, Ingredient.ofItems(FloralBlocks.FLORAL_STONE))
                .criterion(hasItem(FloralBlocks.FLORAL_STONE), conditionsFromItem(FloralBlocks.FLORAL_STONE))
                .offerTo(exporter);
        createStairsRecipe(FloralBlocks.FLORAL_STONE_BRICK_STAIRS, Ingredient.ofItems(FloralBlocks.FLORAL_STONE_BRICKS))
                .criterion(hasItem(FloralBlocks.FLORAL_STONE_BRICKS), conditionsFromItem(FloralBlocks.FLORAL_STONE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS, Ingredient.ofItems(FloralBlocks.COBBLED_FLORAL_STONE))
                .criterion(hasItem(FloralBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(FloralBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_WALL, FloralBlocks.FLORAL_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICK_WALL, FloralBlocks.FLORAL_STONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, FloralBlocks.COBBLED_FLORAL_STONE_WALL, FloralBlocks.COBBLED_FLORAL_STONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(FloralBlocks.COBBLED_FLORAL_STONE), RecipeCategory.BUILDING_BLOCKS,
                FloralBlocks.FLORAL_STONE, 0.1f, 200)
                .criterion(hasItem(FloralBlocks.COBBLED_FLORAL_STONE), conditionsFromItem(FloralBlocks.COBBLED_FLORAL_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.FLORAL_STONE_BRICKS, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', FloralBlocks.FLORAL_STONE)
                .criterion(hasItem(FloralBlocks.FLORAL_STONE), conditionsFromItem(FloralBlocks.FLORAL_STONE))
                .offerTo(exporter);

        offerBarkBlockRecipe(exporter, FloralBlocks.STEM_WOOD, FloralBlocks.STEM_LOG);

        offerBarkBlockRecipe(exporter, FloralBlocks.STRIPPED_STEM_WOOD, FloralBlocks.STRIPPED_STEM_LOG);

        offerPlanksRecipe(exporter, FloralBlocks.STEM_PLANKS, FloralTags.Items.STEM_LOGS, 4);

        createStairsRecipe(FloralBlocks.STEM_STAIRS, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, FloralBlocks.STEM_SLAB, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createFenceRecipe(FloralBlocks.STEM_FENCE, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createFenceGateRecipe(FloralBlocks.STEM_FENCE_GATE, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createDoorRecipe(FloralBlocks.STEM_DOOR, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createTrapdoorRecipe(FloralBlocks.STEM_TRAPDOOR, Ingredient.ofItems(FloralBlocks.STEM_PLANKS))
                .criterion(hasItem(FloralBlocks.STEM_PLANKS), conditionsFromItem(FloralBlocks.STEM_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.ROCKY_SEDUM)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.COBBLESTONE)
                .input('B', FloralItems.FLOWER_BLEND)
                .input('D', FloralItems.BROWN_PETAL)
                .input('C', FloralItems.ORANGE_PETAL)
                .criterion(hasItem(FloralItems.FLOWER_BLEND), conditionsFromItem(FloralItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.STEM_LILY)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', ItemTags.LOGS)
                .input('B', FloralItems.FLOWER_BLEND)
                .input('D', FloralItems.GREEN_PETAL)
                .input('C', FloralItems.LIME_PETAL)
                .criterion(hasItem(FloralItems.FLOWER_BLEND), conditionsFromItem(FloralItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.WEEPING_ROOTS)
                .pattern("FCF")
                .pattern("DND")
                .pattern("FCF")
                .input('F', Blocks.NETHER_WART_BLOCK)
                .input('N', Blocks.SOUL_SOIL)
                .input('D', FloralItems.RED_PETAL)
                .input('C', FloralItems.BROWN_PETAL)
                .criterion(hasItem(Blocks.NETHER_WART_BLOCK), conditionsFromItem(Blocks.NETHER_WART_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.TWISTING_ROOTS)
                .pattern("FCF")
                .pattern("DND")
                .pattern("FCF")
                .input('F', Blocks.WARPED_WART_BLOCK)
                .input('N', FloralBlocks.WEEPING_ROOTS)
                .input('D', FloralItems.CYAN_PETAL)
                .input('C', FloralItems.BLUE_PETAL)
                .criterion(hasItem(Blocks.WARPED_WART_BLOCK), conditionsFromItem(Blocks.WARPED_WART_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.BONES_BANE)
                .pattern("FCF")
                .pattern("DWD")
                .pattern("FCF")
                .input('F', FloralItems.WITHERED_PETAL)
                .input('W', FloralBlocks.PURPLE_WOLFSBANE)
                .input('D', FloralItems.PURPLE_PETAL)
                .input('C', FloralItems.WHITE_PETAL)
                .criterion(hasItem(FloralBlocks.PURPLE_WOLFSBANE), conditionsFromItem(FloralBlocks.PURPLE_WOLFSBANE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.WARDEN_PRIMROSE)
                .pattern("FCF")
                .pattern("DWD")
                .pattern("BCB")
                .input('F', Blocks.SCULK_SHRIEKER)
                .input('B', Blocks.SCULK)
                .input('W', Blocks.SCULK_CATALYST)
                .input('D', Items.ECHO_SHARD)
                .input('C', FloralItems.BLACK_PETAL)
                .criterion(hasItem(Blocks.SCULK_CATALYST), conditionsFromItem(Blocks.SCULK_CATALYST))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.CHORUS_TULIP)
                .pattern("FCF")
                .pattern("DWD")
                .pattern("BCB")
                .input('F', Items.CHORUS_FRUIT)
                .input('B', Blocks.END_STONE)
                .input('W', Blocks.CHORUS_FLOWER)
                .input('D', FloralItems.PURPLE_PETAL)
                .input('C', FloralItems.LIGHT_GRAY_PETAL)
                .criterion(hasItem(Blocks.CHORUS_FLOWER), conditionsFromItem(Blocks.CHORUS_FLOWER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER)
                .pattern("FCF")
                .pattern("DWD")
                .pattern("FCF")
                .input('F', Blocks.BONE_BLOCK)
                .input('W', Blocks.SKELETON_SKULL)
                .input('D', FloralItems.WHITE_PETAL)
                .input('C', FloralItems.WHITE_PETAL)
                .criterion(hasItem(Blocks.SKELETON_SKULL), conditionsFromItem(Blocks.SKELETON_SKULL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.THICK_VINES)
                .pattern("   ")
                .pattern("GVG")
                .pattern(" G ")
                .input('G', FloralItems.GREEN_PETAL)
                .input('V', Blocks.VINE)
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.THICK_STALK)
                .pattern(" G ")
                .pattern("GVG")
                .pattern("   ")
                .input('G', FloralItems.GREEN_PETAL)
                .input('V', Blocks.VINE)
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.PINK_ALCEA)
                .pattern("   ")
                .pattern("PVP")
                .pattern("   ")
                .input('P', FloralItems.PINK_PETAL)
                .input('V', FloralBlocks.THICK_STALK)
                .criterion(hasItem(FloralBlocks.THICK_STALK), conditionsFromItem(FloralBlocks.THICK_STALK))
                .criterion(hasItem(FloralItems.PINK_PETAL), conditionsFromItem(FloralItems.PINK_PETAL))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, FloralBlocks.BLUE_AUBRIETAS)
                .pattern(" B ")
                .pattern("BCB")
                .pattern(" B ")
                .input('B', FloralItems.BLUE_PETAL)
                .input('C', Blocks.PINK_PETALS)
                .criterion(hasItem(Blocks.PINK_PETALS), conditionsFromItem(Blocks.PINK_PETALS))
                .criterion(hasItem(FloralItems.BLUE_PETAL), conditionsFromItem(FloralItems.BLUE_PETAL))
                .offerTo(exporter);

    }

}
