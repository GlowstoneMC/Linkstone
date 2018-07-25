package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.Random;
import java.util.UUID;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;
import static net.minecraft.server.Link.fixme; // LINKSTONE

@LClassfile(version = V1_12_R1)
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
        return (int) Math.floor(d2); // TODO: same funcuationality? or is it a different "floor"
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
        fixme("MathHelper#i(double)");
        return d2;
    }

    public static int f(int n) {
        fixme("MathHelper#f(int)");
        return n;
    }

    static {
        a = 0;
        b = null;
        c = null;
        d = null;
        e = 0;
        f = null;
        g = null;
    }
}

