package com.dutchslav.kaupentutorial.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DRUG_TAB = new CreativeModeTab("drug_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.METHAMPHETAMINE.get());
        }
    };
}
