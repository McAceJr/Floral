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
                .add(ModBlocks.PINK_ALCEA_PLANT);

        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER)
                .add(ModBlocks.PINK_ALCEA);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.THICK_STALK)
                .add(ModBlocks.THICK_VINES);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_BLACK_PETUNIA)
                .add(ModBlocks.POTTED_RED_PETUNIA)
                .add(ModBlocks.POTTED_PURPLE_BELLFLOWER)
                .add(ModBlocks.POTTED_GREEN_CONEFLOWER);

    }

}
