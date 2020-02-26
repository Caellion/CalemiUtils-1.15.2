package calemiutils.init;

import calemiutils.CUReference;
import calemiutils.CalemiUtils;
import calemiutils.block.base.BlockBase;
import calemiutils.block.base.BlockRaritaniumOre;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(CUReference.MOD_ID)
@Mod.EventBusSubscriber(modid = CUReference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class InitBlocks {

    public static final Block RARITANIUM_ORE = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {

        event.getRegistry().register(new BlockRaritaniumOre());
    }

    @SubscribeEvent
    public static void registerBlocksItems(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new BlockItem(RARITANIUM_ORE, new Item.Properties().group(CalemiUtils.TAB)).setRegistryName("raritanium_ore"));
    }
}
