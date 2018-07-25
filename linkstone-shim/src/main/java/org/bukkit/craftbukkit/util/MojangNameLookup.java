package org.bukkit.craftbukkit.util;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.UUID;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class MojangNameLookup {

    public static String lookupName(UUID id) {
        if (id == null)
            return null;

        return "LINKSTONE";
    }

    private class Response {
        String errorMessage;
        String cause;
        String name;
    }

}