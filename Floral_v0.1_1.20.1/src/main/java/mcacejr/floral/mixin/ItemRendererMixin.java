package mcacejr.floral.mixin;


import mcacejr.floral.Floral;
import mcacejr.floral.item.FloralItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useCorpseBlossomModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                                             MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(FloralItems.CORPSE_BLOSSOM) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(
                    new ModelIdentifier(Floral.MOD_ID, "corpse_blossom_3d", "inventory"));
        }
        return value;
    }
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useDeadheader(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded,
                                             MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(FloralItems.DEADHEADER) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(
                    new ModelIdentifier(Floral.MOD_ID, "deadheader_3d", "inventory"));
        }
        return value;
    }

}
