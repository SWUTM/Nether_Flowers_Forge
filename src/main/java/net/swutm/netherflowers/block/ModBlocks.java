package net.swutm.netherflowers.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.netherflowers.item.ModItems;
import net.swutm.netherflowers.netherflowers;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, netherflowers.MOD_ID);

    public static final RegistryObject<Block> CRIMSON_ORCHID = registerBlock("crimson_orchid",
            () -> new RootsBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_ROOTS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> CRIMSON_OXEYE_DAISY = registerBlock("crimson_oxeye_daisy",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> CRIMSON_TULIP = registerBlock("crimson_tulip",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> NETHERRACK_TULIP = registerBlock("netherrack_tulip",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> PEACE = registerBlock("peace",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SOUL_DANDELION = registerBlock("soul_dandelion",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SOUL_LILY = registerBlock("soul_lily",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SOUL_TULIP = registerBlock("soul_tulip",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WARPED_ALLIUM = registerBlock("warped_allium",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WARPED_CORNFLOWER = registerBlock("warped_cornflower",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WARPED_CRIMSON = registerBlock("warped_crimson",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WARPED_POPPY = registerBlock("warped_poppy",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> WARPED_TULIP = registerBlock("warped_tulip",
            () -> new RootsBlock(
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_FUNGUS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);







    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name,block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
