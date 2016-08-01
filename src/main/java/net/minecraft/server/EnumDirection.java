package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public enum EnumDirection implements INamable {

    DOWN(0, 1, -1, "down", EnumDirection.EnumAxisDirection.NEGATIVE, EnumDirection.EnumAxis.Y, new BaseBlockPosition(0, -1, 0)), UP(1, 0, -1, "up", EnumDirection.EnumAxisDirection.POSITIVE, EnumDirection.EnumAxis.Y, new BaseBlockPosition(0, 1, 0)), NORTH(2, 3, 2, "north", EnumDirection.EnumAxisDirection.NEGATIVE, EnumDirection.EnumAxis.Z, new BaseBlockPosition(0, 0, -1)), SOUTH(3, 2, 0, "south", EnumDirection.EnumAxisDirection.POSITIVE, EnumDirection.EnumAxis.Z, new BaseBlockPosition(0, 0, 1)), WEST(4, 5, 1, "west", EnumDirection.EnumAxisDirection.NEGATIVE, EnumDirection.EnumAxis.X, new BaseBlockPosition(-1, 0, 0)), EAST(5, 4, 3, "east", EnumDirection.EnumAxisDirection.POSITIVE, EnumDirection.EnumAxis.X, new BaseBlockPosition(1, 0, 0));

    private final int g;

    private final int h;

    private final int i;

    private final String j;

    private final EnumDirection.EnumAxis k;

    private final EnumDirection.EnumAxisDirection l;

    private final BaseBlockPosition m;

    private static final EnumDirection[] n;

    private static final EnumDirection[] o;

    private static final Map<String, EnumDirection> p;

    private EnumDirection(int i, int j, int k, String s, EnumDirection.EnumAxisDirection enumdirection_enumaxisdirection, EnumDirection.EnumAxis enumdirection_enumaxis, BaseBlockPosition baseblockposition) {
    }

    public int a() {
        return 0;
    }

    public int get2DRotationValue() {
        return 0;
    }

    public EnumDirection.EnumAxisDirection c() {
        return null;
    }

    public EnumDirection opposite() {
        return null;
    }

    public EnumDirection e() {
        return null;
    }

    public EnumDirection f() {
        return null;
    }

    public int getAdjacentX() {
        return 0;
    }

    public int getAdjacentY() {
        return 0;
    }

    public int getAdjacentZ() {
        return 0;
    }

    public String j() {
        return null;
    }

    public EnumDirection.EnumAxis k() {
        return null;
    }

    public static EnumDirection fromType1(int i) {
        return null;
    }

    public static EnumDirection fromType2(int i) {
        return null;
    }

    public static EnumDirection fromAngle(double d0) {
        return null;
    }

    public float l() {
        return 0.0F;
    }

    public static EnumDirection a(Random random) {
        return null;
    }

    public String toString() {
        return null;
    }

    public String getName() {
        return null;
    }

    public static EnumDirection a(EnumDirection.EnumAxisDirection enumdirection_enumaxisdirection, EnumDirection.EnumAxis enumdirection_enumaxis) {
        return null;
    }

    static {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static final int[] c;

        static {
        }
    }

    public static enum EnumDirectionLimit implements Predicate<EnumDirection>, Iterable<EnumDirection> {

        HORIZONTAL, VERTICAL;

        private EnumDirectionLimit() {
        }

        public EnumDirection[] a() {
            return null;
        }

        public EnumDirection a(Random random) {
            return null;
        }

        public boolean a(@Nullable EnumDirection enumdirection) {
            return false;
        }

        public Iterator<EnumDirection> iterator() {
            return null;
        }

        public boolean apply(Object object) {
            return false;
        }
    }

    public static enum EnumAxisDirection {

        POSITIVE(1, "Towards positive"), NEGATIVE(-1, "Towards negative");

        private final int c;

        private final String d;

        private EnumAxisDirection(int i, String s) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }
    }

    public static enum EnumAxis implements Predicate<EnumDirection>, INamable {

        X("x", EnumDirection.EnumDirectionLimit.HORIZONTAL), Y("y", EnumDirection.EnumDirectionLimit.VERTICAL), Z("z", EnumDirection.EnumDirectionLimit.HORIZONTAL);

        private static final Map<String, EnumDirection.EnumAxis> d;

        private final String e;

        private final EnumDirection.EnumDirectionLimit f;

        private EnumAxis(String s, EnumDirection.EnumDirectionLimit enumdirection_enumdirectionlimit) {
        }

        public String a() {
            return null;
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public String toString() {
            return null;
        }

        public boolean a(@Nullable EnumDirection enumdirection) {
            return false;
        }

        public EnumDirection.EnumDirectionLimit d() {
            return null;
        }

        public String getName() {
            return null;
        }

        public boolean apply(Object object) {
            return false;
        }

        static {
        }
    }
}
