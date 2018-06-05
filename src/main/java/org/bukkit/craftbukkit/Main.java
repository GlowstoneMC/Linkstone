package org.bukkit.craftbukkit;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean useJline = true;
    public static boolean useConsole = true;

    public static void main(String[] args) {
        try {
            net.glowstone.linkstone.Linkstone.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> asList(String... params) {
        return Arrays.asList(params);
    }
}
