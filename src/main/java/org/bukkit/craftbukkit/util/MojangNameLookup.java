package org.bukkit.craftbukkit.util;

import java.util.UUID;

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