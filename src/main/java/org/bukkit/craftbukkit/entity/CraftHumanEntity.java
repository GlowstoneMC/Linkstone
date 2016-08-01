package org.bukkit.craftbukkit.entity;

import com.google.common.base.Preconditions;
import java.util.Set;
import net.minecraft.server.*;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.MainHand;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.craftbukkit.inventory.CraftContainer;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.craftbukkit.inventory.CraftInventoryPlayer;
import org.bukkit.craftbukkit.inventory.CraftInventoryView;
import org.bukkit.craftbukkit.inventory.CraftItemStack;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

public class CraftHumanEntity extends CraftLivingEntity implements HumanEntity {

    private CraftInventoryPlayer inventory = null;

    private final CraftInventory enderChest = null;

    protected final PermissibleBase perm = null;

    private boolean op = false;

    private GameMode mode = null;

    public CraftHumanEntity(final CraftServer server, final EntityHuman entity) {
    }

    public String getName() {
        return null;
    }

    public PlayerInventory getInventory() {
        return null;
    }

    public EntityEquipment getEquipment() {
        return null;
    }

    public Inventory getEnderChest() {
        return null;
    }

    public MainHand getMainHand() {
        return null;
    }

    public ItemStack getItemInHand() {
        return null;
    }

    public void setItemInHand(ItemStack item) {
    }

    public ItemStack getItemOnCursor() {
        return null;
    }

    public void setItemOnCursor(ItemStack item) {
    }

    public boolean isSleeping() {
        return false;
    }

    public int getSleepTicks() {
        return 0;
    }

    public boolean isOp() {
        return false;
    }

    public boolean isPermissionSet(String name) {
        return false;
    }

    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    public boolean hasPermission(String name) {
        return false;
    }

    public boolean hasPermission(Permission perm) {
        return false;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;
    }

    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;
    }

    public void removeAttachment(PermissionAttachment attachment) {
    }

    public void recalculatePermissions() {
    }

    public void setOp(boolean value) {
    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    public GameMode getGameMode() {
        return null;
    }

    public void setGameMode(GameMode mode) {
    }

    @Override
    public EntityHuman getHandle() {
        return null;
    }

    public void setHandle(final EntityHuman entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    public InventoryView getOpenInventory() {
        return null;
    }

    public InventoryView openInventory(Inventory inventory) {
        return null;
    }

    private void openCustomInventory(Inventory inventory, EntityPlayer player, String windowType) {
    }

    public InventoryView openWorkbench(Location location, boolean force) {
        return null;
    }

    public InventoryView openEnchanting(Location location, boolean force) {
        return null;
    }

    public void openInventory(InventoryView inventory) {
    }

    @Override
    public InventoryView openMerchant(Villager villager, boolean force) {
        return null;
    }

    public void closeInventory() {
    }

    public boolean isBlocking() {
        return false;
    }

    public boolean setWindowProperty(InventoryView.Property prop, int value) {
        return false;
    }

    public int getExpToLevel() {
        return 0;
    }
}
