package net.minecraft.server;

import com.google.common.base.Optional;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.event.player.PlayerPickupItemEvent;

// CraftBukkit
public class EntityItem extends Entity {

    private static final Logger b;

    private static final DataWatcherObject<Optional<ItemStack>> c;

    private int age;

    public int pickupDelay;

    private int f;

    private String g;

    private String h;

    public float a;

    private int lastTick;

    // CraftBukkit
    public EntityItem(World world, double d0, double d1, double d2) {
    }

    public EntityItem(World world, double d0, double d1, double d2, ItemStack itemstack) {
    }

    protected boolean playStepSound() {
        return false;
    }

    public EntityItem(World world) {
    }

    protected void i() {
    }

    public void m() {
    }

    private void x() {
    }

    private boolean a(EntityItem entityitem) {
        return false;
    }

    public void j() {
    }

    public boolean ak() {
        return false;
    }

    protected void burn(int i) {
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void d(EntityHuman entityhuman) {
    }

    public String getName() {
        return null;
    }

    public boolean aV() {
        return false;
    }

    @Nullable
    public Entity c(int i) {
        return null;
    }

    public ItemStack getItemStack() {
        return null;
    }

    public void setItemStack(@Nullable ItemStack itemstack) {
    }

    public String l() {
        return null;
    }

    public void d(String s) {
    }

    public String n() {
        return null;
    }

    public void e(String s) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void a(int i) {
    }

    public boolean t() {
        return false;
    }

    public void v() {
    }

    public void w() {
    }
}
