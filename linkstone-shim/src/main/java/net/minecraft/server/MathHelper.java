package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import java.util.Random;
import java.util.UUID;

import static net.glowstone.linkstone.Linkstone.notYetImplemented;
import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

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
        return notYetImplemented();
    }

    public static float cos(float f2) {
        return notYetImplemented();
    }

    public static float c(float a) {
        return (float) Math.sqrt(a);
    }

    public static float sqrt(double a) {
        return (float) Math.sqrt(a);
    }

    public static int d(float f2) {
        return notYetImplemented();
    }

    public static int floor(double d2) {
        notYetImplemented();
        return (int) Math.floor(d2); // TODO: same funcuationality? or is it a different "floor"
    }

    public static long d(double d2) {
        return notYetImplemented();
    }

    public static float e(float f2) {
        return notYetImplemented();
    }

    public static int a(int n) {
        return notYetImplemented();
    }

    public static int f(float f2) {
        return notYetImplemented();
    }

    public static int f(double d2) {
        return notYetImplemented();
    }

    public static int clamp(int n, int n2, int n3) {
        return notYetImplemented();
    }

    public static float a(float f2, float f3, float f4) {
        return notYetImplemented();
    }

    public static double a(double d2, double d3, double d4) {
        return notYetImplemented();
    }

    public static double b(double d2, double d3, double d4) {
        return notYetImplemented();
    }

    public static double a(double d2, double d3) {
        return notYetImplemented();
    }

    public static int nextInt(Random random, int n, int n2) {
        return notYetImplemented();
    }

    public static float a(Random random, float f2, float f3) {
        return notYetImplemented();
    }

    public static double a(Random random, double d2, double d3) {
        return notYetImplemented();
    }

    public static double a(long[] arrl) {
        return notYetImplemented();
    }

    public static float g(float f2) {
        return notYetImplemented();
    }

    public static double g(double d2) {
        return notYetImplemented();
    }

    public static int b(int n) {
        return notYetImplemented();
    }

    public static int a(String string, int n) {
        return notYetImplemented();
    }

    public static int a(String string, int n, int n2) {
        return notYetImplemented();
    }

    public static double a(String string, double d2) {
        try {
            return Double.parseDouble(string);
        } catch (Throwable throwable) { return d2; }
    }

    public static double a(String string, double d2, double d3) {
        return notYetImplemented();
    }

    public static int c(int n) {
        return notYetImplemented();
    }

    private static boolean g(int n) {
        return notYetImplemented();
    }

    public static int d(int n) {
        return notYetImplemented();
    }

    public static int e(int n) {
        return notYetImplemented();
    }

    public static int c(int n, int n2) {
        return notYetImplemented();
    }

    public static long c(int n, int n2, int n3) {
        return notYetImplemented();
    }

    public static UUID a(Random random) {
        notYetImplemented();
        return UUID.randomUUID();
    }

    public static UUID a() {
        return MathHelper.a(c);
    }

    public static double c(double d2, double d3, double d4) {
        return (d2 - d3) / (d4 - d3);
    }

    public static double c(double d2, double d3) {
        return notYetImplemented();
    }

    public static double i(double d2) {
        return notYetImplemented();
    }

    public static int f(int n) {
        return notYetImplemented();
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

