package net.onvoid.quarkazalea.common;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.common.block.*;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.common.block.wood.WoodPostBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.quarkazalea.QuarkAzalea;
import samebutdifferent.azalea.registry.ModBlocks;

@Mod.EventBusSubscriber(modid = QuarkAzalea.MODID)
public class QuarkAzaleaBlocks {
public static final BlockSubRegistryHelper HELPER = QuarkAzalea.REGISTRY_HELPER.getBlockSubHelper();

    public static final String AZALEA_MODID = "azalea";
    public static final String QUARK_MODID = "quark";
    public static final String MORECRAFTINGTABLES_MODID = "mctb";

    // Azalea
    public static final RegistryObject<Block> AZALEA_VERTICAL_SLAB = HELPER.createCompatFuelBlock(QUARK_MODID, "azalea_vertical_slab",() -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(ModBlocks.AZALEA_PLANKS.get())), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AZALEA_BOOKSHELF = HELPER.createCompatFuelBlock(QUARK_MODID, "azalea_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(1.5f).sound(SoundType.WOOD)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AZALEA_LADDER = HELPER.createCompatFuelBlock(QUARK_MODID, "azalea_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).strength(0.4f).noOcclusion().sound(SoundType.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_AZALEA_POST = HELPER.createCompatFuelBlock(QUARK_MODID, "stripped_azalea_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(ModBlocks.AZALEA_PLANKS.get())), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AZALEA_POST = HELPER.createCompatFuelBlock(QUARK_MODID, "azalea_post", () -> new WoodPostBlock(STRIPPED_AZALEA_POST,  BlockBehaviour.Properties.copy(ModBlocks.AZALEA_PLANKS.get())), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AZALEA_HEDGE = HELPER.createCompatFuelBlock(QUARK_MODID, "azalea_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(ModBlocks.AZALEA_PLANKS.get())), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> AZALEA_CHESTS = HELPER.createCompatChestBlocks(QUARK_MODID, "azalea", MaterialColor.COLOR_RED);
    public static final RegistryObject<Block> AZALEA_CRAFTING_TABLE = HELPER.createCompatFuelBlock(MORECRAFTINGTABLES_MODID, "azalea_crafting_table", () -> new AzaleaCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)), 300, CreativeModeTab.TAB_DECORATIONS);
    // Flowering Azalea
    public static final RegistryObject<Block> FLOWERING_AZALEA_VERTICAL_SLAB = HELPER.createCompatFuelBlock(QUARK_MODID, "flowering_azalea_vertical_slab",() -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(ModBlocks.FLOWERING_AZALEA_PLANKS.get())), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FLOWERING_AZALEA_BOOKSHELF = HELPER.createCompatFuelBlock(QUARK_MODID, "flowering_azalea_bookshelf", () -> new BookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(1.5f).sound(SoundType.WOOD)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FLOWERING_AZALEA_LADDER = HELPER.createCompatFuelBlock(QUARK_MODID, "flowering_azalea_ladder", () -> new BlueprintLadderBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).strength(0.4f).noOcclusion().sound(SoundType.LADDER)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FLOWERING_AZALEA_POST = HELPER.createCompatFuelBlock(QUARK_MODID, "flowering_azalea_post", () -> new WoodPostBlock(STRIPPED_AZALEA_POST,  BlockBehaviour.Properties.copy(ModBlocks.FLOWERING_AZALEA_PLANKS.get())), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FLOWERING_AZALEA_HEDGE = HELPER.createCompatFuelBlock(QUARK_MODID, "flowering_azalea_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(ModBlocks.FLOWERING_AZALEA_PLANKS.get())), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> FLOWERING_AZALEA_CHESTS = HELPER.createCompatChestBlocks(QUARK_MODID, "flowering_azalea", MaterialColor.COLOR_RED);
    public static final RegistryObject<Block> FLOWERING_AZALEA_CRAFTING_TABLE = HELPER.createCompatFuelBlock(MORECRAFTINGTABLES_MODID, "flowering_azalea_crafting_table", () -> new AzaleaCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)), 300, CreativeModeTab.TAB_DECORATIONS);
    // Blossom
    public static final RegistryObject<Block> BLOSSOM_CRAFTING_TABLE = HELPER.createCompatFuelBlock(MORECRAFTINGTABLES_MODID, "blossom_crafting_table", () -> new AzaleaCraftingTableBlock(BlockBehaviour.Properties.copy(Blocks.CRAFTING_TABLE)), 300, CreativeModeTab.TAB_DECORATIONS);
}
