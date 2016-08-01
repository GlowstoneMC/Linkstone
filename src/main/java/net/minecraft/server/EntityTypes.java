package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityTypes {

    private static final Logger b;

    private static final Map<String, Class<? extends Entity>> c;

    private static final Map<Class<? extends Entity>, String> d;

    private static final Map<Integer, Class<? extends Entity>> e;

    private static final Map<Class<? extends Entity>, Integer> f;

    private static final Map<String, Integer> g;

    public static final Map<String, EntityTypes.MonsterEggInfo> eggInfo;

    private static void a(Class<? extends Entity> oclass, String s, int i) {
    }

    private static void a(Class<? extends Entity> oclass, String s, int i, int j, int k) {
    }

    @Nullable
    public static Entity createEntityByName(String s, World world) {
        return null;
    }

    @Nullable
    public static Entity a(NBTTagCompound nbttagcompound, World world) {
        return null;
    }

    @Nullable
    public static Entity a(int i, World world) {
        return null;
    }

    @Nullable
    public static Entity b(String s, World world) {
        return null;
    }

    public static int a(Entity entity) {
        return 0;
    }

    @Nullable
    public static Class<? extends Entity> a(int i) {
        return null;
    }

    public static String b(Entity entity) {
        return null;
    }

    public static String getName(Class<? extends Entity> oclass) {
        return null;
    }

    public static int a(String s) {
        return 0;
    }

    public static void a() {
    }

    public static List<String> b() {
        return null;
    }

    public static boolean a(Entity entity, String s) {
        return false;
    }

    public static boolean b(String s) {
        return false;
    }

    static {
    }

    public static class MonsterEggInfo {

        public final String a;

        public final int b;

        public final int c;

        public final Statistic killEntityStatistic;

        public final Statistic killedByEntityStatistic;

        public MonsterEggInfo(String s, int i, int j) {
        }
    }
}
