package org.bukkit.craftbukkit.inventory;

import net.minecraft.server.EntityInsentient;
import net.minecraft.server.EnumItemSlot;
import org.bukkit.craftbukkit.entity.CraftLivingEntity;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class CraftEntityEquipment implements EntityEquipment {

    private final CraftLivingEntity entity = null;

    public CraftEntityEquipment(CraftLivingEntity entity) {
    }

    @Override
    public ItemStack getItemInMainHand() {
        return null;
    }

    @Override
    public void setItemInMainHand(ItemStack item) {
    }

    @Override
    public ItemStack getItemInOffHand() {
        return null;
    }

    @Override
    public void setItemInOffHand(ItemStack item) {
    }

    @Override
    public ItemStack getItemInHand() {
        return null;
    }

    @Override
    public void setItemInHand(ItemStack stack) {
    }

    public ItemStack getHelmet() {
        return null;
    }

    public void setHelmet(ItemStack helmet) {
    }

    public ItemStack getChestplate() {
        return null;
    }

    public void setChestplate(ItemStack chestplate) {
    }

    public ItemStack getLeggings() {
        return null;
    }

    public void setLeggings(ItemStack leggings) {
    }

    public ItemStack getBoots() {
        return null;
    }

    public void setBoots(ItemStack boots) {
    }

    public ItemStack[] getArmorContents() {
        return null;
    }

    public void setArmorContents(ItemStack[] items) {
    }

    private ItemStack getEquipment(EnumItemSlot slot) {
        return null;
    }

    private void setEquipment(EnumItemSlot slot, ItemStack stack) {
    }

    public void clear() {
    }

    public Entity getHolder() {
        return null;
    }

    @Override
    public float getItemInHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInHandDropChance(float chance) {
    }

    @Override
    public float getItemInMainHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInMainHandDropChance(float chance) {
    }

    @Override
    public float getItemInOffHandDropChance() {
        return 0.0F;
    }

    @Override
    public void setItemInOffHandDropChance(float chance) {
    }

    public float getHelmetDropChance() {
        return 0.0F;
    }

    public void setHelmetDropChance(float chance) {
    }

    public float getChestplateDropChance() {
        return 0.0F;
    }

    public void setChestplateDropChance(float chance) {
    }

    public float getLeggingsDropChance() {
        return 0.0F;
    }

    public void setLeggingsDropChance(float chance) {
    }

    public float getBootsDropChance() {
        return 0.0F;
    }

    public void setBootsDropChance(float chance) {
    }

    private void setDropChance(EnumItemSlot slot, float chance) {
    }

    private float getDropChance(EnumItemSlot slot) {
        return 0.0F;
    }
}
