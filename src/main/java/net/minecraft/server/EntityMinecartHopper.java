package net.minecraft.server;

import java.util.List;
import javax.annotation.Nullable;

public class EntityMinecartHopper extends EntityMinecartContainer implements IHopper {

    private boolean a;

    private int b;

    private final BlockPosition c;

    public EntityMinecartHopper(World world) {
    }

    public EntityMinecartHopper(World world, double d0, double d1, double d2) {
    }

    public EntityMinecartAbstract.EnumMinecartType v() {
        return null;
    }

    public IBlockData x() {
        return null;
    }

    public int z() {
        return 0;
    }

    public int getSize() {
        return 0;
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    public void a(int i, int j, int k, boolean flag) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean flag) {
    }

    public World getWorld() {
        return null;
    }

    public double E() {
        return 0.0;
    }

    public double F() {
        return 0.0;
    }

    public double G() {
        return 0.0;
    }

    public void m() {
    }

    public boolean I() {
        return false;
    }

    public void a(DamageSource damagesource) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public void setCooldown(int i) {
    }

    public boolean J() {
        return false;
    }

    public String getContainerName() {
        return null;
    }

    public Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
        return null;
    }
}
