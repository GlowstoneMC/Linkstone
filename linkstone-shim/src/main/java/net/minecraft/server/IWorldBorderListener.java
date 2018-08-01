package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IWorldBorderListener {
    @LMethod(version = V1_12_R1, name = "a")
    void onSizeChange(WorldBorder border, double size);

    @LMethod(version = V1_12_R1, name = "a")
    void onTransition(WorldBorder border, double oldSize, double newSize, long time);

    @LMethod(version = V1_12_R1, name = "a")
    void onCenterRelocated(WorldBorder border, double x, double z);

    @LMethod(version = V1_12_R1, name = "a")
    void onWarnTimeChange(WorldBorder border, int time);

    @LMethod(version = V1_12_R1, name = "b")
    void onWarnDistanceChange(WorldBorder border, int distance);

    @LMethod(version = V1_12_R1, name = "b")
    void onDamageChange(WorldBorder border, double newDamage);

    //TODO @Isaiah Deobfuscate this method
    @LMethod(version = V1_12_R1, name = "c")
    void c(WorldBorder border, double var2);
}
