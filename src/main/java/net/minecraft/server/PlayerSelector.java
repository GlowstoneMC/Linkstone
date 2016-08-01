package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class PlayerSelector {

    private static final Pattern a = null;

    private static final Pattern b = null;

    private static final Pattern c = null;

    private static final Set<String> d = null;

    @Nullable
    public static EntityPlayer getPlayer(ICommandListener icommandlistener, String s) {
        return null;
    }

    @Nullable
    public static <T extends Entity> T getEntity(ICommandListener icommandlistener, String s, Class<? extends T> oclass) {
        return null;
    }

    @Nullable
    public static IChatBaseComponent getPlayerNames(ICommandListener icommandlistener, String s) {
        return null;
    }

    public static <T extends Entity> List<T> getPlayers(ICommandListener icommandlistener, String s, Class<? extends T> oclass) {
        return null;
    }

    private static List<World> a(ICommandListener icommandlistener, Map<String, String> map) {
        return null;
    }

    private static <T extends Entity> boolean b(ICommandListener icommandlistener, Map<String, String> map) {
        return false;
    }

    private static List<Predicate<Entity>> a(Map<String, String> map, String s) {
        return null;
    }

    private static List<Predicate<Entity>> b(Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> c(Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> d(Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> c(final ICommandListener icommandlistener, Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> e(Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> f(Map<String, String> map) {
        return null;
    }

    private static List<Predicate<Entity>> a(Map<String, String> map, final Vec3D vec3d) {
        return null;
    }

    private static List<Predicate<Entity>> g(Map<String, String> map) {
        return null;
    }

    private static <T extends Entity> List<T> a(Map<String, String> map, Class<? extends T> oclass, List<Predicate<Entity>> list, String s, World world, BlockPosition blockposition) {
        return null;
    }

    private static <T extends Entity> List<T> a(List<T> list, Map<String, String> map, ICommandListener icommandlistener, Class<? extends T> oclass, String s, final Vec3D vec3d) {
        return null;
    }

    private static AxisAlignedBB a(BlockPosition blockposition, int i, int j, int k) {
        return null;
    }

    private static BlockPosition a(Map<String, String> map, BlockPosition blockposition) {
        return null;
    }

    private static Vec3D b(Map<String, String> map, Vec3D vec3d) {
        return null;
    }

    private static double a(Map<String, String> map, String s, double d0, boolean flag) {
        return 0.0;
    }

    private static boolean h(Map<String, String> map) {
        return false;
    }

    private static int a(Map<String, String> map, String s, int i) {
        return 0;
    }

    @Nullable
    private static String b(Map<String, String> map, String s) {
        return null;
    }

    public static Map<String, Integer> a(Map<String, String> map) {
        return null;
    }

    public static boolean isList(String s) {
        return false;
    }

    public static boolean isPattern(String s) {
        return false;
    }

    private static Map<String, String> c(@Nullable String s) {
        return null;
    }
}
