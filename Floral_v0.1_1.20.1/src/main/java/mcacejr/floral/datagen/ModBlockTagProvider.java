package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.BLACK_PETUNIA)
                .add(ModBlocks.RED_PETUNIA)
                .add(Blocks.SPORE_BLOSSOM)
                .add(ModBlocks.PURPLE_BELLFLOWER)
                .add(ModBlocks.GREEN_CONEFLOWER)
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER)
                .add(ModBlocks.BLUE_AUBRIETAS)
                .add(ModBlocks.PINK_ALCEA)
                .add(ModBlocks.PINK_ALCEA_PLANT)
                .add(ModBlocks.LIGHT_GRAY_TULIP)
                .add(ModBlocks.GRAY_TULIP)
                .add(ModBlocks.BLACK_TULIP)
                .add(ModBlocks.BROWN_TULIP)
                .add(ModBlocks.YELLOW_TULIP)
                .add(ModBlocks.LIME_TULIP)
                .add(ModBlocks.GREEN_TULIP)
                .add(ModBlocks.CYAN_TULIP)
                .add(ModBlocks.LIGHT_BLUE_TULIP)
                .add(ModBlocks.BLUE_TULIP)
                .add(ModBlocks.PURPLE_TULIP)
                .add(ModBlocks.MAGENTA_TULIP)
                .add(ModBlocks.WEEPING_ROOTS)
                .add(ModBlocks.TWISTING_ROOTS)
                .add(ModBlocks.WARDEN_PRIMROSE)
                .add(ModBlocks.ROCKY_SEDUM)
                .add(ModBlocks.GREEN_DAHLIA)
                .add(ModBlocks.MAGENTA_CABARET)
                .add(ModBlocks.LIME_BELLFLOWER)
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER);

        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER)
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER)
                .add(ModBlocks.PINK_ALCEA);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.THICK_STALK)
                .add(ModBlocks.THICK_STALK_PLANT)
                .add(ModBlocks.THICK_VINES)
                .add(ModBlocks.THICK_VINES_PLANT);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_BLACK_PETUNIA)
                .add(ModBlocks.POTTED_RED_PETUNIA)
                .add(ModBlocks.POTTED_PURPLE_BELLFLOWER)
                .add(ModBlocks.POTTED_GREEN_CONEFLOWER)
                .add(ModBlocks.POTTED_LIGHT_GRAY_TULIP)
                .add(ModBlocks.POTTED_GRAY_TULIP)
                .add(ModBlocks.POTTED_BLACK_TULIP)
                .add(ModBlocks.POTTED_BROWN_TULIP)
                .add(ModBlocks.POTTED_YELLOW_TULIP)
                .add(ModBlocks.POTTED_LIME_TULIP)
                .add(ModBlocks.POTTED_GREEN_TULIP)
                .add(ModBlocks.POTTED_CYAN_TULIP)
                .add(ModBlocks.POTTED_LIGHT_BLUE_TULIP)
                .add(ModBlocks.POTTED_BLUE_TULIP)
                .add(ModBlocks.POTTED_PURPLE_TULIP)
                .add(ModBlocks.POTTED_MAGENTA_TULIP)
                .add(ModBlocks.POTTED_GREEN_DAHLIA)
                .add(ModBlocks.POTTED_MAGENTA_CABARET)
                .add(ModBlocks.POTTED_LIME_BELLFLOWER);

    }

}
