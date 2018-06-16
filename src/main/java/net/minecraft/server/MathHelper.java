package net.minecraft.server;

import java.util.Random;
import java.util.UUID;

import static net.minecraft.server.Link.fixme; // LINKSTONE

public class MathHelper {
    public static final float a;
    private static final float[] b;
    private static final Random c;
    private static final int[] d;
    private static final double e;
    private static final double[] f;
    private static final double[] g;

    public static float sin(float f2) {
        fixme("MathHelper#sin(float)");
        return 0;
    }

    public static float cos(float f2) {
        fixme("MathHelper#cos(float)");
        return 0;
    }

    public static float c(float a) {
        return (float) Math.sqrt(a);
    }

    public static float sqrt(double a) {
        return (float) Math.sqrt(a);
    }

    public static int d(float f2) {
        fixme("MathHelper#d(float)");
        return 0;
    }

    public static int floor(double d2) {
        fixme("MathHelper#floor(double)");
        return (int) Math.floor(d2); // TODO: same funcuationality?
    }

    public static long d(double d2) {
        fixme("MathHelper#d(double)");
        return 0;
    }

    public static float e(float f2) {
        fixme("MathHelper#e(float)");
        return 0;
    }

    public static int a(int n) {
        fixme("MathHelper#a(int)");
        return 0;
    }

    public static int f(float f2) {
        fixme("MathHelper#f(float)");
        return 0;
    }

    public static int f(double d2) {
        fixme("MathHelper#f(double)");
        return 0;
    }

    public static int clamp(int n, int n2, int n3) {
        fixme("MathHelper#clamp(int,int,int)");
        return 0;
    }

    public static float a(float f2, float f3, float f4) {
        fixme("MathHelper#a(float,float,float)");
        return 0;
    }

    public static double a(double d2, double d3, double d4) {
        fixme("MathHelper#a(double,double,double)");
        return 0;
    }

    public static double b(double d2, double d3, double d4) {
        fixme("MathHelper#b(double,double,double)");
        return 0;
    }

    public static double a(double d2, double d3) {
        fixme("MathHelper#a(double,double)");
        return 0;
    }

    public static int nextInt(Random random, int n, int n2) {
        fixme("MathHelper#nextInt(Random,int,int)");
        return 0;
    }

    public static float a(Random random, float f2, float f3) {
        fixme("MathHelper#a(Random,float,float)");
        return 0;
    }

    public static double a(Random random, double d2, double d3) {
        fixme("MathHelper#a(Random,double,double)");
        return 0;
    }

    public static double a(long[] arrl) {
        fixme("MathHelper#a(long[])");
        return 0;
    }

    public static float g(float f2) {
        fixme("MathHelper#g(float)");
        return 0;
    }

    public static double g(double d2) {
        fixme("MathHelper#g(double)");
        return 0;
    }

    public static int b(int n) {
        fixme("MathHelper#b(int)");
        return 0;
    }

    public static int a(String string, int n) {
        fixme("MathHelper#a(String,int)");
        return 0;
    }

    public static int a(String string, int n, int n2) {
        fixme("MathHelper#a(String,int,int)");
        return 0;
    }

    public static double a(String string, double d2) {
        try {
            return Double.parseDouble(string);
        } catch (Throwable throwable) { return d2; }
    }

    public static double a(String string, double d2, double d3) {
        fixme("MathHelper#a(String,double,double)");
        return 0;
    }

    public static int c(int n) {
        fixme("MathHelper#c(int)");
        return 0;
    }

    private static boolean g(int n) {
        fixme("MathHelper#g(int)");
        return false;
    }

    public static int d(int n) {
        fixme("MathHelper#d(int)");
        return 0;
    }

    public static int e(int n) {
        fixme("MathHelper#e(int)");
        return 0;
    }

    public static int c(int n, int n2) {
        fixme("MathHelper#c(int,int)");
        return 0;
    }

    public static long c(int n, int n2, int n3) {
        fixme("MathHelper#c(int,int,int)");
        return 0;
    }

    public static UUID a(Random random) {
        fixme("MathHelper#a(Random)");
        return UUID.randomUUID();
    }

    public static UUID a() {
        return MathHelper.a(c);
    }

    public static double c(double d2, double d3, double d4) {
        return (d2 - d3) / (d4 - d3);
    }

    public static double c(double d2, double d3) {
        fixme("MathHelper#c(double,double)");
        return 0;
    }

    public static double i(double d2) {
        double d3 = 0.5 * d2;
        long l = Double.doubleToRawLongBits(d2);
        l = 6910469410427058090L - (l >> 1);
        d2 = Double.longBitsToDouble(l);
        d2 *= 1.5 - d3 * d2 * d2;
        return d2;
    }

    public static int f(int n) {
        n ^= n >>> 16;
        n *= -2048144789;
        n ^= n >>> 13;
        n *= -1028477387;
        n ^= n >>> 16;
        return n;
    }

    static {
        int n;
        a = MathHelper.c(2.0f);
        c = new Random();
        b = new float[65536];
        for (n = 0; n < 65536; ++n) {
            MathHelper.b[n] = (float)Math.sin((double)n * 3.141592653589793 * 2.0 / 65536.0);
        }
        d = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
        e = Double.longBitsToDouble(4805340802404319232L);
        f = new double[257];
        g = new double[257];
        for (n = 0; n < 257; ++n) {
            double d2 = (double)n / 256.0;
            double d3 = Math.asin(d2);
            MathHelper.g[n] = Math.cos(d3);
            MathHelper.f[n] = d3;
        }
    }
}

