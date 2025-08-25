package mcacejr.floral.datagen;

import mcacejr.floral.block.FloralBlocks;
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
                .add(FloralBlocks.BLACK_PETUNIA.asItem())
                .add(FloralBlocks.RED_PETUNIA.asItem())
                .add(Items.SPORE_BLOSSOM)
                .add(FloralBlocks.PURPLE_BELLFLOWER.asItem())
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.asItem())
                .add(FloralBlocks.BLUE_AUBRIETAS.asItem())
                .add(FloralBlocks.PINK_ALCEA.asItem())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.asItem())
                .add(FloralBlocks.GRAY_TULIP.asItem())
                .add(FloralBlocks.BLACK_TULIP.asItem())
                .add(FloralBlocks.BROWN_TULIP.asItem())
                .add(FloralBlocks.YELLOW_TULIP.asItem())
                .add(FloralBlocks.LIME_TULIP.asItem())
                .add(FloralBlocks.GREEN_TULIP.asItem())
                .add(FloralBlocks.CYAN_TULIP.asItem())
                .add(FloralBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(FloralBlocks.BLUE_TULIP.asItem())
                .add(FloralBlocks.PURPLE_TULIP.asItem())
                .add(FloralBlocks.MAGENTA_TULIP.asItem())
                .add(FloralBlocks.WEEPING_ROOTS.asItem())
                .add(FloralBlocks.TWISTING_ROOTS.asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.asItem())
                .add(FloralBlocks.ROCKY_SEDUM.asItem())
                .add(FloralBlocks.STEM_LILY.asItem())
                .add(FloralBlocks.BONES_BANE.asItem())
                .add(FloralBlocks.GREEN_DAHLIA.asItem())
                .add(FloralBlocks.MAGENTA_CABARET.asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.asItem())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.asItem())
                .add(FloralBlocks.PURPLE_WOLFSBANE.asItem());

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(FloralBlocks.BLUE_AUBRIETAS.asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.asItem())
                .add(FloralBlocks.BLACK_PETUNIA.asItem())
                .add(FloralBlocks.RED_PETUNIA.asItem())
                .add(FloralBlocks.PURPLE_BELLFLOWER.asItem())
                .add(FloralBlocks.LIGHT_GRAY_TULIP.asItem())
                .add(FloralBlocks.GRAY_TULIP.asItem())
                .add(FloralBlocks.BLACK_TULIP.asItem())
                .add(FloralBlocks.BROWN_TULIP.asItem())
                .add(FloralBlocks.YELLOW_TULIP.asItem())
                .add(FloralBlocks.LIME_TULIP.asItem())
                .add(FloralBlocks.GREEN_TULIP.asItem())
                .add(FloralBlocks.CYAN_TULIP.asItem())
                .add(FloralBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(FloralBlocks.BLUE_TULIP.asItem())
                .add(FloralBlocks.PURPLE_TULIP.asItem())
                .add(FloralBlocks.MAGENTA_TULIP.asItem())
                .add(FloralBlocks.WEEPING_ROOTS.asItem())
                .add(FloralBlocks.TWISTING_ROOTS.asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.asItem())
                .add(FloralBlocks.ROCKY_SEDUM.asItem())
                .add(FloralBlocks.STEM_LILY.asItem())
                .add(FloralBlocks.GREEN_DAHLIA.asItem())
                .add(FloralBlocks.MAGENTA_CABARET.asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.asItem())
                .add(FloralBlocks.PURPLE_WOLFSBANE.asItem());

        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(FloralBlocks.PINK_ALCEA.asItem())
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());

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
                .add(FloralBlocks.LIGHT_GRAY_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.GRAY_FLOWERS)
                .add(FloralBlocks.GRAY_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BLACK_FLOWERS)
                .add(FloralBlocks.BLACK_TULIP.asItem())
                .add(FloralBlocks.WARDEN_PRIMROSE.asItem())
                .add(FloralBlocks.BLACK_PETUNIA.asItem());
        getOrCreateTagBuilder(FloralTags.Items.RED_FLOWERS)
                .add(FloralBlocks.RED_PETUNIA.asItem())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.RED_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.ORANGE_FLOWERS)
                .add(Blocks.ORANGE_TULIP.asItem())
                .add(FloralBlocks.ROCKY_SEDUM.asItem())
                .add(Blocks.TORCHFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BROWN_FLOWERS)
                .add(FloralBlocks.WEEPING_ROOTS.asItem())
                .add(FloralBlocks.TWISTING_ROOTS.asItem())
                .add(FloralBlocks.BROWN_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.YELLOW_FLOWERS)
                .add(FloralBlocks.YELLOW_TULIP.asItem())
                .add(Blocks.DANDELION.asItem());
        getOrCreateTagBuilder(FloralTags.Items.LIME_FLOWERS)
                .add(FloralBlocks.LIME_TULIP.asItem())
                .add(FloralBlocks.LIME_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.GREEN_FLOWERS)
                .add(FloralBlocks.GREEN_TULIP.asItem())
                .add(FloralBlocks.GREEN_DAHLIA.asItem())
                .add(FloralBlocks.STEM_LILY.asItem())
                .add(FloralBlocks.GREEN_CONEFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.CYAN_FLOWERS)
                .add(FloralBlocks.CYAN_TULIP.asItem());
        getOrCreateTagBuilder(FloralTags.Items.LIGHT_BLUE_FLOWERS)
                .add(FloralBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(Blocks.BLUE_ORCHID.asItem());
        getOrCreateTagBuilder(FloralTags.Items.BLUE_FLOWERS)
                .add(FloralBlocks.BLUE_TULIP.asItem())
                .add(Blocks.CORNFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.PURPLE_FLOWERS)
                .add(FloralBlocks.PURPLE_WOLFSBANE.asItem())
                .add(FloralBlocks.PURPLE_TULIP.asItem())
                .add(FloralBlocks.PURPLE_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.MAGENTA_FLOWERS)
                .add(FloralBlocks.MAGENTA_TULIP.asItem())
                .add(FloralBlocks.MAGENTA_CABARET.asItem())
                .add(Blocks.ALLIUM.asItem());
        getOrCreateTagBuilder(FloralTags.Items.PINK_FLOWERS)
                .add(FloralBlocks.PINK_ALCEA.asItem())
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
                .add(FloralBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_GREEN_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_CYAN_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_LIGHT_BLUE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_BLUE_FLOWERS);
        getOrCreateTagBuilder(FloralTags.Items.TALL_PURPLE_FLOWERS)
                .add(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_MAGENTA_FLOWERS)
                .add(Blocks.LILAC.asItem());
        getOrCreateTagBuilder(FloralTags.Items.TALL_PINK_FLOWERS)
                .add(Blocks.PEONY.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(FloralBlocks.STEM_STAIRS.asItem())
                .add(FloralBlocks.FLORAL_STONE_STAIRS.asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_STAIRS.asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(FloralBlocks.FLORAL_STONE_SLAB.asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_SLAB.asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(FloralBlocks.FLORAL_STONE_WALL.asItem())
                .add(FloralBlocks.FLORAL_STONE_BRICK_WALL.asItem())
                .add(FloralBlocks.COBBLED_FLORAL_STONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(FloralBlocks.STEM_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(FloralBlocks.STEM_LOG.asItem())
                .add(FloralBlocks.STEM_WOOD.asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(FloralBlocks.STEM_LOG.asItem())
                .add(FloralBlocks.STEM_WOOD.asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.asItem());

        getOrCreateTagBuilder(FloralTags.Items.STEM_LOGS)
                .add(FloralBlocks.STEM_LOG.asItem())
                .add(FloralBlocks.STEM_WOOD.asItem())
                .add(FloralBlocks.STRIPPED_STEM_LOG.asItem())
                .add(FloralBlocks.STRIPPED_STEM_WOOD.asItem());

    }

}
