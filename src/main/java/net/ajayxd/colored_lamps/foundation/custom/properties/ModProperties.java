package net.ajayxd.colored_lamps.foundation.custom.properties;

import net.ajayxd.colored_lamps.foundation.custom.properties.enums.DimmableLampBrightness;
import net.ajayxd.colored_lamps.foundation.custom.properties.enums.LampColours;
import net.minecraft.state.property.EnumProperty;

public class ModProperties
{
    public static final EnumProperty<LampColours> LED_LAMP_COLOURS;
    public static final EnumProperty<DimmableLampBrightness> DIMMABLE_LAMP_BRIGHTNESS;

    static
    {
        DIMMABLE_LAMP_BRIGHTNESS = EnumProperty.of("brightness", DimmableLampBrightness.class);
        LED_LAMP_COLOURS         = EnumProperty.of("colour", LampColours.class);
    }
}