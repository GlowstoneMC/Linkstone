package net.minecraft.server;

import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class EntityTameableAnimal extends EntityAnimal implements EntityOwnable {

    protected static final DataWatcherObject<Byte> bx = null;

    protected static final DataWatcherObject<Optional<UUID>> by = null;

    protected PathfinderGoalSit goalSit = null;

    public EntityTameableAnimal(World world) {
    }

    protected void i() {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    protected void p(boolean flag) {
    }

    public boolean isTamed() {
        return false;
    }

    public void setTamed(boolean flag) {
    }

    protected void df() {
    }

    public boolean isSitting() {
        return false;
    }

    public void setSitting(boolean flag) {
    }

    @Nullable
    public UUID getOwnerUUID() {
        return null;
    }

    public void setOwnerUUID(@Nullable UUID uuid) {
    }

    @Nullable
    public EntityLiving getOwner() {
        return null;
    }

    public boolean d(EntityLiving entityliving) {
        return false;
    }

    public PathfinderGoalSit getGoalSit() {
        return null;
    }

    public boolean a(EntityLiving entityliving, EntityLiving entityliving1) {
        return false;
    }

    public ScoreboardTeamBase aQ() {
        return null;
    }

    public boolean r(Entity entity) {
        return false;
    }

    public void die(DamageSource damagesource) {
    }

    public Entity getOwner() {
        return null;
    }
}
