package net.ajayxd.colored_lamps.foundation;

import net.ajayxd.colored_lamps.ColouredLamps;
import net.ajayxd.colored_lamps.content.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModCreativeTabs
{
    public static final ItemGroup COLOURED_REDSTONE_LAMPS_TAB;
    public static final ItemGroup DIMMABLE_REDSTONE_LAMPS_TAB;
    public static final ItemGroup SPECIAL_TAB;

    static
    {
        COLOURED_REDSTONE_LAMPS_TAB = registerItemGroup("item_group_coloured_lamps",
                FabricItemGroup.builder()
                        .displayName(Text.literal("Colored Lamps"))
                        .icon(() -> new ItemStack(ModBlocks.REDSTONE_LAMP_WHITE))
                        .entries(((displayContext, entries) ->
                        {

                            entries.add(ModBlocks.REDSTONE_LAMP_WHITE);
                            entries.add(ModBlocks.REDSTONE_LAMP_LIGHT_GRAY);
                            entries.add(ModBlocks.REDSTONE_LAMP_GRAY);
                            entries.add(ModBlocks.REDSTONE_LAMP_BROWN);
                            entries.add(ModBlocks.REDSTONE_LAMP_RED);
                            entries.add(ModBlocks.REDSTONE_LAMP_ORANGE);
                            entries.add(ModBlocks.REDSTONE_LAMP_YELLOW);
                            entries.add(ModBlocks.REDSTONE_LAMP_GREEN);
                            entries.add(ModBlocks.REDSTONE_LAMP_DARK_GREEN);
                            entries.add(ModBlocks.REDSTONE_LAMP_CYAN);
                            entries.add(ModBlocks.REDSTONE_LAMP_LIGHT_BLUE);
                            entries.add(ModBlocks.REDSTONE_LAMP_BLUE);
                            entries.add(ModBlocks.REDSTONE_LAMP_PURPLE);
                            entries.add(ModBlocks.REDSTONE_LAMP_MAGENTA);
                            entries.add(ModBlocks.REDSTONE_LAMP_PINK);

                        }
                        )).build());

        DIMMABLE_REDSTONE_LAMPS_TAB = registerItemGroup("item_group_dimmable_lamps",
                FabricItemGroup.builder()
                        .displayName(Text.literal("Dimmable Lamps"))
                        .icon(() -> new ItemStack(ModBlocks.DIMMABLE_REDSTONE_LAMP_WHITE))
                        .entries(((displayContext, entries) ->
                        {

                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_WHITE);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_BROWN);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_RED);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_ORANGE);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_YELLOW);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_GREEN);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_CYAN);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_LIGHT_BLUE);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_BLUE);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_PURPLE);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_MAGENTA);
                            entries.add(ModBlocks.DIMMABLE_REDSTONE_LAMP_PINK);

                        })).build());

        SPECIAL_TAB = registerItemGroup("item_group_special",
                FabricItemGroup.builder()
                        .displayName(Text.literal("Special Lamps"))
                        .icon(() -> new ItemStack(ModBlocks.REDSTONE_LAMP_LED))
                        .entries(((displayContext, entries) ->
                        {
                            entries.add(ModBlocks.REDSTONE_LAMP_LED);

                        })).build());
    }

    private static ItemGroup registerItemGroup(String id, ItemGroup group) {
        return (ItemGroup) Registry.register(Registries.ITEM_GROUP, new Identifier(ColouredLamps.MODID, id), group);
    }
    public static void registerItemGroups()
    {
        ColouredLamps.LOGGER.info("registering item groups");
    }
}
