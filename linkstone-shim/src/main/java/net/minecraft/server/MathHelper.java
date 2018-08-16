package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import java.util.Random;
import java.util.UUID;

import static net.glowstone.linkstone.Linkstone.notYetImplemented;
import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class MathHelper {
    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private static final Random RANDOM;

    public static final float a;
    private static final float[] b;
    private static final int[] d;
    private static final double e;
    private static final double[] f;
    private static final double[] g;

    @LMethod(version = V1_12_R1)
    public static float sin(float radian) {
        return (float) Math.sin(radian);
    }

    @LMethod(version = V1_12_R1)
    public static float cos(float radian) {
        return (float) Math.cos(radian);
    }

    @LMethod(version = V1_12_R1, name = "c")
    public static float sqrt(float f) {
        return (float) Math.sqrt(f);
    }

    @LMethod(version = V1_12_R1)
    public static float sqrt(double d) {
        return (float) Math.sqrt(d);
    }

    @LMethod(version = V1_12_R1, name = "d")
    public static int floor(float f) {
        return (int) Math.floor(f);
    }

    @LMethod(version = V1_12_R1)
    public static int floor(double d) {
        return (int) Math.floor(d);
    }

    @LMethod(version = V1_12_R1, name = "d")
    public static long floorL(double d) {
        return (long) Math.floor(d);
    }

    @LMethod(version = V1_12_R1, name = "e")
    public static float abs(float f) {
        return Math.abs(f);
    }

    @LMethod(version = V1_12_R1, name = "a")
    public static int abs(int i) {
        return Math.abs(i);
    }

    @LMethod(version = V1_12_R1, name = "f")
    public static int f(float f) {
        return (int) Math.ceil(f);
    }

    @LMethod(version = V1_12_R1, name = "f")
    public static int ceil(double d) {
        return (int) Math.cos(d);
    }

    @LMethod(version = V1_12_R1)
    public static int clamp(int value, int min, int max) {
        return value < min ? min :
                value > max ? max: value;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public static float clamp(float value, float min, float max) {
        return value < min ? min :
                value > max ? max: value;
    }

    /**
     * Make sure a values goes not below/above an upper and lower bound
     *
     * @param value value to clamp
     * @param min lower bound
     * @param max upper bound
     * @return clamped value
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double clamp(double value, double min, double max) {
        return value < min ? min :
                value > max ? max: value;
    }

    /**
     * Get a value between a lower and upper bound based on a percentage.
     *
     * @param lower value corresponding to 0%
     * @param upper value corresponding to 100%
     * @param percentage percentage as value between 0.0 and 1.0
     * @return
     */
    @LMethod(version = V1_12_R1, name = "b")
    public static double percentualClamp(double lower, double upper, double percentage) {
        return percentage < 0.0 ? lower :
                percentage > 1.0 ? upper :
                        lower + ((upper - lower) * percentage);
    }

    /**
     * The the absolute value of two double and return the bigger one.
     *
     * @param a first value
     * @param b seconds value
     * @return biggest absolute value
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double absMax(double a, double b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return Math.max(a, b);
    }

    /**
     * Get a random int between two bounds.
     *
     * @param random randomness provider
     * @param min lower bound
     * @param max upper bound
     * @return random value between or equal to min and max
     */
    @LMethod(version = V1_12_R1)
    public static int nextInt(Random random, int min, int max) {
        return min + (int) ((max - min) * random.nextFloat());
    }

    /**
     * Get a random float between two bounds.
     *
     * @param random randomness provider
     * @param min lower bound
     * @param max upper bound
     * @return random value between or equal to min and max
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static float nextFloat(Random random, float min, float max) {
        return min + ((max - min) * random.nextFloat());
    }

    /**
     * Get a random double between two bounds.
     *
     * @param random randomness provider
     * @param min lower bound
     * @param max upper bound
     * @return random value between or equal to min and max
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double a(Random random, double min, double max) {
        return min + ((max - min) * random.nextDouble());
    }

    /**
     * Get the arithmetic middle of all values in an array.
     *
     * @param array whose average should be calculated
     * @return the average value
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double average(long[] array) {
        long sum = 0L;
        for (long l : array) {
            sum += l;
        }

        return (double) sum / (double) array.length;
    }

    /**
     * Normalize an angle into a range between -180° and +180°.
     *
     * @param angle to be normalized in degree
     * @return normalized angle
     */
    @LMethod(version = V1_12_R1, name = "g")
    public static float normalizeAngle(float angle) {
        angle %= 360;

        if (angle > 180) {
            angle -= 360;
        }

        if (angle < -180) {
            angle += 360;
        }

        return angle;
    }

    /**
     * Normalize an angle into a range between -180° and +180°.
     *
     * @param angle to be normalized in degree
     * @return normalized angle
     */
    @LMethod(version = V1_12_R1, name = "g")
    public static double normalizeAngle(double angle) {
        angle %= 360;

        if (angle > 180) {
            angle -= 360;
        }

        if (angle < -180) {
            angle += 360;
        }

        return angle;
    }

    /**
     * Normalize an angle into a range between -180° and +180°.
     *
     * @param angle to be normalized in degree
     * @return normalized angle
     */
    @LMethod(version = V1_12_R1, name = "b")
    public static int normalizeAngle(int angle) {
        angle %= 360;

        if (angle > 180) {
            angle -= 360;
        }

        if (angle < -180) {
            angle += 360;
        }

        return angle;
    }

    /**
     * Try to parse a string as int or get a default value.
     *
     * @param string to be parsed
     * @param fallback valued returned if string cannot be parsed
     * @return parsed string or default value
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static int parseOrElse(String string, int fallback) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    /**
     * Parse a string as int or get a default value and make sure it is above a boundary.
     *
     * @param string to be parsed
     * @param fallback valued returned if string cannot be parsed
     * @param minValue lower bound
     * @return parsed value or fallback above boundary
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static int parseInt(String string, int fallback, int minValue) {
        return Math.max(parseOrElse(string, fallback), minValue);
    }

    /**
     * Try to parse a string as double or get a default value.
     *
     * @param string to be parsed
     * @param fallback valued returned if string cannot be parsed
     * @return parsed string or default value
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double parseOrElse(String string, double fallback) {
        try {
            return Double.parseDouble(string);
        } catch (Throwable throwable) {
            return fallback;
        }
    }

    /**
     * Parse a string as double or get a default value and make sure it is above a boundary.
     *
     * @param string to be parsed
     * @param fallback valued returned if string cannot be parsed
     * @param minValue lower bound
     * @return parsed value or fallback above boundary
     */
    @LMethod(version = V1_12_R1, name = "a")
    public static double parseDouble(String string, double fallback, double minValue) {
        return Math.max(parseOrElse(string, fallback), minValue);
    }

    public static int c(int n) {
        return notYetImplemented();
    }

    /**
     * Check whether a number is a power of two.
     *
     * @param n number to check
     * @return is n a power of two
     */
    @LMethod(version = V1_12_R1, name = "g")
    private static boolean isPowerOfTwo(int n) {
        return n != 0 && (n & -n) == n;
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

    @LMethod(version = V1_12_R1, name = "a")
    public static UUID randomUUID(Random random) {
        //TODO use the provided random instead
        return UUID.randomUUID();
    }

    @LMethod(version = V1_12_R1, name = "a")
    public static UUID randomUUID() {
        return MathHelper.randomUUID(RANDOM);
    }

    //TODO @Isaiah Deobfuscate this method
    @LMethod(version = V1_12_R1)
    public static double c(double d2, double d3, double d4) {
        return (d2 - d3) / (d4 - d3);
    }

    @LMethod(version = V1_12_R1, name = "c")
    public static double atan2(double y, double x) {
        return Math.atan2(y, x);
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
        RANDOM = new Random();
        d = null;
        e = 0;
        f = null;
        g = null;
    }
}

