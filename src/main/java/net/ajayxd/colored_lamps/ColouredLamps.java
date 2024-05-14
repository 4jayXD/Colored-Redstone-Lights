package net.ajayxd.colored_lamps;

import net.ajayxd.colored_lamps.content.ModBlocks;
import net.ajayxd.colored_lamps.foundation.ModCreativeTabs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColouredLamps implements ModInitializer, ClientModInitializer
{
	public static final String MODID = "colored_lamps";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize()
	{
		ModBlocks.registerBlocks();
		ModCreativeTabs.registerItemGroups();
	}

	@Override
	public void onInitializeClient()
	{

	}
}