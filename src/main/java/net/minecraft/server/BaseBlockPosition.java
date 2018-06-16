package net.minecraft.server;

import javax.annotation.concurrent.Immutable;

@Immutable
public class BaseBlockPosition implements Comparable<BaseBlockPosition> {
    public static final BaseBlockPosition ZERO = new BaseBlockPosition(0, 0, 0);
    protected int a; // x?
    protected int b; // y?
    protected int c; // z?

    public final boolean isValidLocation() {
        return b < 256; // TODO
    }

    public boolean isInvalidYLocation() {
        return b < 0 || b > 256;
    }

    public BaseBlockPosition(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public BaseBlockPosition(double a, double b, double c) {
        this(MathHelper.floor(a), MathHelper.floor(b), MathHelper.floor(c));
    }

    public boolean equals(Object o) {
        if (!(o instanceof BaseBlockPosition)) return false;

        BaseBlockPosition z = (BaseBlockPosition) o;
        return this == o || (a == z.a && b == z.b && c == z.c); 
    }

    public int hashCode() {
        return 0; // TODO
    }

    public int l(BaseBlockPosition baseblockposition) {
        return 0; // TODO
    }

    public final int getX() {
        return this.a;
    }

    public final int getY() {
        return this.b;
    }

    public final int getZ() {
        return this.c;
    }

    public BaseBlockPosition d(BaseBlockPosition baseblockposition) {
        return null; // TODO
    }

    public double h(int i2, int j, int k) {
        return 0; // TODO
    }

    public double distanceSquared(double d0, double d1, double d2) {
        return 0; // TODO
    }

    public double g(double d0, double d1, double d2) {
        return 0; // TODO
    }

    public double n(BaseBlockPosition z) {
        return this.distanceSquared(z.a, z.b, z.c);
    }

    public String toString() {
        return "LINKSTONE"; // TODO
    }

    @Override
    public int compareTo(BaseBlockPosition object) {
        return this.l(object);
    }
}