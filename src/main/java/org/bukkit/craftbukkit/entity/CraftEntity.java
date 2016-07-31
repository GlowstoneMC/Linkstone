package org.bukkit.craftbukkit.entity;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.*;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public abstract class CraftEntity implements org.bukkit.entity.Entity {

    private static PermissibleBase perm;

    protected final CraftServer server;

    protected Entity entity;

    private EntityDamageEvent lastDamageEvent;

    public CraftEntity(final CraftServer server, final Entity entity) {
    }

    public static CraftEntity getEntity(CraftServer server, Entity entity) {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public Location getLocation(Location loc) {
        return null;
    }

    public Vector getVelocity() {
        return null;
    }

    public void setVelocity(Vector vel) {
    }

    public boolean isOnGround() {
        return false;
    }

    public World getWorld() {
        return null;
    }

    public boolean teleport(Location location) {
        return false;
    }

    public boolean teleport(Location location, TeleportCause cause) {
        return false;
    }

    public boolean teleport(org.bukkit.entity.Entity destination) {
        return false;
    }

    public boolean teleport(org.bukkit.entity.Entity destination, TeleportCause cause) {
        return false;
    }

    public List<org.bukkit.entity.Entity> getNearbyEntities(double x, double y, double z) {
        return null;
    }

    public int getEntityId() {
        return 0;
    }

    public int getFireTicks() {
        return 0;
    }

    public int getMaxFireTicks() {
        return 0;
    }

    public void setFireTicks(int ticks) {
    }

    public void remove() {
    }

    public boolean isDead() {
        return false;
    }

    public boolean isValid() {
        return false;
    }

    public Server getServer() {
        return null;
    }

    public Vector getMomentum() {
        return null;
    }

    public void setMomentum(Vector value) {
    }

    public org.bukkit.entity.Entity getPassenger() {
        return null;
    }

    public boolean setPassenger(org.bukkit.entity.Entity passenger) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean eject() {
        return false;
    }

    public float getFallDistance() {
        return 0.0F;
    }

    public void setFallDistance(float distance) {
    }

    public void setLastDamageCause(EntityDamageEvent event) {
    }

    public EntityDamageEvent getLastDamageCause() {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }

    public int getTicksLived() {
        return 0;
    }

    public void setTicksLived(int value) {
    }

    public Entity getHandle() {
        return null;
    }

    public void playEffect(EntityEffect type) {
    }

    public void setHandle(final Entity entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
    }

    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
    }

    public boolean isInsideVehicle() {
        return false;
    }

    public boolean leaveVehicle() {
        return false;
    }

    public org.bukkit.entity.Entity getVehicle() {
        return null;
    }

    @Override
    public void setCustomName(String name) {
    }

    @Override
    public String getCustomName() {
        return null;
    }

    @Override
    public void setCustomNameVisible(boolean flag) {
    }

    @Override
    public boolean isCustomNameVisible() {
        return false;
    }

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void sendMessage(String[] messages) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isPermissionSet(String name) {
        return false;
    }

    @Override
    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    @Override
    public boolean hasPermission(String name) {
        return false;
    }

    @Override
    public boolean hasPermission(Permission perm) {
        return false;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment) {
    }

    @Override
    public void recalculatePermissions() {
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean value) {
    }

    @Override
    public void setGlowing(boolean flag) {
    }

    @Override
    public boolean isGlowing() {
        return false;
    }

    @Override
    public void setInvulnerable(boolean flag) {
    }

    @Override
    public boolean isInvulnerable() {
        return false;
    }

    @Override
    public boolean isSilent() {
        return false;
    }

    @Override
    public void setSilent(boolean flag) {
    }

    @Override
    public boolean hasGravity() {
        return false;
    }

    @Override
    public void setGravity(boolean gravity) {
    }

    private static PermissibleBase getPermissibleBase() {
        return null;
    }
}
