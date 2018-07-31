package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class Vec3D {
    @LGenerate
    @LField(version = V1_12_R1)
    public final double x;

    @LGenerate
    @LField(version = V1_12_R1)
    public final double y;

    @LGenerate
    @LField(version = V1_12_R1)
    public final double z;

    @LConstructor(version = V1_12_R1)
    public Vec3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec3D vec3D = (Vec3D) o;
        return Double.compare(vec3D.x, x) == 0 &&
                Double.compare(vec3D.y, y) == 0 &&
                Double.compare(vec3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        // hashcode implementation might differ from vanilla implementation
        return Objects.hash(x, y, z);
    }
}