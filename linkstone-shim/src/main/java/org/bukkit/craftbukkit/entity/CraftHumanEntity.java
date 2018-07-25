package org.bukkit.craftbukkit.entity;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;

import net.glowstone.entity.GlowEntity;
import net.glowstone.entity.GlowHumanEntity;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftHumanEntity extends CraftLivingEntity implements HumanEntity {
    private GlowHumanEntity base;
    public CraftHumanEntity(GlowHumanEntity e) {
        super(e);
        this.base = e;
    }

    @Override
    public void closeInventory() {
        base.closeInventory(); // LinkFiller
    }

    @Override
    public int getCooldown(Material arg0) {
        return base.getCooldown(arg0); // LinkFiller
    }

    @Override
    public Inventory getEnderChest() {
        return base.getEnderChest(); // LinkFiller
    }

    @Override
    public int getExpToLevel() {
        return base.getExpToLevel(); // LinkFiller
    }

    @Override
    public GameMode getGameMode() {
        return base.getGameMode(); // LinkFiller
    }

    @Override
    public PlayerInventory getInventory() {
        return base.getInventory(); // LinkFiller
    }

    @Override
    public ItemStack getItemInHand() {
        return base.getItemInHand(); // LinkFiller
    }

    @Override
    public ItemStack getItemOnCursor() {
        return base.getItemOnCursor(); // LinkFiller
    }

    @Override
    public MainHand getMainHand() {
        return base.getMainHand(); // LinkFiller
    }

    @Override
    public InventoryView getOpenInventory() {
        return base.getOpenInventory(); // LinkFiller
    }

    @Override
    public Entity getShoulderEntityLeft() {
        return new CraftEntity((GlowEntity)base.getShoulderEntityLeft()); // LinkFiller
    }

    @Override
    public Entity getShoulderEntityRight() {
        return new CraftEntity((GlowEntity)base.getShoulderEntityRight()); // LinkFiller
    }

    @Override
    public int getSleepTicks() {
        return base.getSleepTicks(); // LinkFiller
    }

    @Override
    public boolean hasCooldown(Material arg0) {
        return base.hasCooldown(arg0); // LinkFiller
    }

    @Override
    public boolean isBlocking() {
        return base.isBlocking(); // LinkFiller
    }

    @Override
    public boolean isHandRaised() {
        return base.isHandRaised(); // LinkFiller
    }

    @Override
    public boolean isSleeping() {
        return base.isSleeping(); // LinkFiller
    }

    @Override
    public InventoryView openEnchanting(Location arg0, boolean arg1) {
        return base.openEnchanting(arg0, arg1); // LinkFiller
    }

    @Override
    public InventoryView openInventory(Inventory arg0) {
        return base.openInventory(arg0); // LinkFiller
    }

    @Override
    public void openInventory(InventoryView arg0) {
        base.openInventory(arg0); // LinkFiller
    }

    @Override
    public InventoryView openMerchant(Villager arg0, boolean arg1) {
        return base.openMerchant(arg0, arg1); // LinkFiller
    }

    @Override
    public InventoryView openMerchant(Merchant arg0, boolean arg1) {
        return base.openMerchant(arg0, arg1); // LinkFiller
    }

    @Override
    public void openSign(Sign arg0) {
        base.openSign(arg0); // LinkFiller
    }

    @Override
    public InventoryView openWorkbench(Location arg0, boolean arg1) {
        return base.openWorkbench(arg0, arg1); // LinkFiller
    }

    @Override
    public Entity releaseLeftShoulderEntity() {
        return new CraftEntity((GlowEntity) base.releaseLeftShoulderEntity());
    }

    @Override
    public Entity releaseRightShoulderEntity() {
        return new CraftEntity((GlowEntity)base.releaseRightShoulderEntity());
    }

    @Override
    public void setCooldown(Material arg0, int arg1) {
        base.setCooldown(arg0, arg1); // LinkFiller
    }

    @Override
    public void setGameMode(GameMode arg0) {
        base.setGameMode(arg0); // LinkFiller
    }

    @Override
    public void setItemInHand(ItemStack arg0) {
        base.setItemInHand(arg0); // LinkFiller
    }

    @Override
    public void setItemOnCursor(ItemStack arg0) {
        base.setItemOnCursor(arg0); // LinkFiller
    }

    @Override
    public void setShoulderEntityLeft(Entity arg0) {
        base.setShoulderEntityLeft(arg0); // LinkFiller
    }

    @Override
    public void setShoulderEntityRight(Entity arg0) {
        base.setShoulderEntityRight(arg0); // LinkFiller
    }

    @Override
    public boolean setWindowProperty(Property arg0, int arg1) {
        return base.setWindowProperty(arg0, arg1); // LinkFiller
    }

}