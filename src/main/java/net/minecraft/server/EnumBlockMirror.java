package net.minecraft.server;

public enum EnumBlockMirror {

    NONE("no_mirror"), LEFT_RIGHT("mirror_left_right"), FRONT_BACK("mirror_front_back");

    private final String d;

    private static final String[] e;

    private EnumBlockMirror(String s) {
    }

    public int a(int i, int j) {
        return 0;
    }

    public EnumBlockRotation a(EnumDirection enumdirection) {
        return null;
    }

    public EnumDirection b(EnumDirection enumdirection) {
        return null;
    }

    static {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
