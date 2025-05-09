package com.mario.mod.item;

import com.mario.mod.Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = register("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = register("raw_ruby", new Item(new FabricItemSettings()));

    private static Item register(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Mod.MOD_ID, name), item);
    }

    public static void regModItems(){
        Mod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);
    }
}
