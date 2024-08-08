package net.yusme.mccourse;

import net.fabricmc.api.ModInitializer;

import net.yusme.mccourse.block.ModBlocks;
import net.yusme.mccourse.item.ModItemGroups;
import net.yusme.mccourse.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {

	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}