package net.minecraft.server;

import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.event.block.EntityBlockFormEvent;

// CraftBukkit end
public class EntitySnowman extends EntityGolem implements IRangedEntity {

    private static final DataWatcherObject<Byte> a;

    public EntitySnowman(World world) {
    }

    public static void b(DataConverterManager dataconvertermanager) {
    }

    protected void r() {
    }

    protected void initAttributes() {
    }

    protected void i() {
    }

    public void n() {
    }

    @Nullable
    protected MinecraftKey J() {
        return null;
    }

    public void a(EntityLiving entityliving, float f) {
    }

    public float getHeadHeight() {
        return 0.0F;
    }

    protected boolean a(EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack) {
        return false;
    }

    public boolean isDerp() {
        return false;
    }

    public void setDerp(boolean flag) {
    }

    @Nullable
    protected SoundEffect G() {
        return null;
    }

    @Nullable
    protected SoundEffect bV() {
        return null;
    }

    @Nullable
    protected SoundEffect bW() {
        return null;
    }
}
