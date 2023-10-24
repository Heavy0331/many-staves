package com.heavy0331.manystaves;

import com.heavy0331.manystaves.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManyStaves implements ModInitializer {
	public static final String MOD_ID = "manystaves";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("ManyStaves is initializing!");
		ModItems.registerModItems();
	}
}