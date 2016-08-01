package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class BlockChorusFruit extends Block {

    public static final BlockStateBoolean a = null;

    public static final BlockStateBoolean b = null;

    public static final BlockStateBoolean c = null;

    public static final BlockStateBoolean d = null;

    public static final BlockStateBoolean e = null;

    public static final BlockStateBoolean f = null;

    protected BlockChorusFruit() {
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int a(Random random) {
        return 0;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public boolean b(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }
}
