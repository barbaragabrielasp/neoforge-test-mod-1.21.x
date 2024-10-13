package com.example.net.salamandemon.testmod.item;

import com.example.net.salamandemon.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> LAURA = ITEMS.register("laura",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PAULO = ITEMS.register("paulo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
