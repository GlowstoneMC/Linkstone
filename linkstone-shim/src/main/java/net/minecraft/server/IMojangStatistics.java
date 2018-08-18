package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

/**
 * Interface that adds data about the minecraft server and its hardware to the statistics.
 */
@LClassfile(version = V1_12_R1)
public interface IMojangStatistics {
    //TODO @Isaiah Deobfuscate this method
    @LMethod(version = V1_12_R1)
    void a(MojangStatisticsGenerator a);

    //TODO @Isaiah Deobfuscate this method
    @LMethod(version = V1_12_R1)
    void b(MojangStatisticsGenerator a);

    @LMethod(version = V1_12_R1)
    boolean getSnooperEnabled();
}