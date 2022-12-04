package com.dutchslav.kaupentutorial.block;

import com.dutchslav.kaupentutorial.KaupenTutorial;
import com.dutchslav.kaupentutorial.block.custom.JumpyBlock;
import com.dutchslav.kaupentutorial.block.custom.LightBulbBlock;
import com.dutchslav.kaupentutorial.item.ModCreativeModeTab;
import com.dutchslav.kaupentutorial.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KaupenTutorial.MOD_ID);

    public static final RegistryObject<Block> METHAMPHETAMINE_BLOCK = registerBlock("methamphetamine_block", () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
            .strength(1f).sound(SoundType.SAND)), ModCreativeModeTab.DRUG_TAB);

    public static final RegistryObject<Block> RAW_METHAMPHETAMINE_BLOCK = registerBlock("raw_methamphetamine_block", () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
            .strength(1f).sound(SoundType.SAND)), ModCreativeModeTab.DRUG_TAB);

    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block", () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.METAL)
            .strength(2f).sound(SoundType.METAL)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> LIGHT_BULB_BLOCK = registerBlock("light_bulb_block", () -> new LightBulbBlock(BlockBehaviour.Properties.of(Material.GLASS)
            .strength(2f).sound(SoundType.GLASS).lightLevel(state -> state.getValue(LightBulbBlock.LIT) ? 15 : 0)), CreativeModeTab.TAB_DECORATIONS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
