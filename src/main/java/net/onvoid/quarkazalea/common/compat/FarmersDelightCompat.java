package net.onvoid.quarkazalea.common.compat;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import java.util.function.Supplier;

public class FarmersDelightCompat {
    public static final Supplier<Block> AZALEA_CABINET = () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
    public static final Supplier<Block> FLOWERING_AZALEA_CABINET = () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
    public static final Supplier<Block> BLOSSOM_CABINET = () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
}