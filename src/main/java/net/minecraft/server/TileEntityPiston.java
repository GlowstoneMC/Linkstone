package net.minecraft.server;

import java.util.List;

public class TileEntityPiston extends TileEntity implements ITickable {

    private IBlockData a = null;

    private EnumDirection f = null;

    private boolean g = false;

    private boolean h = false;

    private float i = 0.0F;

    private float j = 0.0F;

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

        static final int[] a = null;

        static {
        }
    }
}
