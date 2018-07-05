package org.bukkit.craftbukkit;

import java.io.IOException;

public class Main {

    public static boolean useJline = true;
    public static boolean useConsole = true;

    public static void main(String[] args) {
        System.out.println("Calling net.glowstone.linkstone.Linkstoone.main(String[]) ....");
        try {
            net.glowstone.linkstone.Linkstone.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}