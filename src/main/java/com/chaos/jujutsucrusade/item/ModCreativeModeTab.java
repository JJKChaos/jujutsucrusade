package com.chaos.jujutsucrusade.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JUJUTSU_CRUSADE_TAB = new CreativeModeTab("jujutsutab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CURSED_METAL.get());
        }
    };
}
