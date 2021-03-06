package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import org.bukkit.GameMode;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumGamemode {
    @LEnum(version = V1_12_R1)
    SURVIVAL(0, "survival", "s"),

    @LEnum(version = V1_12_R1)
    CREATIVE(1, "creative", "c"),

    @LEnum(version = V1_12_R1)
    ADVENTURE(2, "adventure", "a"),

    @LEnum(version = V1_12_R1)
    SPECTATOR(3, "spectator", "sp");

    /**
     * Try to find a gamemode by its id or else return survival.
     *
     * @param id of requested gamemode
     * @return found gamemode or else survival
     */
    @LMethod(version = V1_12_R1)
    public static EnumGamemode getById(int id) {
        return getById(id, SURVIVAL);
    }

    /**
     * Try to get a gamemode from by its id or return a default value.
     *
     * @param id of requested gamemode
     * @param fallback if there's no such gamemode
     * @return corresponding gamemode or fallback
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static EnumGamemode getById(int id, EnumGamemode fallback) {
        for (EnumGamemode gamemode : values()) {
            if (gamemode.getId() == id) {
                return gamemode;
            }
        }

        return fallback;
    }

    /**
     * Try a gamemode from by its id or return a default value.
     *
     * @param name or shortcode of a gamemode
     * @param fallback if there's no such gamemode
     * @return corresponding gamemode or fallback
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static EnumGamemode getByName(String name, EnumGamemode fallback) {
        for (EnumGamemode gamemode : values()) {
            if (gamemode.name.equals(name) || gamemode.shortName.equals(name)) {
                return gamemode;
            }
        }

        return fallback;
    }

    @LField(version = V1_12_R1, name = "f")
    int id;

    @LField(version = V1_12_R1, name = "g")
    String name;

    @LField(version = V1_12_R1, name = "h")
    String shortName;

    EnumGamemode(int id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    @LMethod(version = V1_12_R1)
    public int getId() {
        return id;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public String getName() {
        return name;
    }

    public static GameMode toGlowstone(EnumGamemode gamemode) {
        if (gamemode == null) {
            return null;
        }

        switch (gamemode) {
            case SURVIVAL: return GameMode.SURVIVAL;
            case CREATIVE: return GameMode.CREATIVE;
            case ADVENTURE: return GameMode.ADVENTURE;
            case SPECTATOR: return GameMode.SPECTATOR;
            default: throw new AssertionError();
        }
    }

    public static EnumGamemode fromGlowstone(GameMode gameMode) {
        if (gameMode == null) {
            return null;
        }

        switch (gameMode) {
            case SURVIVAL: return EnumGamemode.SURVIVAL;
            case CREATIVE: return EnumGamemode.CREATIVE;
            case ADVENTURE: return EnumGamemode.ADVENTURE;
            case SPECTATOR: return EnumGamemode.SPECTATOR;
            default: throw new AssertionError();
        }
    }
}
