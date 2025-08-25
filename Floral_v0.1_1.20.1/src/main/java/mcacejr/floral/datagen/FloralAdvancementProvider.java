package mcacejr.floral.datagen;

import mcacejr.floral.Floral;
import mcacejr.floral.block.FloralBlocks;
import mcacejr.floral.item.FloralItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FloralAdvancementProvider extends FabricAdvancementProvider {
    public static final List<Block> FLOWERS = List.of(
            FloralBlocks.BLACK_PETUNIA,
            FloralBlocks.RED_PETUNIA,
            Blocks.SPORE_BLOSSOM,
            FloralBlocks.PURPLE_BELLFLOWER,
            FloralBlocks.PURPLE_CHIMNEY_BELLFLOWER,
            FloralBlocks.GREEN_CONEFLOWER,
            FloralBlocks.LIGHT_GRAY_TULIP,
            FloralBlocks.GRAY_TULIP,
            FloralBlocks.BLACK_TULIP,
            FloralBlocks.BROWN_TULIP,
            FloralBlocks.YELLOW_TULIP,
            FloralBlocks.LIME_TULIP,
            FloralBlocks.GREEN_TULIP,
            FloralBlocks.CYAN_TULIP,
            FloralBlocks.LIGHT_BLUE_TULIP,
            FloralBlocks.BLUE_TULIP,
            FloralBlocks.PURPLE_TULIP,
            FloralBlocks.MAGENTA_TULIP,
            FloralBlocks.GREEN_DAHLIA,
            FloralBlocks.MAGENTA_CABARET,
            FloralBlocks.LIME_BELLFLOWER,
            FloralBlocks.LIME_CHIMNEY_BELLFLOWER,
            FloralBlocks.PURPLE_WOLFSBANE,
            Blocks.PINK_PETALS,
            Blocks.SUNFLOWER,
            Blocks.LILAC,
            Blocks.PEONY,
            Blocks.ROSE_BUSH,
            Blocks.DANDELION,
            Blocks.POPPY,
            Blocks.BLUE_ORCHID,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.RED_TULIP,
            Blocks.ORANGE_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.OXEYE_DAISY,
            Blocks.CORNFLOWER,
            Blocks.LILY_OF_THE_VALLEY,
            Blocks.WITHER_ROSE,
            Blocks.TORCHFLOWER
    );

    public FloralAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    public Advancement getAdvancement(String id) {
        return Advancement.Builder.create().build(new Identifier("minecraft", id));
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement getFlowerTrimmers = Advancement.Builder.create()
                .parent(getAdvancement("husbandry/root"))
                .display(
                        FloralItems.FLOWER_TRIMMER,
                        Text.translatable("advancements.husbandry.get_flower_trimmers.title"),
                        Text.translatable("advancements.husbandry.get_flower_trimmers.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("flower_trimmers", InventoryChangedCriterion.Conditions.items(FloralItems.FLOWER_TRIMMER))
                .build(consumer, Floral.MOD_ID + ":husbandry/get_flower_trimmers");

        Advancement getDeadheader = Advancement.Builder.create()
                .parent(getFlowerTrimmers)
                .display(
                        FloralItems.DEADHEADER,
                        Text.translatable("advancements.husbandry.get_deadheader.title"),
                        Text.translatable("advancements.husbandry.get_deadheader.description"),
                        null,
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        true
                )
                .criterion("deadheader", InventoryChangedCriterion.Conditions.items(FloralItems.DEADHEADER))
                .build(consumer, Floral.MOD_ID + ":husbandry/get_deadheader");

        Advancement getCorpseBlossom = Advancement.Builder.create()
                .parent(getFlowerTrimmers)
                .display(
                        FloralItems.CORPSE_BLOSSOM,
                        Text.translatable("advancements.husbandry.get_corpse_blossom.title"),
                        Text.translatable("advancements.husbandry.get_corpse_blossom.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("corpse_blossom", InventoryChangedCriterion.Conditions.items(FloralItems.CORPSE_BLOSSOM))
                .build(consumer, Floral.MOD_ID + ":husbandry/get_corpse_blossom");

        Advancement getFloralBane = Advancement.Builder.create()
                .parent(getFlowerTrimmers)
                .display(
                        FloralItems.FLORAL_BANE,
                        Text.translatable("advancements.husbandry.get_floral_bane.title"),
                        Text.translatable("advancements.husbandry.get_floral_bane.description"),
                        null,
                        AdvancementFrame.TASK,
                        true,
                        true,
                        false
                )
                .criterion("floral_bane", InventoryChangedCriterion.Conditions.items(FloralItems.FLORAL_BANE))
                .build(consumer, Floral.MOD_ID + ":husbandry/get_floral_bane");

        Advancement getAllFlowers = addFlowers(Advancement.Builder.create()
                        .parent(getAdvancement("husbandry/root"))
                        .display(
                                Items.POPPY,
                                Text.translatable("advancements.husbandry.get_all_flowers.title"),
                                Text.translatable("advancements.husbandry.get_all_flowers.description"),
                                null,
                                AdvancementFrame.CHALLENGE,
                                true,
                                true,
                                false
                        ),
                FLOWERS.stream())
                .build(consumer, Floral.MOD_ID + ":husbandry/get_all_flowers");
    }

    private static Advancement.Builder addFlowers(Advancement.Builder builder, Stream<Block> flowers) {
        flowers.forEach(flower ->
                builder.criterion(flower.getTranslationKey(), InventoryChangedCriterion.Conditions.items(flower)));

        return builder;
    }

}
