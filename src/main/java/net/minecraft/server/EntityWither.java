package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

// CraftBukkit end
public class EntityWither extends EntityMonster implements IRangedEntity {

    private static final DataWatcherObject<Integer> a;

    private static final DataWatcherObject<Integer> b;

    private static final DataWatcherObject<Integer> c;

    private static final DataWatcherObject<Integer>[] bx;

    private static final DataWatcherObject<Integer> by;

    private final float[] bz;

    private final float[] bA;

    private final float[] bB;

    private final float[] bC;

    private final int[] bD;

    private final int[] bE;

    private int bF;

    private final BossBattleServer bG;

    private static final Predicate<Entity> bH;

    public EntityWither(World world) {
    }

    protected void r() {
    }

    protected void i() {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    public void n() {
    }

    protected void M() {
    }

    public static boolean a(Block block) {
        return false;
    }

    public void o() {
    }

    public void aS() {
    }

    public void b(EntityPlayer entityplayer) {
    }

    public void c(EntityPlayer entityplayer) {
    }

    private double n(int i) {
        return 0.0;
    }

    private double o(int i) {
        return 0.0;
    }

    private double p(int i) {
        return 0.0;
    }

    private float b(float f, float f1, float f2) {
        return 0.0F;
    }

    private void a(int i, EntityLiving entityliving) {
    }

    private void a(int i, double d0, double d1, double d2, boolean flag) {
    }

    public void a(EntityLiving entityliving, float f) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    protected void dropDeathLoot(boolean flag, int i) {
    }

    protected void L() {
    }

    public void e(float f, float f1) {
    }

    public void addEffect(MobEffect mobeffect) {
    }

    protected void initAttributes() {
    }

    public int de() {
        return 0;
    }

    public void g(int i) {
    }

    public int m(int i) {
        return 0;
    }

    public void a(int i, int j) {
    }

    public boolean df() {
        return false;
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    protected boolean n(Entity entity) {
        return false;
    }

    public boolean aX() {
        return false;
    }

    class a extends PathfinderGoal {

        public a() {
        }

        public boolean a() {
            return false;
        }
    }
}
