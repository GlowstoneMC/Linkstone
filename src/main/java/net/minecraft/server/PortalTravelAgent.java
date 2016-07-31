package net.minecraft.server;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Random;
// CraftBukkit start
import org.bukkit.Location;
import org.bukkit.event.entity.EntityPortalExitEvent;
import org.bukkit.util.Vector;

// CraftBukkit end
public class PortalTravelAgent {

    private final WorldServer world;

    private final Random b;

    private final Long2ObjectMap<PortalTravelAgent.ChunkCoordinatesPortal> c;

    public PortalTravelAgent(WorldServer worldserver) {
    }

    public void a(Entity entity, float f) {
    }

    // Split out from original a(Entity, double, double, double, float) method in order to enable being called from createPortal
    private BlockPosition createEndPortal(double x, double y, double z) {
        return null;
    }

    // use logic based on creation to verify end portal
    private BlockPosition findEndPortal(BlockPosition portal) {
        return null;
    }

    // CraftBukkit end
    public boolean b(Entity entity, float f) {
        return false;
    }

    public BlockPosition findPortal(double x, double y, double z, int radius) {
        return null;
    }

    // Entity repositioning logic split out from original b method and combined with repositioning logic for The End from original a method
    public void adjustExit(Entity entity, Location position, Vector velocity) {
    }

    public boolean a(Entity entity) {
        return false;
    }

    public boolean createPortal(double x, double y, double z, int b0) {
        return false;
    }

    public void a(long i) {
    }

    public class ChunkCoordinatesPortal extends BlockPosition {

        public long b;

        public ChunkCoordinatesPortal(BlockPosition blockposition, long i) {
        }

        @Override
        public int compareTo(BaseBlockPosition o) {
            return 0;
        }
    }
}
