package net.minecraft.server;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerStatisticManager extends StatisticManager {

    private static final Logger b;

    private final MinecraftServer c;

    private final File d;

    private final Set<Statistic> e;

    private int f;

    private boolean g;

    public ServerStatisticManager(MinecraftServer minecraftserver, File file) {
    }

    public void a() {
    }

    public void b() {
    }

    public void setStatistic(EntityHuman entityhuman, Statistic statistic, int i) {
    }

    public Set<Statistic> c() {
        return null;
    }

    public Map<Statistic, StatisticWrapper> a(String s) {
        return null;
    }

    public static String a(Map<Statistic, StatisticWrapper> map) {
        return null;
    }

    public void d() {
    }

    public void a(EntityPlayer entityplayer) {
    }

    public void updateStatistics(EntityPlayer entityplayer) {
    }

    public boolean e() {
        return false;
    }
}
