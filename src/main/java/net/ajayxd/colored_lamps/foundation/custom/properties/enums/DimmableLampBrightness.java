package net.ajayxd.colored_lamps.foundation.custom.properties.enums;

import net.minecraft.util.StringIdentifiable;

public enum DimmableLampBrightness implements StringIdentifiable
{
    DARK    ("dark"),
    DIM     ("dim"),
    NORMAL  ("normal");


    private final String NAME;

    private DimmableLampBrightness(String NAME)
    {
        this.NAME = NAME;
    }

    @Override
    public String asString() {
        return this.NAME;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
