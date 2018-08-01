package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumGamemode {
    SURVIVAL(0, "survival", "s"),
    CREATIVE(1, "creative", "c"),
    ADVENTURE(2, "adventure", "a"),
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

    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    int id;

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    String name;

    @LGenerate
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
}
