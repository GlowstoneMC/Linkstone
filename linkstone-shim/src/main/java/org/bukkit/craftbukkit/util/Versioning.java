package org.bukkit.craftbukkit.util;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public final class Versioning {

    public static String getBukkitVersion() {
        return "1.12.2-R0.1-SNAPSHOT";
    }

}
