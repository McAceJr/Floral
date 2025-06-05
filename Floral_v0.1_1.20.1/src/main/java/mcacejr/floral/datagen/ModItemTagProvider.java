package mcacejr.floral.datagen;

import mcacejr.floral.block.ModBlocks;
import mcacejr.floral.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
                .add(ModBlocks.PURPLE_BELLFLOWER.asItem())
                .add(ModBlocks.PURPLE_CHIMNEY_BELLFLOWER.asItem())
                .add(ModBlocks.GREEN_CONEFLOWER.asItem())
                .add(ModBlocks.BLUE_AUBRIETAS.asItem());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PETUNIA_LANCE)
                .add(ModItems.CORPSE_BLOSSOM);

    }

}
