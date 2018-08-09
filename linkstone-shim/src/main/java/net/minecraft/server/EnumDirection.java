package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public enum EnumDirection {
    DOWN(0, 1, -1, "down", EnumAxis.Y, EnumAxisDirection.NEGATIVE, new BaseBlockPosition(0, -1, 0)),
    UP(1, 0, -1, "up", EnumAxis.Y, EnumAxisDirection.POSITIVE, new BaseBlockPosition(0, 1, 0)),
    NORTH(2, 3, 2, "north", EnumAxis.Z, EnumAxisDirection.NEGATIVE, new BaseBlockPosition(0, 0, -1)),
    SOUTH(3, 2, 0, "south", EnumAxis.Z, EnumAxisDirection.POSITIVE, new BaseBlockPosition(0, 0, 1)),
    WEST(4, 5, 1, "west", EnumAxis.X, EnumAxisDirection.NEGATIVE, new BaseBlockPosition(-1, 0, 0)),
    EAST(5, 4, 3, "east", EnumAxis.X, EnumAxisDirection.POSITIVE, new BaseBlockPosition(1, 0, 0));

    private static final EnumDirection[] DIRECTIONS = values();
    private static final EnumDirection[] HORIZONTAL_DIRECTIONS = { SOUTH, WEST, NORTH, EAST };

    @LMethod(version = V1_12_R1, name = "fromType1")
    public static EnumDirection fromIndex(int index) {
        return DIRECTIONS[MathHelper.abs(index % DIRECTIONS.length)];
    }

    @LMethod(version = V1_12_R1, name = "fromType2")
    public static EnumDirection fromHorizontalIndex(int var0) {
        return HORIZONTAL_DIRECTIONS[MathHelper.abs(var0 % HORIZONTAL_DIRECTIONS.length)];
    }

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private final int index;

    /**
     * Index where indices of directions on the same axis are swapped
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "h")
    private final int opposite;

    /**
     * Index for horizontal directions from south to east.
     * Negative for non-horizontal directions.
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "i")
    private final int rotationIndex;

    @LGenerate
    @LField(version = V1_12_R1, name = "j")
    private final String name;

    @LGenerate
    @LField(version = V1_12_R1, name = "k")
    private final EnumAxis axis;

    @LGenerate
    @LField(version = V1_12_R1, name = "l")
    private final EnumAxisDirection axisDirection;

    /**
     * Normalized vector pointing into the direction.
     */
    @LGenerate
    @LField(version = V1_12_R1, name = "m")
    private final BaseBlockPosition vector;

    EnumDirection(int index, int opposite, int rotationIndex, String name, EnumAxis axis, EnumAxisDirection axisDirection, BaseBlockPosition vector) {
        this.index = index;
        this.opposite = opposite;
        this.rotationIndex = rotationIndex;
        this.name = name;
        this.axis = axis;
        this.axisDirection = axisDirection;
        this.vector = vector;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public int getIndex() {
        return index;
    }

    @LMethod(version = V1_12_R1)
    public int get2DRotationValue() {
        return rotationIndex;
    }

    @LMethod(version = V1_12_R1, name = "c")
    public EnumAxisDirection getAxisDirection() {
        return axisDirection;
    }

    @LMethod(version = V1_12_R1)
    public String getName() {
        return name;
    }

    @LMethod(version = V1_12_R1, name = "j")
    public String getName2() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @LMethod(version = V1_12_R1, name = "k")
    public EnumAxis getAxis() {
        return axis;
    }

    @LMethod(version = V1_12_R1)
    public EnumDirection opposite() {
        return EnumDirection.fromIndex(this.opposite);
    }

    /**
     * @return around the y-axis rotate direction
     */
    @LMethod(version = V1_12_R1, name = "e")
    public EnumDirection rotateY() {
        switch(this) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: throw new IllegalArgumentException();
        }
    }

    /**
     * @return counterclockwise around the y-axis rotated direction
     */
    @LMethod(version = V1_12_R1, name = "f")
    public EnumDirection rotateYCCW() {
        switch(this) {
            case NORTH: return WEST;
            case EAST: return NORTH;
            case SOUTH: return EAST;
            case WEST: return SOUTH;
            default: throw new IllegalArgumentException();
        }
    }

    @LMethod(version = V1_12_R1)
    public int getAdjacentX() {
        return this.axis == EnumAxis.X ? this.axisDirection.factor : 0;
    }

    @LMethod(version = V1_12_R1)
    public int getAdjacentY() {
        return this.axis == EnumAxis.Y ? this.axisDirection.factor : 0;
    }

    @LMethod(version = V1_12_R1)
    public int getAdjacentZ() {
        return this.axis == EnumAxis.Z ? this.axisDirection.factor : 0;
    }

    @LClassfile(version = V1_12_R1)
    public enum EnumAxis {
        X("x", EnumDirectionLimit.HORIZONTAL),
        Y("y", EnumDirectionLimit.VERTICAL),
        Z("z", EnumDirectionLimit.HORIZONTAL);

        @LGenerate
        @LField(version = V1_12_R1, name = "d")
        private static final Map<String, EnumAxis> axisByName;

        @LGenerate
        @LField(version = V1_12_R1, name = "e")
        private final String name;

        @LGenerate
        @LField(version = V1_12_R1, name = "f")
        private final EnumDirectionLimit axisDirection;

        EnumAxis(String name, EnumDirectionLimit axisDirection) {
            this.name = name;
            this.axisDirection = axisDirection;
        }

        @LMethod(version = V1_12_R1)
        public String getName() {
            return name;
        }

        @LMethod(version = V1_12_R1, name = "a")
        public String getName2() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        @LMethod(version = V1_12_R1, name = "d")
        public EnumDirectionLimit getAxisDirection() {
            return axisDirection;
        }

        @LMethod(version = V1_12_R1, name = "b")
        public boolean isVertical() {
            return this.axisDirection == EnumDirectionLimit.VERTICAL;
        }

        @LMethod(version = V1_12_R1, name = "c")
        public boolean isHorizontal() {
            return this.axisDirection == EnumDirectionLimit.HORIZONTAL;
        }

        static {
            axisByName = Arrays.stream(values()).collect(
                    Collectors.toMap(EnumAxis::getName, Function.identity()));
        }
    }

    @LClassfile(version = V1_12_R1)
    public enum EnumAxisDirection {
        POSITIVE(1, "Towards positive"),
        NEGATIVE(-1, "Towards negative");

        @LGenerate
        @LField(version = V1_12_R1, name = "c")
        private final int factor;

        @LGenerate
        @LField(version = V1_12_R1, name = "d")
        private final String description;

        EnumAxisDirection(int factor, String description) {
            this.factor = factor;
            this.description = description;
        }

        @LMethod(version = V1_12_R1, name = "a")
        public int getFactor() {
            return factor;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    @LClassfile(version = V1_12_R1)
    public enum EnumDirectionLimit {
        HORIZONTAL, VERTICAL;
    }
}
