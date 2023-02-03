package com.chaos.jujutsucrusade.item;

import com.chaos.jujutsucrusade.JujutsuCrusade;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JujutsuCrusade.MOD_ID);

    public static final RegistryObject<Item> CURSED_METAL = ITEMS.register("cursed_metal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JUJUTSU_CRUSADE_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

