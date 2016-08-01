package org.bukkit.craftbukkit.entity;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Projectile;

public abstract class AbstractProjectile extends CraftEntity implements Projectile {

    private boolean doesBounce = false;

    public AbstractProjectile(CraftServer server, net.minecraft.server.Entity entity) {
    }

    public boolean doesBounce() {
        return false;
    }

    public void setBounce(boolean doesBounce) {
    }
}
