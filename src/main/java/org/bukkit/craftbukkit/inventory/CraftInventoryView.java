package org.bukkit.craftbukkit.inventory;

import org.bukkit.GameMode;
import org.bukkit.craftbukkit.entity.CraftHumanEntity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import net.minecraft.server.Container;

public class CraftInventoryView extends InventoryView {

    private final Container container;

    private final CraftHumanEntity player;

    private final CraftInventory viewing;

    public CraftInventoryView(HumanEntity player, Inventory viewing, Container container) {
    }

    @Override
    public Inventory getTopInventory() {
        return null;
    }

    @Override
    public Inventory getBottomInventory() {
        return null;
    }

    @Override
    public HumanEntity getPlayer() {
        return null;
    }

    @Override
    public InventoryType getType() {
        return null;
    }

    @Override
    public void setItem(int slot, ItemStack item) {
    }

    @Override
    public ItemStack getItem(int slot) {
        return null;
    }

    public boolean isInTop(int rawSlot) {
        return false;
    }

    public Container getHandle() {
        return null;
    }

    public static SlotType getSlotType(InventoryView inventory, int slot) {
        return null;
    }
}
