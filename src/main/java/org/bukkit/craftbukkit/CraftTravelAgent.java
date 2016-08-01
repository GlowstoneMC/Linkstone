package org.bukkit.craftbukkit;

import net.minecraft.server.BlockPosition;
import net.minecraft.server.PortalTravelAgent;
import net.minecraft.server.WorldServer;
import org.bukkit.Location;
import org.bukkit.TravelAgent;

public class CraftTravelAgent extends PortalTravelAgent implements TravelAgent {

    public static TravelAgent DEFAULT = null;

    private int searchRadius = 0;

    private int creationRadius = 0;

    private boolean canCreatePortal = false;

    public CraftTravelAgent(WorldServer worldserver) {
    }

    @Override
    public Location findOrCreate(Location target) {
        return null;
    }

    @Override
    public Location findPortal(Location location) {
        return null;
    }

    @Override
    public boolean createPortal(Location location) {
        return false;
    }

    @Override
    public TravelAgent setSearchRadius(int radius) {
        return null;
    }

    @Override
    public int getSearchRadius() {
        return 0;
    }

    @Override
    public TravelAgent setCreationRadius(int radius) {
        return null;
    }

    @Override
    public int getCreationRadius() {
        return 0;
    }

    @Override
    public boolean getCanCreatePortal() {
        return false;
    }

    @Override
    public void setCanCreatePortal(boolean create) {
    }
}
