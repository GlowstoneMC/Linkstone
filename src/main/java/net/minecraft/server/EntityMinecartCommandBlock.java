package net.minecraft.server;

import javax.annotation.Nullable;

public class EntityMinecartCommandBlock extends EntityMinecartAbstract {

    public static final DataWatcherObject<String> a = null;

    // PAIL: private -> public
    private static final DataWatcherObject<IChatBaseComponent> b = null;

    private final CommandBlockListenerAbstract c = null;

    private int d = 0;

    public EntityMinecartCommandBlock(World world) {
    }

    public EntityMinecartCommandBlock(World world, double d0, double d1, double d2) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    protected void i() {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    public EntityMinecartAbstract.EnumMinecartType v() {
        return null;
    }

    public IBlockData x() {
        return null;
    }

    public CommandBlockListenerAbstract getCommandBlock() {
        return null;
    }

    public void a(int i, int j, int k, boolean flag) {
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public boolean bu() {
        return false;
    }
}
