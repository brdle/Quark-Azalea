package net.onvoid.quarkazalea.proxy;

import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.quarkazalea.QuarkAzalea;
import net.onvoid.quarkazalea.common.QuarkAzaleaBlocks;

public class CommonProxy {

    public void start() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        QuarkAzalea.REGISTRY_HELPER.register(modBus);
        modBus.addListener(this::setup);
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent e) {
        e.enqueueWork(() -> {
            // Azalea
            DataUtil.registerFlammable(QuarkAzaleaBlocks.AZALEA_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.STRIPPED_AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.AZALEA_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.AZALEA_BOOKSHELF.get(), 30, 20);
            // Flowering Azalea
            DataUtil.registerFlammable(QuarkAzaleaBlocks.FLOWERING_AZALEA_HEDGE.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.FLOWERING_AZALEA_POST.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.FLOWERING_AZALEA_VERTICAL_SLAB.get(), 5, 20);
            DataUtil.registerFlammable(QuarkAzaleaBlocks.FLOWERING_AZALEA_BOOKSHELF.get(), 30, 20);
        });
    }
}
