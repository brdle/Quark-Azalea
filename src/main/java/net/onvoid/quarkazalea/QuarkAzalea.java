package net.onvoid.quarkazalea;

import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.quarkazalea.common.QuarkAzaleaBlocks;
import net.onvoid.quarkazalea.proxy.ClientProxy;
import net.onvoid.quarkazalea.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(QuarkAzalea.MODID)
public class QuarkAzalea
{
    public static final String MODID = "quarkazalea";
    public static QuarkAzalea instance;
    public static CommonProxy proxy;
    private static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public QuarkAzalea() {
        instance = this;
        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.start();
    }
}
