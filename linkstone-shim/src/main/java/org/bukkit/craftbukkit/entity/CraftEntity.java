package org.bukkit.craftbukkit.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import net.glowstone.entity.GlowEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftEntity implements org.bukkit.entity.Entity {
    private GlowEntity base;
    public CraftEntity(GlowEntity e) {
        this.base = e;
    }

    public CraftEntity(CraftServer server, net.minecraft.server.Entity entity) {
        System.out.println("[LINKSTONE]: TODO: CraftEntity(CraftServer, net.minecraft.server.Entity)");
        // TODO
    }

    @Override
    public List<MetadataValue> getMetadata(String arg0) {
        return base.getMetadata(arg0);
    }

    @Override
    public boolean hasMetadata(String arg0) {
        return base.hasMetadata(arg0);
    }

    @Override
    public void removeMetadata(String arg0, Plugin arg1) {
        base.removeMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public void setMetadata(String arg0, MetadataValue arg1) {
        base.setMetadata(arg0, arg1); // LinkFiller
    }

    @Override
    public String getName() {
        return base.getName(); // LinkFiller
    }

    @Override
    public void sendMessage(String arg0) {
        base.sendMessage(arg0); // LinkFiller
    }

    @Override
    public void sendMessage(String[] arg0) {
        base.sendMessage(arg0); // LinkFiller
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0) {
        return base.addAttachment(arg0);
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, int arg1) {
        return base.addAttachment(arg0, arg1);
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2) {
        return base.addAttachment(arg0, arg1, arg2);
    }

    @Override
    public PermissionAttachment addAttachment(Plugin arg0, String arg1, boolean arg2, int arg3) {
        return base.addAttachment(arg0, arg1, arg2, arg3);
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return base.getEffectivePermissions(); // LinkFiller
    }

    @Override
    public boolean hasPermission(String arg0) {
        return base.hasPermission(arg0);
    }

    @Override
    public boolean hasPermission(Permission arg0) {
        return base.hasPermission(arg0);
    }

    @Override
    public boolean isPermissionSet(String arg0) {
        return base.isPermissionSet(arg0);
    }

    @Override
    public boolean isPermissionSet(Permission arg0) {
        return base.isPermissionSet(arg0);
    }

    @Override
    public void recalculatePermissions() {
        base.recalculatePermissions(); // LinkFiller
    }

    @Override
    public void removeAttachment(PermissionAttachment arg0) {
        base.removeAttachment(arg0); // LinkFiller
    }

    @Override
    public boolean isOp() {
        return base.isOp(); // LinkFiller
    }

    @Override
    public void setOp(boolean arg0) {
        base.setOp(arg0); // LinkFiller
    }

    @Override
    public String getCustomName() {
        return base.getCustomName(); // LinkFiller
    }

    @Override
    public void setCustomName(String arg0) {
        base.setCustomName(arg0); // LinkFiller
    }

    @Override
    public boolean addPassenger(Entity arg0) {
        return base.addPassenger(arg0);
    }

    @Override
    public boolean addScoreboardTag(String arg0) {
        return base.addScoreboardTag(arg0);
    }

    @Override
    public boolean eject() {
        return base.eject(); // LinkFiller
    }

    @Override
    public boolean fromMobSpawner() {
        return base.fromMobSpawner(); // LinkFiller
    }

    @Override
    public int getEntityId() {
        return base.getEntityId(); // LinkFiller
    }

    @Override
    public float getFallDistance() {
        return base.getFallDistance(); // LinkFiller
    }

    @Override
    public int getFireTicks() {
        return base.getFireTicks(); // LinkFiller
    }

    @Override
    public double getHeight() {
        return base.getHeight(); // LinkFiller
    }

    @Override
    public EntityDamageEvent getLastDamageCause() {
        return base.getLastDamageCause(); // LinkFiller
    }

    @Override
    public Location getLocation() {
        return base.getLocation(); // LinkFiller
    }

    @Override
    public Location getLocation(Location arg0) {
        return base.getLocation(arg0);
    }

    @Override
    public int getMaxFireTicks() {
        return base.getMaxFireTicks(); // LinkFiller
    }

    @Override
    public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
        List<Entity> list = new ArrayList<>();
        for (Entity e : base.getNearbyEntities(arg0, arg1, arg2))
            list.add(new CraftEntity((GlowEntity) e));
        return list;
    }

    @Override
    public Location getOrigin() {
        return base.getOrigin(); // LinkFiller
    }

    @Override
    public Entity getPassenger() {
        return new CraftEntity((GlowEntity)base.getPassenger()); // LinkFiller
    }

    @Override
    public List<Entity> getPassengers() {
        List<Entity> list = new ArrayList<>();
        for (Entity e : base.getPassengers())
            list.add(new CraftEntity((GlowEntity) e));

        return list;
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return base.getPistonMoveReaction(); // LinkFiller
    }

    @Override
    public int getPortalCooldown() {
        return base.getPortalCooldown(); // LinkFiller
    }

    @Override
    public Set<String> getScoreboardTags() {
        return base.getScoreboardTags(); // LinkFiller
    }

    @Override
    public Server getServer() {
        return base.getServer(); // LinkFiller
    }

    @Override
    public int getTicksLived() {
        return base.getTicksLived(); // LinkFiller
    }

    @Override
    public EntityType getType() {
        return base.getType(); // LinkFiller
    }

    @Override
    public UUID getUniqueId() {
        return base.getUniqueId(); // LinkFiller
    }

    @Override
    public Entity getVehicle() {
        return base.getVehicle(); // LinkFiller // TODO: Craft Vehicle
    }

    @Override
    public Vector getVelocity() {
        return base.getVelocity(); // LinkFiller
    }

    @Override
    public double getWidth() {
        return base.getWidth(); // LinkFiller
    }

    @Override
    public World getWorld() {
        return new CraftWorld(base.getWorld());
    }

    @Override
    public boolean hasGravity() {
        return base.hasGravity(); // LinkFiller
    }

    @Override
    public boolean isCustomNameVisible() {
        return base.isCustomNameVisible(); // LinkFiller
    }

    @Override
    public boolean isDead() {
        return base.isDead(); // LinkFiller
    }

    @Override
    public boolean isEmpty() {
        return base.isEmpty(); // LinkFiller
    }

    @Override
    public boolean isGlowing() {
        return base.isGlowing(); // LinkFiller
    }

    @Override
    public boolean isInsideVehicle() {
        return base.isInsideVehicle(); // LinkFiller
    }

    @Override
    public boolean isInvulnerable() {
        return base.isInvulnerable(); // LinkFiller
    }

    @Override
    public boolean isOnGround() {
        return base.isOnGround(); // LinkFiller
    }

    @Override
    public boolean isSilent() {
        return base.isSilent(); // LinkFiller
    }

    @Override
    public boolean isValid() {
        return base.isValid(); // LinkFiller
    }

    @Override
    public boolean leaveVehicle() {
        return base.leaveVehicle(); // LinkFiller
    }

    @Override
    public void playEffect(EntityEffect arg0) {
        base.playEffect(arg0); // LinkFiller
    }

    @Override
    public void remove() {
        base.remove(); // LinkFiller
    }

    @Override
    public boolean removePassenger(Entity arg0) {
        return base.removePassenger(arg0);
    }

    @Override
    public boolean removeScoreboardTag(String arg0) {
        return base.removeScoreboardTag(arg0);
    }

    @Override
    public void setCustomNameVisible(boolean arg0) {
        base.setCustomNameVisible(arg0); // LinkFiller
    }

    @Override
    public void setFallDistance(float arg0) {
        base.setFallDistance(arg0); // LinkFiller
    }

    @Override
    public void setFireTicks(int arg0) {
        base.setFireTicks(arg0); // LinkFiller
    }

    @Override
    public void setGlowing(boolean arg0) {
        base.setGlowing(arg0); // LinkFiller
    }

    @Override
    public void setGravity(boolean arg0) {
        base.setGravity(arg0); // LinkFiller
    }

    @Override
    public void setInvulnerable(boolean arg0) {
        base.setInvulnerable(arg0); // LinkFiller
    }

    @Override
    public void setLastDamageCause(EntityDamageEvent arg0) {
        base.setLastDamageCause(arg0); // LinkFiller
    }

    @Override
    public boolean setPassenger(Entity arg0) {
        return base.setPassenger(arg0);
    }

    @Override
    public void setPortalCooldown(int arg0) {
        base.setPortalCooldown(arg0); // LinkFiller
    }

    @Override
    public void setSilent(boolean arg0) {
        base.setSilent(arg0); // LinkFiller
    }

    @Override
    public void setTicksLived(int arg0) {
        base.setTicksLived(arg0); // LinkFiller
    }

    @Override
    public void setVelocity(Vector arg0) {
        base.setVelocity(arg0); // LinkFiller
    }

    @Override
    public Spigot spigot() {
        return base.spigot(); // LinkFiller
    }

    @Override
    public boolean teleport(Location arg0) {
        return base.teleport(arg0);
    }

    @Override
    public boolean teleport(Entity arg0) {
        return base.teleport(arg0);
    }

    @Override
    public boolean teleport(Location arg0, TeleportCause arg1) {
        return base.teleport(arg0,arg1);
    }

    @Override
    public boolean teleport(Entity arg0, TeleportCause arg1) {
        return base.teleport(arg0);
    }

}