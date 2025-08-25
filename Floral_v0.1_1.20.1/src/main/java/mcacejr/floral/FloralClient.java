package mcacejr.floral;

import mcacejr.floral.block.FloralBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

public class FloralClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BLACK_PETUNIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_BLACK_PETUNIA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.RED_PETUNIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_RED_PETUNIA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PURPLE_BELLFLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_PURPLE_BELLFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.GREEN_CONEFLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_GREEN_CONEFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BLUE_AUBRIETAS, RenderLayer.getCutout());

        ColorProviderRegistry.BLOCK.register((state, view, pos,
                                              tintIndex)-> GrassColors.getDefaultColor(), FloralBlocks.BLUE_AUBRIETAS);

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PINK_ALCEA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PINK_ALCEA_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.THICK_STALK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.THICK_STALK_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.THICK_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.THICK_VINES_PLANT, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIGHT_GRAY_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_LIGHT_GRAY_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.GRAY_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_GRAY_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BLACK_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_BLACK_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BROWN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_BROWN_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.YELLOW_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_YELLOW_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIME_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_LIME_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.GREEN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_GREEN_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.CYAN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_CYAN_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIGHT_BLUE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIGHT_BLUE_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BLUE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_BLUE_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PURPLE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_PURPLE_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.MAGENTA_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_MAGENTA_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.GREEN_DAHLIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_GREEN_DAHLIA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.MAGENTA_CABARET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_MAGENTA_CABARET, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIME_BELLFLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_LIME_BELLFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.LIME_CHIMNEY_BELLFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.PURPLE_WOLFSBANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.POTTED_PURPLE_WOLFSBANE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.WEEPING_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.TWISTING_ROOTS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.WARDEN_PRIMROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.ROCKY_SEDUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.STEM_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.BONES_BANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.CHORUS_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.WHITE_OVERFLOWING_BELLFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.STEM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FloralBlocks.STEM_TRAPDOOR, RenderLayer.getCutout());

    }

}
