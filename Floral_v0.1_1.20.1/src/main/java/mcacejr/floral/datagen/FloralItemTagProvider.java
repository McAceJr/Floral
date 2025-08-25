package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.FloralItems;
import mcacejr.floral.util.FloralTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class FloralItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public FloralItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(FloralTags.Items.PETALS)
                .add(FloralItems.BLACK_PETAL)
                .add(FloralItems.GRAY_PETAL)
                .add(FloralItems.LIGHT_GRAY_PETAL)
                .add(FloralItems.WHITE_PETAL)
                .add(FloralItems.RED_PETAL)
                .add(FloralItems.ORANGE_PETAL)
                .add(FloralItems.BROWN_PETAL)
                .add(FloralItems.YELLOW_PETAL)
                .add(FloralItems.LIME_PETAL)
                .add(FloralItems.GREEN_PETAL)
                .add(FloralItems.CYAN_PETAL)
                .add(FloralItems.LIGHT_BLUE_PETAL)
                .add(FloralItems.BLUE_PETAL)
                .add(FloralItems.PURPLE_PETAL)
                .add(FloralItems.MAGENTA_PETAL)
                .add(FloralItems.PINK_PETAL)
                .add(FloralItems.WITHERED_PETAL)
                .add(FloralItems.BONES_BANE_PETAL);

        getOrCreateTagBuilder(ItemTags.FLOWERS)
                .add(ModBlocks.BLACK_PETUNIA.asItem())
                .add(ModBlocks.RED_PETUNIA.asItem())
                .add(Items.SPORE_BLOSSOM)
                .add(ModBlocks.PURPLE_BELLFLOWER.asItem())
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(ModBlocks.GREEN_CONEFLOWER.asItem())
                .add(ModBlocks.BLUE_AUBRIETAS.asItem())
                .add(ModBlocks.PINK_ALCEA.asItem())
                .add(ModBlocks.LIGHT_GRAY_TULIP.asItem())
                .add(ModBlocks.GRAY_TULIP.asItem())
                .add(ModBlocks.BLACK_TULIP.asItem())
                .add(ModBlocks.BROWN_TULIP.asItem())
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(ModBlocks.LIME_TULIP.asItem())
                .add(ModBlocks.GREEN_TULIP.asItem())
                .add(ModBlocks.CYAN_TULIP.asItem())
                .add(ModBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(ModBlocks.BLUE_TULIP.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.WEEPING_ROOTS.asItem())
                .add(ModBlocks.TWISTING_ROOTS.asItem())
                .add(ModBlocks.WARDEN_PRIMROSE.asItem())
                .add(ModBlocks.ROCKY_SEDUM.asItem())
                .add(ModBlocks.STEM_LILY.asItem())
                .add(ModBlocks.BONES_BANE.asItem())
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem())
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem())
                .add(ModBlocks.PURPLE_WOLFSBANE.asItem());

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.BLUE_AUBRIETAS.asItem())
                .add(ModBlocks.GREEN_CONEFLOWER.asItem())
                .add(ModBlocks.BLACK_PETUNIA.asItem())
                .add(ModBlocks.RED_PETUNIA.asItem())
                .add(ModBlocks.PURPLE_BELLFLOWER.asItem())
                .add(ModBlocks.LIGHT_GRAY_TULIP.asItem())
                .add(ModBlocks.GRAY_TULIP.asItem())
                .add(ModBlocks.BLACK_TULIP.asItem())
                .add(ModBlocks.BROWN_TULIP.asItem())
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(ModBlocks.LIME_TULIP.asItem())
                .add(ModBlocks.GREEN_TULIP.asItem())
                .add(ModBlocks.CYAN_TULIP.asItem())
                .add(ModBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(ModBlocks.BLUE_TULIP.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.WEEPING_ROOTS.asItem())
                .add(ModBlocks.TWISTING_ROOTS.asItem())
                .add(ModBlocks.WARDEN_PRIMROSE.asItem())
                .add(ModBlocks.ROCKY_SEDUM.asItem())
                .add(ModBlocks.STEM_LILY.asItem())
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem())
                .add(ModBlocks.PURPLE_WOLFSBANE.asItem());

        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(ModBlocks.PINK_ALCEA.asItem())
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(FloralItems.PETUNIA_LANCE)
                .add(FloralItems.CORPSE_BLOSSOM)
                .add(FloralItems.FLOWER_TRIMMER)
                .add(FloralItems.DEADHEADER)
                .add(FloralItems.FLORAL_BANE);

        getOrCreateTagBuilder(FloralTags.Items.FLOWER_TRIMMERS)
                .add(FloralItems.FLOWER_TRIMMER)
                .add(FloralItems.DEADHEADER);

        getOrCreateTagBuilder(FloralTags.Items.WHITE_FLOWERS)
                .add(Blocks.WHITE_TULIP.asItem())
                .add(Blocks.LILY_OF_THE_VALLEY.asItem());
        getOrCreateTagBuilder(FloralTags.Items.LIGHT_GRAY_FLOWERS)
                .add(Blocks.AZURE_BLUET.asItem())
                .add(Blocks.OXEYE_DAISY.asItem())
                .add(ModBlocks.LIGHT_GRAY_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.GRAY_FLOWERS)
                .add(ModBlocks.GRAY_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BLACK_FLOWERS)
                .add(ModBlocks.BLACK_TULIP.asItem())
                .add(ModBlocks.WARDEN_PRIMROSE.asItem())
                .add(ModBlocks.BLACK_PETUNIA.asItem());
        getOrCreateTagBuilder(FloralTags.Items.RED_FLOWERS)
                .add(ModBlocks.RED_PETUNIA.asItem())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.RED_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.ORANGE_FLOWERS)
                .add(Blocks.ORANGE_TULIP.asItem())
                .add(ModBlocks.ROCKY_SEDUM.asItem())
                .add(Blocks.TORCHFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BROWN_FLOWERS)
                .add(ModBlocks.WEEPING_ROOTS.asItem())
                .add(ModBlocks.TWISTING_ROOTS.asItem())
                .add(ModBlocks.BROWN_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.YELLOW_FLOWERS)
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(Blocks.DANDELION.asItem());
        getOrCreateTagBuilder(FloralTags.Items.LIME_FLOWERS)
                .add(ModBlocks.LIME_TULIP.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.GREEN_FLOWERS)
                .add(ModBlocks.GREEN_TULIP.asItem())
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.STEM_LILY.asItem())
                .add(ModBlocks.GREEN_CONEFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.CYAN_FLOWERS)
                .add(ModBlocks.CYAN_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.LIGHT_BLUE_FLOWERS)
                .add(ModBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(Blocks.BLUE_ORCHID.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BLUE_FLOWERS)
                .add(ModBlocks.BLUE_TULIP.asItem())
                .add(Blocks.CORNFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_WOLFSBANE.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.PURPLE_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.MAGENTA_FLOWERS)
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(Blocks.ALLIUM.asItem());
        getOrCreateTagBuilder(FloralTags.Items.PINK_FLOWERS)
                .add(ModBlocks.PINK_ALCEA.asItem())
                .add(Blocks.PINK_TULIP.asItem());

        getOrCreateTagBuilder(FloralTags.Items.TALL_WHITE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_LIGHT_GRAY_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_GRAY_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_BLACK_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_RED_FLOWERS)
                .add(Blocks.ROSE_BUSH.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_ORANGE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_BROWN_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_YELLOW_FLOWERS)
                .add(Blocks.SUNFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_LIME_FLOWERS)
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_GREEN_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_CYAN_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_LIGHT_BLUE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_BLUE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_MAGENTA_FLOWERS)
                .add(Blocks.LILAC.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_PINK_FLOWERS)
                .add(Blocks.PEONY.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.STEM_STAIRS.asItem())
                .add(ModBlocks.FLORAL_STONE_STAIRS.asItem())
                .add(ModBlocks.FLORAL_STONE_BRICK_STAIRS.asItem())
                .add(ModBlocks.COBBLED_FLORAL_STONE_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.FLORAL_STONE_SLAB.asItem())
                .add(ModBlocks.FLORAL_STONE_BRICK_SLAB.asItem())
                .add(ModBlocks.COBBLED_FLORAL_STONE_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.FLORAL_STONE_WALL.asItem())
                .add(ModBlocks.FLORAL_STONE_BRICK_WALL.asItem())
                .add(ModBlocks.COBBLED_FLORAL_STONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.STEM_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.STEM_LOG.asItem())
                .add(ModBlocks.STEM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_STEM_LOG.asItem())
                .add(ModBlocks.STRIPPED_STEM_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.STEM_LOG.asItem())
                .add(ModBlocks.STEM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_STEM_LOG.asItem())
                .add(ModBlocks.STRIPPED_STEM_WOOD.asItem());

        getOrCreateTagBuilder(FloralTags.Items.STEM_LOGS)
                .add(ModBlocks.STEM_LOG.asItem())
                .add(ModBlocks.STEM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_STEM_LOG.asItem())
                .add(ModBlocks.STRIPPED_STEM_WOOD.asItem());

    }

}
