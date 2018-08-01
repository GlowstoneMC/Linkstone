package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import java.util.Locale;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumDifficulty {
    PEACEFUL(0, "peaceful"), EASY(1, "easy"), NORMAL(2, "normal"), HARD(3, "hard");

    @LMethod(version = V1_12_R1)
    public static EnumDifficulty getById(int n) {
        return values[n % values.length];
    }

    @LGenerate
    @LField(version = V1_12_R1, name = "e")
    private static final EnumDifficulty[] values = EnumDifficulty.values();

    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    private final int id;

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private final String optionName;

    EnumDifficulty(int id, String name) {
        this.id = id;
        this.optionName = "options.difficulty." + name;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public int getId() {
        return id;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public String getOptionName() {
        return optionName;
    }
}
