package net.onvoid.quarkazalea.common;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.quarkazalea.QuarkAzalea;

@Mod.EventBusSubscriber(modid = QuarkAzalea.MODID)
public class QuarkAzaleaItems {
    public static final ItemSubRegistryHelper HELPER = QuarkAzalea.REGISTRY_HELPER.getItemSubHelper();

    //public static final RegistryObject<Item> GLOWING_MOSS_PASTE = HELPER.createCompatItem("glowing_moss_paste", new Item.Properties(), CreativeModeTab.TAB_MATERIALS, CompatOPlenty.QUARK_ID);
}
