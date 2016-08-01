package net.minecraft.server;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;

// CraftBukkit
public class EntityHorse extends EntityAnimal implements IInventoryListener, IJumpable {

    private static final Predicate<Entity> bD = null;

    public static final IAttribute attributeJumpStrength = null;

    private static final UUID bF = null;

    private static final DataWatcherObject<Byte> bG = null;

    private static final DataWatcherObject<Integer> bH = null;

    private static final DataWatcherObject<Integer> bI = null;

    private static final DataWatcherObject<Optional<UUID>> bJ = null;

    private static final DataWatcherObject<Integer> bK = null;

    private static final String[] bL = null;

    private static final String[] bM = null;

    private static final String[] bN = null;

    private static final String[] bO = null;

    private final PathfinderGoalHorseTrap bP = null;

    private int bQ = 0;

    private int bR = 0;

    private int bS = 0;

    public int bx = 0;

    public int by = 0;

    protected boolean bz = false;

    public InventoryHorseChest inventoryChest = null;

    private boolean bU = false;

    protected int bB = 0;

    protected float jumpPower = 0.0F;

    private boolean canSlide = false;

    private boolean bW = false;

    private int bX = 0;

    private float bY = 0.0F;

    private float bZ = 0.0F;

    private float ca = 0.0F;

    private float cb = 0.0F;

    private float cc = 0.0F;

    private float cd = 0.0F;

    private int ce = 0;

    private String cf = null;

    private final String[] cg = null;

    public int maxDomestication = 0;

    // CraftBukkit - store max domestication value
    public EntityHorse(World world) {
    }

    protected void r() {
    }

    protected void i() {
    }

    public void setType(EnumHorseType enumhorsetype) {
    }

    public EnumHorseType getType() {
        return null;
    }

    public void setVariant(int i) {
    }

    public int getVariant() {
        return 0;
    }

    public String getName() {
        return null;
    }

    private boolean o(int i) {
        return false;
    }

    private void c(int i, boolean flag) {
    }

    public boolean dg() {
        return false;
    }

    public boolean isTamed() {
        return false;
    }

    public boolean di() {
        return false;
    }

    @Nullable
    public UUID getOwnerUUID() {
        return null;
    }

    public void setOwnerUUID(@Nullable UUID uuid) {
    }

    public float dn() {
        return 0.0F;
    }

    public void a(boolean flag) {
    }

    public boolean do_() {
        return false;
    }

    public void setTame(boolean flag) {
    }

    public void q(boolean flag) {
    }

    public boolean a(EntityHuman entityhuman) {
        return false;
    }

    protected void q(float f) {
    }

    public boolean hasChest() {
        return false;
    }

    public EnumHorseArmor dq() {
        return null;
    }

    public boolean dr() {
        return false;
    }

    public boolean ds() {
        return false;
    }

    public boolean dt() {
        return false;
    }

    public boolean hasReproduced() {
        return false;
    }

    public void f(ItemStack itemstack) {
    }

    public void r(boolean flag) {
    }

    public void setHasChest(boolean flag) {
    }

    public void t(boolean flag) {
    }

    public void u(boolean flag) {
    }

    public int getTemper() {
        return 0;
    }

    public void setTemper(int i) {
    }

    public int n(int i) {
        return 0;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public boolean isCollidable() {
        return false;
    }

    public boolean dw() {
        return false;
    }

    public void dx() {
    }

    private void dM() {
    }

    public void e(float f, float f1) {
    }

    private int dN() {
        return 0;
    }

    public void loadChest() {
    }

    private void dP() {
    }

    public void a(InventorySubcontainer inventorysubcontainer) {
    }

    public boolean cK() {
        return false;
    }

    protected EntityHorse a(Entity entity, double d0) {
        return null;
    }

    public double getJumpStrength() {
        return 0.0;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected SoundEffect bV() {
        return null;
    }

    public boolean dz() {
        return false;
    }

    protected SoundEffect G() {
        return null;
    }

    @Nullable
    protected SoundEffect dA() {
        return null;
    }

    protected void a(BlockPosition blockposition, Block block) {
    }

    protected void initAttributes() {
    }

    public int cO() {
        return 0;
    }

    public int getMaxDomestication() {
        return 0;
    }

    protected float ch() {
        return 0.0F;
    }

    public int C() {
        return 0;
    }

    private void dQ() {
    }

    public void f(EntityHuman entityhuman) {
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    private void h(EntityHuman entityhuman) {
    }

    protected boolean cj() {
        return false;
    }

    public boolean e(@Nullable ItemStack itemstack) {
        return false;
    }

    private void dS() {
    }

    public void die(DamageSource damagesource) {
    }

    public void n() {
    }

    public void m() {
    }

    private void dT() {
    }

    private boolean dU() {
        return false;
    }

    public void v(boolean flag) {
    }

    public void w(boolean flag) {
    }

    private void setStanding() {
    }

    public void dJ() {
    }

    public void dropChest() {
    }

    private void a(Entity entity, InventoryHorseChest inventoryhorsechest) {
    }

    public boolean g(EntityHuman entityhuman) {
        return false;
    }

    public void g(float f, float f1) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean mate(EntityAnimal entityanimal) {
        return false;
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    public boolean cP() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void b(int i) {
    }

    public void r_() {
    }

    public void k(Entity entity) {
    }

    public double ay() {
        return 0.0;
    }

    private float dW() {
        return 0.0F;
    }

    private double dX() {
        return 0.0;
    }

    private double dY() {
        return 0.0;
    }

    public boolean dL() {
        return false;
    }

    public void y(boolean flag) {
    }

    public boolean m_() {
        return false;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public boolean c(int i, @Nullable ItemStack itemstack) {
        return false;
    }

    @Nullable
    public Entity bw() {
        return null;
    }

    public EnumMonsterType getMonsterType() {
        return null;
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public static class a implements GroupDataEntity {

        public EnumHorseType a = null;

        public int b = 0;

        public a(EnumHorseType enumhorsetype, int i) {
        }
    }
}
