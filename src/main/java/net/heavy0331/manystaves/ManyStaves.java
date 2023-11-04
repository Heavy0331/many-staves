package net.heavy0331.manystaves;

import net.heavy0331.manystaves.block.ModBlocks;
import net.heavy0331.manystaves.item.MSItems;
import net.heavy0331.manystaves.item.MSItemsGroup;
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
		MSItemsGroup.registerItemGroups();
		MSItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}