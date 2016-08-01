package net.minecraft.server;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class BlockRedstoneComparator extends BlockDiodeAbstract implements ITileEntity {

    public static final BlockStateBoolean POWERED;

    public static final BlockStateEnum<BlockRedstoneComparator.EnumComparatorMode> MODE;

    public BlockRedstoneComparator(boolean flag) {
    }

    public String getName() {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    protected int i(IBlockData iblockdata) {
        return 0;
    }

    protected IBlockData x(IBlockData iblockdata) {
        return null;
    }

    protected IBlockData y(IBlockData iblockdata) {
        return null;
    }

    protected boolean z(IBlockData iblockdata) {
        return false;
    }

    protected int a(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    private int j(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    protected boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    protected int f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return 0;
    }

    @Nullable
    private EntityItemFrame a(World world, final EnumDirection enumdirection, BlockPosition blockposition) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    protected void g(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    private void k(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    public void onPlace(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, int i, int j) {
        return false;
    }

    public TileEntity a(World world, int i) {
        return null;
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

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public static enum EnumComparatorMode implements INamable {

        COMPARE("compare"), SUBTRACT("subtract");

        private final String c;

        private EnumComparatorMode(String s) {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }
}
