package net.minecraft.server;

import java.util.List;

public class TileEntityPiston extends TileEntity implements ITickable {

    private IBlockData a;

    private EnumDirection f;

    private boolean g;

    private boolean h;

    private float i;

    private float j;

    public TileEntityPiston() {
    }

    public TileEntityPiston(IBlockData iblockdata, EnumDirection enumdirection, boolean flag, boolean flag1) {
    }

    public IBlockData d() {
        return null;
    }

    public int u() {
        return 0;
    }

    public boolean e() {
        return false;
    }

    public EnumDirection g() {
        return null;
    }

    private float e(float f) {
        return 0.0F;
    }

    public AxisAlignedBB a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public AxisAlignedBB a(IBlockAccess iblockaccess, BlockPosition blockposition, float f) {
        return null;
    }

    private void j() {
    }

    public void i() {
    }

    public void E_() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
