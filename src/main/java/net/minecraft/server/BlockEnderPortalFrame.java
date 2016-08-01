package net.minecraft.server;

import com.google.common.base.Predicates;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class BlockEnderPortalFrame extends Block {

    public static final BlockStateDirection FACING = null;

    public static final BlockStateBoolean EYE = null;

    protected static final AxisAlignedBB c = null;

    protected static final AxisAlignedBB d = null;

    private static ShapeDetector e = null;

    public BlockEnderPortalFrame() {
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public boolean isComplexRedstone(IBlockData iblockdata) {
        return false;
    }

    public int d(IBlockData iblockdata, World world, BlockPosition blockposition) {
        return 0;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public static ShapeDetector e() {
        return null;
    }
}
