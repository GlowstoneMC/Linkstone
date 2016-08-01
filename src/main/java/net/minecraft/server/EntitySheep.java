package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.inventory.InventoryView;

// CraftBukkit end
public class EntitySheep extends EntityAnimal {

    private static final DataWatcherObject<Byte> bx = null;

    private final InventoryCrafting container = null;

    private static final Map<EnumColor, float[]> bz = null;

    private int bB = 0;

    private PathfinderGoalEatTile bC = null;

    public static float[] a(EnumColor enumcolor) {
        return null;
    }

    public EntitySheep(World world) {
    }

    protected void r() {
    }

    protected void M() {
    }

    public void n() {
    }

    protected void initAttributes() {
    }

    protected void i() {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
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

    protected void a(BlockPosition blockposition, Block block) {
    }

    public EnumColor getColor() {
        return null;
    }

    public void setColor(EnumColor enumcolor) {
    }

    public boolean isSheared() {
        return false;
    }

    public void setSheared(boolean flag) {
    }

    public static EnumColor a(Random random) {
        return null;
    }

    public EntitySheep b(EntityAgeable entityageable) {
        return null;
    }

    public void A() {
    }

    @Nullable
    public GroupDataEntity prepare(DifficultyDamageScaler difficultydamagescaler, @Nullable GroupDataEntity groupdataentity) {
        return null;
    }

    private EnumColor a(EntityAnimal entityanimal, EntityAnimal entityanimal1) {
        return null;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public EntityAgeable createChild(EntityAgeable entityageable) {
        return null;
    }

    static {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
