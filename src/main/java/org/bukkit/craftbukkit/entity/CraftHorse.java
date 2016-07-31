package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityHorse;
import net.minecraft.server.EnumHorseType;
import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftInventoryHorse;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.inventory.HorseInventory;
import java.util.UUID;

public class CraftHorse extends CraftAnimals implements Horse {

    public CraftHorse(CraftServer server, EntityHorse entity) {
    }

    @Override
    public EntityHorse getHandle() {
        return null;
    }

    public Variant getVariant() {
        return null;
    }

    public void setVariant(Variant variant) {
    }

    public Color getColor() {
        return null;
    }

    public void setColor(Color color) {
    }

    public Style getStyle() {
        return null;
    }

    public void setStyle(Style style) {
    }

    public boolean isCarryingChest() {
        return false;
    }

    public void setCarryingChest(boolean chest) {
    }

    public int getDomestication() {
        return 0;
    }

    public void setDomestication(int value) {
    }

    public int getMaxDomestication() {
        return 0;
    }

    public void setMaxDomestication(int value) {
    }

    public double getJumpStrength() {
        return 0.0;
    }

    public void setJumpStrength(double strength) {
    }

    @Override
    public boolean isTamed() {
        return false;
    }

    @Override
    public void setTamed(boolean tamed) {
    }

    @Override
    public AnimalTamer getOwner() {
        return null;
    }

    @Override
    public void setOwner(AnimalTamer owner) {
    }

    public UUID getOwnerUUID() {
        return null;
    }

    public void setOwnerUUID(UUID uuid) {
    }

    public HorseInventory getInventory() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public EntityType getType() {
        return null;
    }
}
