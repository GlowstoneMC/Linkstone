package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public enum SoundCategory {

    MASTER("master"), MUSIC("music"), RECORDS("record"), WEATHER("weather"), BLOCKS("block"), HOSTILE("hostile"), NEUTRAL("neutral"), PLAYERS("player"), AMBIENT("ambient"), VOICE("voice");

    private static final Map<String, SoundCategory> k;

    private final String l;

    private SoundCategory(String s) {
    }

    public String a() {
        return null;
    }

    public static SoundCategory a(String s) {
        return null;
    }

    public static Set<String> b() {
        return null;
    }

    static {
    }
}
