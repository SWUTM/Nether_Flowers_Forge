package net.swutm.netherflowers;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.swutm.netherflowers.block.ModBlocks;
import net.swutm.netherflowers.item.ModItems;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(netherflowers.MOD_ID)
public class netherflowers
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "netherflowers";

    private static final Logger LOGGER = LogUtils.getLogger();

    public netherflowers()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_ORCHID.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_OXEYE_DAISY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERRACK_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEACE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_DANDELION.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_LILY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_TULIP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_ALLIUM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_CORNFLOWER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_CRIMSON.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_POPPY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_TULIP.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getName());
    }
}
