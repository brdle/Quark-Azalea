package net.onvoid.quarkazalea.common;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.quarkazalea.QuarkAzalea;
import samebutdifferent.azalea.registry.ModBlocks;

@Mod.EventBusSubscriber(modid = QuarkAzalea.MODID)
public class QuarkAzaleaItems {
    public static final ItemSubRegistryHelper HELPER = QuarkAzalea.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> AZALEA_BOAT = HELPER.createBoatItem("azalea", ModBlocks.AZALEA_PLANKS);
    public static final RegistryObject<Item> FLOWERING_AZALEA_BOAT = HELPER.createBoatItem("flowering_azalea", ModBlocks.FLOWERING_AZALEA_PLANKS);
}
