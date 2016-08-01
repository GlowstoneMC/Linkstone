package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class EntityFallingBlock extends Entity {

    private IBlockData block = null;

    public int ticksLived = 0;

    public boolean dropItem = false;

    private boolean f = false;

    public boolean hurtEntities = false;

    private int fallHurtMax = 0;

    private float fallHurtAmount = 0.0F;

    public NBTTagCompound tileEntityData = null;

    protected static final DataWatcherObject<BlockPosition> d = null;

    public EntityFallingBlock(World world) {
    }

    public EntityFallingBlock(World world, double d0, double d1, double d2, IBlockData iblockdata) {
    }

    public void a(BlockPosition blockposition) {
    }

    protected boolean playStepSound() {
        return false;
    }

    protected void i() {
    }

    public boolean isInteractable() {
        return false;
    }

    public void m() {
    }

    public void e(float f, float f1) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public void a(boolean flag) {
    }

    public void appendEntityCrashDetails(CrashReportSystemDetails crashreportsystemdetails) {
    }

    @Nullable
    public IBlockData getBlock() {
        return null;
    }

    public boolean bu() {
        return false;
    }
}
