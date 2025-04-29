package com.mario.mod.item;

import com.mario.mod.Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = register("ruby", new Item(new FabricItemSettings()));

    private static void addItemsToIngredient(FabricItemGroupEntries entries)
    {
        entries.add(RUBY);
    }

    private static Item register(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Mod.MOD_ID, name), item);
    }

    public static void regModItems(){
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredient);
    }
}
