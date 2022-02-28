package net.onvoid.quarkazalea.proxy;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.AtlasSet;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.quarkazalea.common.QuarkAzaleaBlocks;

public class ClientProxy extends CommonProxy {

    @Override
    public void start() {
        super.start();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        modBus.addListener(this::setupClient);
    }

    @SubscribeEvent
    public void setupClient(FMLClientSetupEvent e){
        // Azalea
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.AZALEA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.STRIPPED_AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.AZALEA_HEDGE.get(), RenderType.cutout());
        // Flowering Azalea
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.FLOWERING_AZALEA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.FLOWERING_AZALEA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(QuarkAzaleaBlocks.FLOWERING_AZALEA_HEDGE.get(), RenderType.cutout());
    }
}
