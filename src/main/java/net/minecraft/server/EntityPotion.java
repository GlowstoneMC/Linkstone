package net.minecraft.server;

import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import java.util.HashMap;
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
import org.bukkit.entity.LivingEntity;

// CraftBukkit end
public class EntityPotion extends EntityProjectile {

    private static final DataWatcherObject<Optional<ItemStack>> d = null;

    private static final Logger e = null;

    public EntityPotion(World world) {
    }

    public EntityPotion(World world, EntityLiving entityliving, ItemStack itemstack) {
    }

    public EntityPotion(World world, double d0, double d1, double d2, @Nullable ItemStack itemstack) {
    }

    protected void i() {
    }

    public ItemStack getItem() {
        return null;
    }

    public void setItem(@Nullable ItemStack itemstack) {
    }

    protected float j() {
        return 0.0F;
    }

    protected void a(MovingObjectPosition movingobjectposition) {
    }

    public boolean isLingering() {
        return false;
    }

    private void a(BlockPosition blockposition) {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void b(NBTTagCompound nbttagcompound) {
    }
}
