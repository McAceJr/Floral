package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import mcacejr.floral.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

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
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem())
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());

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
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem());

        getOrCreateTagBuilder(ItemTags.TALL_FLOWERS)
                .add(ModBlocks.PINK_ALCEA.asItem())
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PETUNIA_LANCE)
                .add(ModItems.CORPSE_BLOSSOM)
                .add(ModItems.DEADHEADER);

        getOrCreateTagBuilder(ModTags.Items.FLOWER_TRIMMERS)
                .add(ModItems.FLOWER_TRIMMER)
                .add(ModItems.DEADHEADER);

        getOrCreateTagBuilder(ModTags.Items.WHITE_FLOWERS)
                .add(Blocks.WHITE_TULIP.asItem())
                .add(Blocks.LILY_OF_THE_VALLEY.asItem());
        getOrCreateTagBuilder(ModTags.Items.LIGHT_GRAY_FLOWERS)
                .add(Blocks.AZURE_BLUET.asItem())
                .add(Blocks.OXEYE_DAISY.asItem())
                .add(ModBlocks.LIGHT_GRAY_TULIP.asItem());
        getOrCreateTagBuilder(ModTags.Items.GRAY_FLOWERS)
                .add(ModBlocks.GRAY_TULIP.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLACK_FLOWERS)
                .add(ModBlocks.BLACK_TULIP.asItem())
                .add(ModBlocks.WARDEN_PRIMROSE.asItem())
                .add(ModBlocks.BLACK_PETUNIA.asItem());
        getOrCreateTagBuilder(ModTags.Items.RED_FLOWERS)
                .add(ModBlocks.RED_PETUNIA.asItem())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.RED_TULIP.asItem());
        getOrCreateTagBuilder(ModTags.Items.ORANGE_FLOWERS)
                .add(Blocks.ORANGE_TULIP.asItem())
                .add(ModBlocks.ROCKY_SEDUM.asItem())
                .add(Blocks.TORCHFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.BROWN_FLOWERS)
                .add(ModBlocks.WEEPING_ROOTS.asItem())
                .add(ModBlocks.TWISTING_ROOTS.asItem())
                .add(ModBlocks.BROWN_TULIP.asItem());
        getOrCreateTagBuilder(ModTags.Items.YELLOW_FLOWERS)
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(Blocks.DANDELION.asItem());
        getOrCreateTagBuilder(ModTags.Items.LIME_FLOWERS)
                .add(ModBlocks.LIME_TULIP.asItem())
                .add(ModBlocks.LIME_BELLFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.GREEN_FLOWERS)
                .add(ModBlocks.GREEN_TULIP.asItem())
                .add(ModBlocks.GREEN_DAHLIA.asItem())
                .add(ModBlocks.GREEN_CONEFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.CYAN_FLOWERS)
                .add(ModBlocks.CYAN_TULIP.asItem());
        getOrCreateTagBuilder(ModTags.Items.LIGHT_BLUE_FLOWERS)
                .add(ModBlocks.LIGHT_BLUE_TULIP.asItem())
                .add(Blocks.BLUE_ORCHID.asItem());
        getOrCreateTagBuilder(ModTags.Items.BLUE_FLOWERS)
                .add(ModBlocks.BLUE_TULIP.asItem())
                .add(Blocks.CORNFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_TULIP.asItem())
                .add(ModBlocks.PURPLE_BELLFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.MAGENTA_FLOWERS)
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.MAGENTA_CABARET.asItem())
                .add(Blocks.ALLIUM.asItem());
        getOrCreateTagBuilder(ModTags.Items.PINK_FLOWERS)
                .add(ModBlocks.PINK_ALCEA.asItem())
                .add(Blocks.PINK_TULIP.asItem());

        getOrCreateTagBuilder(ModTags.Items.TALL_WHITE_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_LIGHT_GRAY_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_GRAY_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_BLACK_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_RED_FLOWERS)
                .add(Blocks.ROSE_BUSH.asItem());
        getOrCreateTagBuilder(ModTags.Items.TALL_ORANGE_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_BROWN_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_YELLOW_FLOWERS)
                .add(Blocks.SUNFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.TALL_LIME_FLOWERS)
                .add(ModBlocks.LIME_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.TALL_GREEN_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_CYAN_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_LIGHT_BLUE_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_BLUE_FLOWERS);
        getOrCreateTagBuilder(ModTags.Items.TALL_PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem());
        getOrCreateTagBuilder(ModTags.Items.TALL_MAGENTA_FLOWERS)
                .add(Blocks.LILAC.asItem());
        getOrCreateTagBuilder(ModTags.Items.TALL_PINK_FLOWERS)
                .add(Blocks.PEONY.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
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

    }

}
