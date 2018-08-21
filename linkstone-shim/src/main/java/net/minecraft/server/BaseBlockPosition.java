package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;

import javax.annotation.concurrent.Immutable;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
@Immutable
public class BaseBlockPosition implements Comparable<BaseBlockPosition> {
    public static final BaseBlockPosition ZERO = new BaseBlockPosition(0, 0, 0);

    @LField(version = V1_12_R1, name = "a")
    protected int x;

    @LField(version = V1_12_R1, name = "b")
    protected int y;

    @LField(version = V1_12_R1, name = "c")
    protected int z;

    @LConstructor(version = V1_12_R1)
    public BaseBlockPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @LConstructor(version = V1_12_R1)
    public BaseBlockPosition(double x, double y, double z) {
        this(MathHelper.floor(x), MathHelper.floor(y), MathHelper.floor(z));
    }

    @LMethod(version = V1_12_R1)
    public int getX() {
        return this.x;
    }

    @LMethod(version = V1_12_R1)
    public int getY() {
        return this.y;
    }

    @LMethod(version = V1_12_R1)
    public int getZ() {
        return this.z;
    }

    /**
     * Calculate the cross product of this and another vector.
     * The result is orthogonal to both vectors.
     *
     * @param that the other vector
     * @return a orthogonal vector to 'this' and 'that'
     */
    @LMethod(version = V1_12_R1, name = "d")
    public BaseBlockPosition crossProduct(BaseBlockPosition that) {
        return new BaseBlockPosition(
                this.getY() * that.getZ() - this.getZ() * that.getY(),
                this.getZ() * that.getX() - this.getX() * that.getZ(),
                this.getX() * that.getY() - this.getY() * that.getY());
    }

    /**
     * Get the distance from this to another point.
     *
     * @param x coordinate of the other point
     * @param y coordinate of the other point
     * @param z coordinate of the other point
     * @return distance to the other point
     */
    @LMethod(version = V1_12_R1, name = "h")
    public double distance(int x, int y, int z) {
        return Math.sqrt(distanceSquared((double) x, (double) y, (double) z));
    }

    /**
     * Get the squared distance from this to another point.
     *
     * @param x coordinate of the other point
     * @param y coordinate of the other point
     * @param z coordinate of the other point
     * @return squared distance to the other point
     */
    @LMethod(version = V1_12_R1)
    public double distanceSquared(double x, double y, double z) {
        double dx = this.getX() - x;
        double dy = this.getY() - y;
        double dz = this.getZ() - z;
        return dx * dx + dy * dy + dz * dz;
    }

    /**
     * Get the squared distance from this to another point.
     *
     * @param that the other point
     * @return distance to the other point
     */
    @LMethod(version = V1_12_R1, name = "n")
    public double distanceSquared(BaseBlockPosition that) {
        return distanceSquared(that.getX(), that.getY(), that.getZ());
    }

    /**
     * Get the squared distance from the middle of the block at this location to another point.
     *
     * @param x coordinate of the other point
     * @param y coordinate of the other point
     * @param z coordinate of the other point
     * @return distance to the other point
     */
    @LMethod(version = V1_12_R1, name = "g")
    public double squaredBlockDistance(double x, double y, double z) {
        double dx = (this.getX() + 0.5D) - x;
        double dy = (this.getY() + 0.5D) - y;
        double dz = (this.getZ() + 0.5D) - z;
        return dx * dx + dy * dy + dz * dz;
    }

    /**
     * Compare two block position as done by {@link Comparable#compareTo(Object)}.
     * Thereby dominate differences on the y-axis, then the z-axis and x-axis.
     *
     * @param that position to compare with
     * @return a negative value, positive value or zero
     */
    @LMethod(version = V1_12_R1, name = "l")
    public int compare(BaseBlockPosition that) {
        if (this.getY() != that.getY()) return this.getY() - that.getY();
        if (this.getZ() != that.getZ()) return this.getZ() - that.getZ();
        if (this.getX() != that.getX()) return this.getX() - that.getX();
        return 0;
    }

    @Override
    public int compareTo(BaseBlockPosition object) {
        return this.compare(object);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseBlockPosition)) return false;

        BaseBlockPosition that = (BaseBlockPosition) o;
        return this.getX() == that.getX() && this.getY() == that.getY() && this.getZ() == that.getZ();
    }

    public int hashCode() {
        // hashCode implementation might differ from vanilla
        return Objects.hash(this.getX(), this.getY(), this.getZ());
    }
}