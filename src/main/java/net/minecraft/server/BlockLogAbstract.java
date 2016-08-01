package net.minecraft.server;

import java.util.Iterator;

public abstract class BlockLogAbstract extends BlockRotatable {

    public static final BlockStateEnum<BlockLogAbstract.EnumLogRotation> AXIS;

    public BlockLogAbstract() {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static final int[] c;

        static {
        }
    }

    public static enum EnumLogRotation implements INamable {

        X("x"), Y("y"), Z("z"), NONE("none");

        private final String e;

        private EnumLogRotation(String s) {
        }

        public String toString() {
            return null;
        }

        public static BlockLogAbstract.EnumLogRotation a(EnumDirection.EnumAxis enumdirection_enumaxis) {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
