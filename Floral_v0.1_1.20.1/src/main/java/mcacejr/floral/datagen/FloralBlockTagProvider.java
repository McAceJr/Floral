package mcacejr.floral.datagen;

import mcacejr.floral.block.FloralBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FloralBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public FloralBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(FloralBlocks.BLACK_PETUNIA)
                .add(FloralBlocks.RED_PETUNIA)
                .add(Blocks.SPORE_BLOSSOM)
                .add(FloralBlocks.PURPLE_BELLFLOWER)
                .add(FloralBlocks.GREEN_CONEFLOWER)
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER)
                .add(FloralBlocks.BLUE_AUBRIETAS)
                .add(FloralBlocks.PINK_ALCEA)
                .add(FloralBlocks.PINK_ALCEA_PLANT)
                .add(FloralBlocks.LIGHT_GRAY_TULIP)
                .add(FloralBlocks.GRAY_TULIP)
                .add(FloralBlocks.BLACK_TULIP)
                .add(FloralBlocks.BROWN_TULIP)
                .add(FloralBlocks.YELLOW_TULIP)
                .add(FloralBlocks.LIME_TULIP)
                .add(FloralBlocks.GREEN_TULIP)
                .add(FloralBlocks.CYAN_TULIP)
                .add(FloralBlocks.LIGHT_BLUE_TULIP)
                .add(FloralBlocks.BLUE_TULIP)
                .add(FloralBlocks.PURPLE_TULIP)
                .add(FloralBlocks.MAGENTA_TULIP)
                .add(FloralBlocks.WEEPING_ROOTS)
                .add(FloralBlocks.TWISTING_ROOTS)
                .add(FloralBlocks.WARDEN_PRIMROSE)
                .add(FloralBlocks.ROCKY_SEDUM)
                .add(FloralBlocks.STEM_LILY)
                .add(FloralBlocks.BONES_BANE)
                .add(FloralBlocks.GREEN_DAHLIA)
                .add(FloralBlocks.MAGENTA_CABARET)
                .add(FloralBlocks.LIME_BELLFLOWER)
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER)
                .add(FloralBlocks.PURPLE_WOLFSBANE);

        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER)
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER)
                .add(FloralBlocks.PINK_ALCEA);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(FloralBlocks.THICK_STALK)
                .add(FloralBlocks.THICK_STALK_PLANT)
                .add(FloralBlocks.THICK_VINES)
                .add(FloralBlocks.THICK_VINES_PLANT);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(FloralBlocks.POTTED_BLACK_PETUNIA)
                .add(FloralBlocks.POTTED_RED_PETUNIA)
                .add(FloralBlocks.POTTED_PURPLE_BELLFLOWER)
                .add(FloralBlocks.POTTED_GREEN_CONEFLOWER)
                .add(FloralBlocks.POTTED_LIGHT_GRAY_TULIP)
                .add(FloralBlocks.POTTED_GRAY_TULIP)
                .add(FloralBlocks.POTTED_BLACK_TULIP)
                .add(FloralBlocks.POTTED_BROWN_TULIP)
                .add(FloralBlocks.POTTED_YELLOW_TULIP)
                .add(FloralBlocks.POTTED_LIME_TULIP)
                .add(FloralBlocks.POTTED_GREEN_TULIP)
                .add(FloralBlocks.POTTED_CYAN_TULIP)
                .add(FloralBlocks.POTTED_LIGHT_BLUE_TULIP)
                .add(FloralBlocks.POTTED_BLUE_TULIP)
                .add(FloralBlocks.POTTED_PURPLE_TULIP)
                .add(FloralBlocks.POTTED_MAGENTA_TULIP)
                .add(FloralBlocks.POTTED_GREEN_DAHLIA)
                .add(FloralBlocks.POTTED_MAGENTA_CABARET)
                .add(FloralBlocks.POTTED_LIME_BELLFLOWER)
                .add(FloralBlocks.POTTED_PURPLE_WOLFSBANE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(FloralBlocks.STEM_STAIRS)
                .add(FloralBlocks.FLORAL_STONE_STAIRS)
                .add(FloralBlocks.FLORAL_STONE_BRICK_STAIRS)
                .add(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(FloralBlocks.FLORAL_STONE_SLAB)
                .add(FloralBlocks.FLORAL_STONE_BRICK_SLAB)
                .add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(FloralBlocks.FLORAL_STONE_WALL)
                .add(FloralBlocks.FLORAL_STONE_BRICK_WALL)
                .add(FloralBlocks.COBBLED_FLORAL_STONE_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(FloralBlocks.STEM_LOG)
                .add(FloralBlocks.STEM_WOOD)
                .add(FloralBlocks.STRIPPED_STEM_LOG)
                .add(FloralBlocks.STRIPPED_STEM_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(FloralBlocks.STEM_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(FloralBlocks.STEM_FENCE_GATE);

    }

}
