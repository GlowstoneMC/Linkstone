package net.minecraft.server;

import org.bukkit.craftbukkit.event.CraftEventFactory;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class EntityLeash extends EntityHanging {

    public EntityLeash(World world) {
    }

    public EntityLeash(World world, BlockPosition blockposition) {
    }

    public void setPosition(double d0, double d1, double d2) {
    }

    protected void updateBoundingBox() {
    }

    public void setDirection(EnumDirection enumdirection) {
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    public void a(@Nullable Entity entity) {
    }

    public boolean d(NBTTagCompound nbttagcompound) {
        return false;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    public boolean survives() {
        return false;
    }

    public static EntityLeash a(World world, BlockPosition blockposition) {
        return null;
    }

    public static EntityLeash b(World world, BlockPosition blockposition) {
        return null;
    }

    public void o() {
    }
}
