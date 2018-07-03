package org.bukkit.craftbukkit;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean useJline = true;
    public static boolean useConsole = true;

    public static void main(String[] args) {
        System.out.println("Calling net.glowstone.linkstone.Linkstoone.main(String[]) ....");
        net.glowstone.linkstone.Linkstone.main(args);
    }

    private static List<String> asList(String... params) {
        return Arrays.asList(params);
    }
}
