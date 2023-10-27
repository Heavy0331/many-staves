package com.heavy0331.manystaves;

import com.heavy0331.manystaves.block.ModBlocks;
import com.heavy0331.manystaves.item.ModItems;
import com.heavy0331.manystaves.item.ModItemsGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Release in some form by version 0.1.0
public class ManyStaves implements ModInitializer {
	public static final String MOD_ID = "manystaves";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("ManyStaves is initializing!");
		ModItemsGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}