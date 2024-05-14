package net.ajayxd.colored_lamps.foundation.custom.properties.enums;

import net.minecraft.util.StringIdentifiable;

public enum LampColours implements StringIdentifiable
{
    GRAY       ("gray"),
    LIGHT_GRAY ("light_gray"),
    WHITE      ("white"),
    BROWN      ("brown"),
    RED        ("red"),
    ORANGE     ("orange"),
    YELLOW     ("yellow"),
    GREEN      ("green"),
    DARK_GREEN ("dark_green"),
    CYAN       ("cyan"),
    LIGHT_BLUE ("light_blue"),
    BLUE       ("blue"),
    PURPLE     ("purple"),
    MAGENTA    ("magenta"),
    PINK       ("pink"),
    NORMAL     ("normal");

    private final String NAME;

    private LampColours(String NAME)
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
