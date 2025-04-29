package com.mario.mod;

import com.mario.mod.block.ModBlocks;
import com.mario.mod.item.ModItemGroup;
import com.mario.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
	public static final String MOD_ID = "mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroup.regItemGroups();
		ModItems.regModItems();
		ModBlocks.regModBlocks();
	}
}