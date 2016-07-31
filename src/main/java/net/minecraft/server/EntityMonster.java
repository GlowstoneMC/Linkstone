package net.minecraft.server;

import org.bukkit.event.entity.EntityCombustByEntityEvent;

// CraftBukkit
public abstract class EntityMonster extends EntityCreature implements IMonster {

    public EntityMonster(World world) {
    }

    public static void c(DataConverterManager dataconvertermanager) {
    }

    public SoundCategory bC() {
        return null;
    }

    public void n() {
    }

    public void m() {
    }

    protected SoundEffect aa() {
        return null;
    }

    protected SoundEffect ab() {
        return null;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    protected SoundEffect bV() {
        return null;
    }

    protected SoundEffect bW() {
        return null;
    }

    protected SoundEffect e(int i) {
        return null;
    }

    public boolean B(Entity entity) {
        return false;
    }

    public float a(BlockPosition blockposition) {
        return 0.0F;
    }

    protected boolean s_() {
        return false;
    }

    public boolean cK() {
        return false;
    }

    protected void initAttributes() {
    }

    protected boolean isDropExperience() {
        return false;
    }
}
