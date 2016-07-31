package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;

// PAIL: Fixme
public class EntityEnderDragon extends EntityInsentient implements IComplex, IMonster {

    private static final Logger bJ;

    public static final DataWatcherObject<Integer> PHASE;

    public double[][] b;

    public int c;

    public EntityComplexPart[] children;

    public EntityComplexPart bw;

    public EntityComplexPart bx;

    public EntityComplexPart by;

    public EntityComplexPart bz;

    public EntityComplexPart bA;

    public EntityComplexPart bB;

    public EntityComplexPart bC;

    public EntityComplexPart bD;

    public float bE;

    public float bF;

    public boolean bG;

    public int bH;

    public EntityEnderCrystal currentEnderCrystal;

    private final EnderDragonBattle bK;

    private final DragonControllerManager bL;

    private int bM;

    private int bN;

    private final PathPoint[] bO;

    private final int[] bP;

    private final Path bQ;

    private Explosion explosionSource;

    // CraftBukkit - reusable source for CraftTNTPrimed.getSource()
    public EntityEnderDragon(World world) {
    }

    protected void initAttributes() {
    }

    protected void i() {
    }

    public double[] a(int i, float f) {
        return null;
    }

    public void n() {
    }

    private float q(float f) {
        return 0.0F;
    }

    private void da() {
    }

    private void a(List<Entity> list) {
    }

    private void b(List<Entity> list) {
    }

    private float c(double d0) {
        return 0.0F;
    }

    private boolean b(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public boolean a(EntityComplexPart entitycomplexpart, DamageSource damagesource, float f) {
        return false;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    protected boolean dealDamage(DamageSource damagesource, float f) {
        return false;
    }

    public void Q() {
    }

    protected void bF() {
    }

    private void a(int i) {
    }

    public int o() {
        return 0;
    }

    public int l(double d0, double d1, double d2) {
        return 0;
    }

    @Nullable
    public PathEntity a(int i, int j, @Nullable PathPoint pathpoint) {
        return null;
    }

    private PathEntity a(PathPoint pathpoint, PathPoint pathpoint1) {
        return null;
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    protected void L() {
    }

    public Entity[] aT() {
        return null;
    }

    public boolean isInteractable() {
        return false;
    }

    public World a() {
        return null;
    }

    public SoundCategory bC() {
        return null;
    }

    protected SoundEffect G() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected float ch() {
        return 0.0F;
    }

    public Vec3D a(float f) {
        return null;
    }

    public void a(EntityEnderCrystal entityendercrystal, BlockPosition blockposition, DamageSource damagesource) {
    }

    public void a(DataWatcherObject<?> datawatcherobject) {
    }

    public DragonControllerManager getDragonControllerManager() {
        return null;
    }

    @Nullable
    public EnderDragonBattle cZ() {
        return null;
    }

    public void addEffect(MobEffect mobeffect) {
    }

    protected boolean n(Entity entity) {
        return false;
    }

    public boolean aX() {
        return false;
    }
}
