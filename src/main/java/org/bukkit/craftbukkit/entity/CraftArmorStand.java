package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityArmorStand;
import net.minecraft.server.Vector3f;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class CraftArmorStand extends CraftLivingEntity implements ArmorStand {

    public CraftArmorStand(CraftServer server, EntityArmorStand entity) {
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public EntityArmorStand getHandle() {
        return null;
    }

    @Override
    public ItemStack getItemInHand() {
        return null;
    }

    @Override
    public void setItemInHand(ItemStack item) {
    }

    @Override
    public ItemStack getBoots() {
        return null;
    }

    @Override
    public void setBoots(ItemStack item) {
    }

    @Override
    public ItemStack getLeggings() {
        return null;
    }

    @Override
    public void setLeggings(ItemStack item) {
    }

    @Override
    public ItemStack getChestplate() {
        return null;
    }

    @Override
    public void setChestplate(ItemStack item) {
    }

    @Override
    public ItemStack getHelmet() {
        return null;
    }

    @Override
    public void setHelmet(ItemStack item) {
    }

    @Override
    public EulerAngle getBodyPose() {
        return null;
    }

    @Override
    public void setBodyPose(EulerAngle pose) {
    }

    @Override
    public EulerAngle getLeftArmPose() {
        return null;
    }

    @Override
    public void setLeftArmPose(EulerAngle pose) {
    }

    @Override
    public EulerAngle getRightArmPose() {
        return null;
    }

    @Override
    public void setRightArmPose(EulerAngle pose) {
    }

    @Override
    public EulerAngle getLeftLegPose() {
        return null;
    }

    @Override
    public void setLeftLegPose(EulerAngle pose) {
    }

    @Override
    public EulerAngle getRightLegPose() {
        return null;
    }

    @Override
    public void setRightLegPose(EulerAngle pose) {
    }

    @Override
    public EulerAngle getHeadPose() {
        return null;
    }

    @Override
    public void setHeadPose(EulerAngle pose) {
    }

    @Override
    public boolean hasBasePlate() {
        return false;
    }

    @Override
    public void setBasePlate(boolean basePlate) {
    }

    @Override
    public void setGravity(boolean gravity) {
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public void setVisible(boolean visible) {
    }

    @Override
    public boolean hasArms() {
        return false;
    }

    @Override
    public void setArms(boolean arms) {
    }

    @Override
    public boolean isSmall() {
        return false;
    }

    @Override
    public void setSmall(boolean small) {
    }

    private static EulerAngle fromNMS(Vector3f old) {
        return null;
    }

    private static Vector3f toNMS(EulerAngle old) {
        return null;
    }

    @Override
    public boolean isMarker() {
        return false;
    }

    @Override
    public void setMarker(boolean marker) {
    }
}
