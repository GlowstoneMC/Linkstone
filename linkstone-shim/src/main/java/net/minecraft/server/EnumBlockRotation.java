package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumBlockRotation {
    NONE("rotate_0"),
    CLOCKWISE_90("rotate_90"),
    CLOCKWISE_180("rotate_180"),
    COUNTERCLOCKWISE_90("rotate_270");

    @LGenerate
    @LField(version = V1_12_R1, name = "e")
    private final String name;

    EnumBlockRotation(String name) {
        this.name = name;
    }

    /**
     * Add the angles of two rotations.
     *
     * @param that rotation to be added
     * @return the added rotations
     */
    @LMethod(version = V1_12_R1, name = "a")
    public EnumBlockRotation add(EnumBlockRotation that) {
        return values()[(this.ordinal() + that.ordinal()) % 4];
    }

    /**
     * Rotate a direction by this angle around the y-axis.
     *
     * @param direction to be rotated
     * @return rotated direction
     */
    @LMethod(version = V1_12_R1, name = "a")
    public EnumDirection rotate(EnumDirection direction) {
        if (direction.getAxis().isHorizontal()) {
            switch (this) {
                case CLOCKWISE_90: return direction.rotateY();
                case CLOCKWISE_180: return direction.opposite();
                case COUNTERCLOCKWISE_90: return direction.rotateYCCW();
            }
        }

        return direction;
    }

    /**
     * Rotate an angle with an arbitrary scale by this angle.
     *
     * @param current the current angle that gets rotated
     * @param fullRotation the number corresponding to one full rotation
     * @return the rotated angle
     */
    @LMethod(version = V1_12_R1, name = "a")
    public int rotate(int current, int fullRotation) {
        switch (this) {
            case NONE: return current;
            case CLOCKWISE_90:return current + (fullRotation * 1 / 4);
            case CLOCKWISE_180: return current + (fullRotation * 2 / 4);
            case COUNTERCLOCKWISE_90: return current + (fullRotation * 3 / 4);
            default: throw new IllegalStateException();
        }
    }
}
