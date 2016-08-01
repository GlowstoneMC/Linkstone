package net.minecraft.server;

import java.util.Calendar;
import javax.annotation.Nullable;

public class EntityBat extends EntityAmbient {

    private static final DataWatcherObject<Byte> a = null;

    private BlockPosition b = null;

    public EntityBat(World world) {
    }

    protected void i() {
    }

    protected float ch() {
        return 0.0F;
    }

    protected float ci() {
        return 0.0F;
    }

    @Nullable
    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    public boolean isCollidable() {
        return false;
    }

    protected void C(Entity entity) {
    }

    protected void cs() {
    }

    protected void initAttributes() {
    }

    public boolean isAsleep() {
        return false;
    }

    public void setAsleep(boolean flag) {
    }

    public void m() {
    }

    protected void M() {
    }

    protected boolean playStepSound() {
        return false;
    }

    public void e(float f, float f1) {
    }

    protected void a(double d0, boolean flag, IBlockData iblockdata, BlockPosition blockposition) {
    }

    public boolean isIgnoreBlockTrigger() {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public boolean cK() {
        return false;
    }

    private boolean a(Calendar calendar) {
        return false;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }
}
