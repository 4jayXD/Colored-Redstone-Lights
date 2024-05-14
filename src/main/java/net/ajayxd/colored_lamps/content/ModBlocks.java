package net.ajayxd.colored_lamps.content;

import net.ajayxd.colored_lamps.ColouredLamps;
import net.ajayxd.colored_lamps.foundation.custom.block.DimmableLamp;
import net.ajayxd.colored_lamps.foundation.custom.block.LedLamp;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    /* ------------ Redstone Lamp ------------ */
    public static final Block REDSTONE_LAMP_LED;

    public static final Block REDSTONE_LAMP_WHITE;
    public static final Block REDSTONE_LAMP_LIGHT_GRAY;
    public static final Block REDSTONE_LAMP_GRAY;
    public static final Block REDSTONE_LAMP_BROWN;
    public static final Block REDSTONE_LAMP_RED;
    public static final Block REDSTONE_LAMP_ORANGE;
    public static final Block REDSTONE_LAMP_YELLOW;
    public static final Block REDSTONE_LAMP_GREEN;
    public static final Block REDSTONE_LAMP_DARK_GREEN;
    public static final Block REDSTONE_LAMP_CYAN;
    public static final Block REDSTONE_LAMP_LIGHT_BLUE;
    public static final Block REDSTONE_LAMP_BLUE;
    public static final Block REDSTONE_LAMP_PURPLE;
    public static final Block REDSTONE_LAMP_MAGENTA;
    public static final Block REDSTONE_LAMP_PINK;

    public static final Block DIMMABLE_REDSTONE_LAMP;

    public static final Block DIMMABLE_REDSTONE_LAMP_WHITE;
    public static final Block DIMMABLE_REDSTONE_LAMP_BROWN;
    public static final Block DIMMABLE_REDSTONE_LAMP_RED;
    public static final Block DIMMABLE_REDSTONE_LAMP_ORANGE;
    public static final Block DIMMABLE_REDSTONE_LAMP_YELLOW;
    public static final Block DIMMABLE_REDSTONE_LAMP_GREEN;
    public static final Block DIMMABLE_REDSTONE_LAMP_CYAN;
    public static final Block DIMMABLE_REDSTONE_LAMP_LIGHT_BLUE;
    public static final Block DIMMABLE_REDSTONE_LAMP_BLUE;
    public static final Block DIMMABLE_REDSTONE_LAMP_PURPLE;
    public static final Block DIMMABLE_REDSTONE_LAMP_MAGENTA;
    public static final Block DIMMABLE_REDSTONE_LAMP_PINK;
    /* --------------------------------------- */

    /*  */

    static
    {
        /* Redstone Lamp */
        REDSTONE_LAMP_LED = registerBlock("redstone_lamp_led",
                new LedLamp(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_WHITE = registerBlock("redstone_lamp_white",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_LIGHT_GRAY = registerBlock("redstone_lamp_light_gray",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_GRAY = registerBlock("redstone_lamp_gray",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_BROWN = registerBlock("redstone_lamp_brown",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_RED = registerBlock("redstone_lamp_red",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_ORANGE = registerBlock("redstone_lamp_orange",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_YELLOW = registerBlock("redstone_lamp_yellow",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_GREEN = registerBlock("redstone_lamp_green",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_DARK_GREEN = registerBlock("redstone_lamp_dark_green",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_CYAN = registerBlock("redstone_lamp_cyan",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_LIGHT_BLUE = registerBlock("redstone_lamp_light_blue",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_BLUE = registerBlock("redstone_lamp_blue",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_PURPLE = registerBlock("redstone_lamp_purple",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_MAGENTA = registerBlock("redstone_lamp_magenta",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));

        REDSTONE_LAMP_PINK = registerBlock("redstone_lamp_pink",
                new RedstoneLampBlock(Blocks.REDSTONE_LAMP.getSettings()));



        DIMMABLE_REDSTONE_LAMP = registerBlock("dimmable_redstone_lamp",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_WHITE = registerBlock("dimmable_redstone_lamp_white",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_BROWN = registerBlock("dimmable_redstone_lamp_brown",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_RED = registerBlock("dimmable_redstone_lamp_red",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_ORANGE = registerBlock("dimmable_redstone_lamp_orange",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_YELLOW = registerBlock("dimmable_redstone_lamp_yellow",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_GREEN = registerBlock("dimmable_redstone_lamp_green",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_CYAN = registerBlock("dimmable_redstone_lamp_cyan",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_LIGHT_BLUE = registerBlock("dimmable_redstone_lamp_light_blue",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_BLUE = registerBlock("dimmable_redstone_lamp_blue",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_PURPLE = registerBlock("dimmable_redstone_lamp_purple",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_MAGENTA = registerBlock("dimmable_redstone_lamp_magenta",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        DIMMABLE_REDSTONE_LAMP_PINK = registerBlock("dimmable_redstone_lamp_pink",
                new DimmableLamp(Blocks.REDSTONE_LAMP.getSettings()));

        /* Copper Bulb */
    }

    private static Block registerBlock(String name, Block block)
    {
        Registry.register(Registries.ITEM, new Identifier(ColouredLamps.MODID, name), new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, new Identifier(ColouredLamps.MODID, name), block);
    }
    public static void registerBlocks() {
        ColouredLamps.LOGGER.info("Registering Coloured Lamps");
    }
}