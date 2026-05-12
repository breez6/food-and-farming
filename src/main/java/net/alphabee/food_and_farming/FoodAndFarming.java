package net.alphabee.food_and_farming;

import net.alphabee.food_and_farming.block.ModBlocks;
import net.alphabee.food_and_farming.creativemodetab.ModCreativeModeTabs;
import net.alphabee.food_and_farming.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodAndFarming implements ModInitializer {
	public static final String MOD_ID = "food-and-farming";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTabs.registerModCreativeModeTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}