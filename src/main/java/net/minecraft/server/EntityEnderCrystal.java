package net.minecraft.server;

import com.google.common.base.Optional;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.ExplosionPrimeEvent;

// CraftBukkit end
public class EntityEnderCrystal extends Entity {

    private static final DataWatcherObject<Optional<BlockPosition>> b = null;

    private static final DataWatcherObject<Boolean> c = null;

    public int a = 0;

    public EntityEnderCrystal(World world) {
    }

    public EntityEnderCrystal(World world, double d0, double d1, double d2) {
    }

    protected boolean playStepSound() {
        return false;
    }

    protected void i() {
    }

    public void m() {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public boolean isInteractable() {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void Q() {
    }

    private void a(DamageSource damagesource) {
    }

    public void setBeamTarget(@Nullable BlockPosition blockposition) {
    }

    @Nullable
    public BlockPosition getBeamTarget() {
        return null;
    }

    public void setShowingBottom(boolean flag) {
    }

    public boolean isShowingBottom() {
        return false;
    }
}
