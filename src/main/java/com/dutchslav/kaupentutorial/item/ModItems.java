package com.dutchslav.kaupentutorial.item;

import com.dutchslav.kaupentutorial.KaupenTutorial;
import com.dutchslav.kaupentutorial.item.custom.EightBallItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KaupenTutorial.MOD_ID);

    public static final RegistryObject<Item> METHAMPHETAMINE = ITEMS.register("methamphetamine", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.DRUG_TAB)));

    public static final RegistryObject<Item> RAW_METHAMPHETAMINE = ITEMS.register("raw_methamphetamine", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.DRUG_TAB)));

        public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball", () -> new EightBallItem(
            new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
