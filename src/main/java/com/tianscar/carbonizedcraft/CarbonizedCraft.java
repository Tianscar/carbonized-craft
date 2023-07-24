package com.tianscar.carbonizedcraft;

import com.tianscar.carbonizedcraft.block.Blocks;
import com.tianscar.carbonizedcraft.enchantment.Enchantments;
import com.tianscar.carbonizedcraft.item.Items;
import com.tianscar.carbonizedcraft.potion.Potions;
import com.tianscar.carbonizedcraft.recipe.BrewingRecipes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarbonizedCraft implements ModInitializer {

	public static final String NAMESPACE = "carbonized";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("Carbonized");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("!!! CARBONIZING !!!");
		Blocks.register();
		Items.register();
		Enchantments.register();
		Potions.register();
		BrewingRecipes.register();
		LOGGER.info("!!! CARBONIZED !!!");
	}

}