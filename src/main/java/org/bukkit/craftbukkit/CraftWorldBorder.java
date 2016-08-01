package org.bukkit.craftbukkit;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;

public class CraftWorldBorder implements WorldBorder {

    private final World world;

    private final net.minecraft.server.WorldBorder handle;

    public CraftWorldBorder(CraftWorld world) {
    }

    @Override
    public void reset() {
    }

    @Override
    public double getSize() {
        return 0.0;
    }

    @Override
    public void setSize(double newSize) {
    }

    @Override
    public void setSize(double newSize, long time) {
    }

    @Override
    public Location getCenter() {
        return null;
    }

    @Override
    public void setCenter(double x, double z) {
    }

    @Override
    public void setCenter(Location location) {
    }

    @Override
    public double getDamageBuffer() {
        return 0.0;
    }

    @Override
    public void setDamageBuffer(double blocks) {
    }

    @Override
    public double getDamageAmount() {
        return 0.0;
    }

    @Override
    public void setDamageAmount(double damage) {
    }

    @Override
    public int getWarningTime() {
        return 0;
    }

    @Override
    public void setWarningTime(int time) {
    }

    @Override
    public int getWarningDistance() {
        return 0;
    }

    @Override
    public void setWarningDistance(int distance) {
    }
}
