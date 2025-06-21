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
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
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
                .pattern("BTB")
                .pattern("LRL")
                .input('N', Items.NETHERITE_INGOT)
                .input('T', ModItems.FLOWER_TRIMMER)
                .input('L', ModItems.RED_PETAL)
                .input('R', Items.LEATHER)
                .input('B', ModItems.FLORAL_BLOOM_TIER_2)
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
                .pattern("WBW")
                .pattern("WOW")
                .pattern("WBW")
                .input('W', ModItems.WITHERED_PETAL)
                .input('O', Items.OXEYE_DAISY)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .criterion(hasItem(ModItems.WITHERED_PETAL), conditionsFromItem(ModItems.WITHERED_PETAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLORAL_BANE)
                .pattern(" PP")
                .pattern("FPB")
                .pattern("BF ")
                .input('P', ModItems.BONES_BANE_PETAL)
                .input('B', Items.BONE)
                .input('F', ModItems.FLORAL_BLOOM_TIER_2)
                .criterion(hasItem(ModItems.BONES_BANE_PETAL), conditionsFromItem(ModItems.BONES_BANE_PETAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLOWER_BLEND)
                .pattern("FFF")
                .pattern("FBF")
                .pattern("FFF")
                .input('F', ItemTags.FLOWERS)
                .input('B', Items.BONE_MEAL)
                .criterion(hasItem(Items.BONE_MEAL), conditionsFromItem(Items.BONE_MEAL))
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
        offerPetalToDyeRecipe(exporter, ModItems.WITHERED_PETAL, Items.BLACK_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.BONES_BANE_PETAL, Items.PURPLE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.COLD_PETAL, Items.LIGHT_BLUE_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.DRIED_PETAL, Items.BROWN_DYE);
        offerPetalToDyeRecipe(exporter, ModItems.BLAZING_PETAL, Items.RED_DYE);

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

        offerFlowerToDyeRecipe(exporter, ModBlocks.GREEN_DAHLIA.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.MAGENTA_CABARET.asItem(), Items.MAGENTA_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.LIME_BELLFLOWER.asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem(), Items.LIME_DYE, 2);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PURPLE_WOLFSBANE.asItem(), Items.PURPLE_DYE, 1);

        offerFlowerToDyeRecipe(exporter, ModBlocks.ROCKY_SEDUM.asItem(), Items.ORANGE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.STEM_LILY.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BONES_BANE.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.TWISTING_ROOTS.asItem(), Items.CYAN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.SNOWY_CABARET.asItem(), Items.LIGHT_BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.DRIED_DAHLIA.asItem(), Items.BROWN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.FROSTED_ROSE.asItem(), Items.LIGHT_BLUE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.METALLIC_CONEFLOWER.asItem(), Items.GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.ENDER_CLAM_FLOWER.asItem(), Items.MAGENTA_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.SHINY_JASMINE.asItem(), Items.LIME_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.PUTTY_PETUNIA.asItem(), Items.LIGHT_GRAY_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.CRAFTING_FLOWER.asItem(), Items.BROWN_DYE, 1);

        offerFlowerToDyeRecipe(exporter, ModBlocks.GLOWING_BELLFLOWER.asItem(), Items.YELLOW_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.WEEPING_ROOTS.asItem(), Items.RED_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.GLOWING_ROOTS.asItem(), Items.YELLOW_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.BLAZING_ROSE.asItem(), Items.ORANGE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.SHARD_OXALIS.asItem(), Items.WHITE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.GREEN_OVERFLOWING_BELLFLOWER.asItem(), Items.GREEN_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.WARDEN_PRIMROSE.asItem(), Items.BLACK_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.CHORUS_TULIP.asItem(), Items.PURPLE_DYE, 1);
        offerFlowerToDyeRecipe(exporter, ModBlocks.WHITE_OVERFLOWING_BELLFLOWER.asItem(), Items.WHITE_DYE, 1);

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

        offerBarkBlockRecipe(exporter, ModBlocks.STEM_WOOD, ModBlocks.STEM_LOG);

        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_STEM_WOOD, ModBlocks.STRIPPED_STEM_LOG);

        offerPlanksRecipe(exporter, ModBlocks.STEM_PLANKS, ModTags.Items.STEM_LOGS, 4);

        createStairsRecipe(ModBlocks.STEM_STAIRS, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEM_SLAB, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createFenceRecipe(ModBlocks.STEM_FENCE, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createFenceGateRecipe(ModBlocks.STEM_FENCE_GATE, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createDoorRecipe(ModBlocks.STEM_DOOR, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        createTrapdoorRecipe(ModBlocks.STEM_TRAPDOOR, Ingredient.ofItems(ModBlocks.STEM_PLANKS))
                .criterion(hasItem(ModBlocks.STEM_PLANKS), conditionsFromItem(ModBlocks.STEM_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLORAL_BLOOM_TIER_1)
                .pattern("BSB")
                .pattern("DFC")
                .pattern("BRB")
                .input('F', ItemTags.FLOWERS)
                .input('B', ModItems.FLOWER_BLEND)
                .input('S', ModBlocks.STEM_LOG)
                .input('D', ModItems.DRIED_PETAL)
                .input('R', ModBlocks.COBBLED_FLORAL_STONE)
                .input('C', ModItems.COLD_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLORAL_BLOOM_TIER_2)
                .pattern("FSF")
                .pattern("DBC")
                .pattern("FRF")
                .input('F', ModItems.FLOWER_BLEND)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .input('S', ModItems.TWISTED_WART)
                .input('D', ModItems.BLAZING_PETAL)
                .input('C', ModItems.FROZEN_DUST)
                .input('R', ModItems.FLOWERING_INGOT)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_1), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_1))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLORAL_BLOOM_TIER_3)
                .pattern("FSF")
                .pattern("DFC")
                .pattern("FRF")
                .input('F', ModItems.FLOWER_BLEND)
                .input('B', ModItems.FLORAL_BLOOM_TIER_2)
                .input('S', ModBlocks.STEM_LOG)
                .input('D', ModItems.DRIED_PETAL)
                .input('R', ModBlocks.COBBLED_FLORAL_STONE)
                .input('C', ModItems.COLD_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_2), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_2))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROCKY_SEDUM)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.COBBLESTONE)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.BROWN_PETAL)
                .input('C', ModItems.ORANGE_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STEM_LILY)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', ItemTags.LOGS)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.GREEN_PETAL)
                .input('C', ModItems.LIME_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SNOWY_CABARET)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.SNOW_BLOCK)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.BLUE_PETAL)
                .input('C', ModItems.LIGHT_BLUE_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRIED_DAHLIA)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.DEAD_BUSH)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.RED_PETAL)
                .input('C', ModItems.YELLOW_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROCKY_SEDUM)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.COBBLESTONE)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.BROWN_PETAL)
                .input('C', ModItems.ORANGE_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STEM_LILY)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', ItemTags.LOGS)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.GREEN_PETAL)
                .input('C', ModItems.LIME_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SNOWY_CABARET)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.SNOW_BLOCK)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.WHITE_PETAL)
                .input('C', ModItems.LIGHT_BLUE_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRIED_DAHLIA)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.DEAD_BUSH)
                .input('B', ModItems.FLOWER_BLEND)
                .input('D', ModItems.RED_PETAL)
                .input('C', ModItems.YELLOW_PETAL)
                .criterion(hasItem(ModItems.FLOWER_BLEND), conditionsFromItem(ModItems.FLOWER_BLEND))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TWISTING_ROOTS)
                .pattern("FCF")
                .pattern("DND")
                .pattern("FBF")
                .input('F', Blocks.WARPED_WART_BLOCK)
                .input('N', ModBlocks.WEEPING_ROOTS)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .input('D', ModItems.CYAN_PETAL)
                .input('C', ModItems.BLUE_PETAL)
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_1), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_1))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FROSTED_ROSE)
                .pattern("FCF")
                .pattern("DND")
                .pattern("FBF")
                .input('F', Blocks.BLUE_ICE)
                .input('N', ModBlocks.BLAZING_ROSE)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .input('D', ModItems.BLUE_PETAL)
                .input('C', ModItems.LIGHT_BLUE_PETAL)
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_1), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_1))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.METALLIC_CONEFLOWER)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Blocks.IRON_BLOCK)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .input('D', ModItems.GRAY_PETAL)
                .input('C', ModItems.LIGHT_GRAY_PETAL)
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_1), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_1))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BURNING_PETUNIA)
                .pattern("FCF")
                .pattern("DBD")
                .pattern("FCF")
                .input('F', Items.BLAZE_ROD)
                .input('B', ModItems.FLORAL_BLOOM_TIER_1)
                .input('D', ModItems.ORANGE_PETAL)
                .input('C', ModItems.RED_PETAL)
                .criterion(hasItem(ModItems.FLORAL_BLOOM_TIER_1), conditionsFromItem(ModItems.FLORAL_BLOOM_TIER_1))
                .offerTo(exporter);




    }

}
