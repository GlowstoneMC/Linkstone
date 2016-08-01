package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityTracker {

    private static final Logger a = null;

    private final WorldServer world = null;

    private final Set<EntityTrackerEntry> c = null;

    public final IntHashMap<EntityTrackerEntry> trackedEntities = null;

    private int e = 0;

    public EntityTracker(WorldServer worldserver) {
    }

    public static long a(double d0) {
        return 0;
    }

    public void track(Entity entity) {
    }

    public void addEntity(Entity entity, int i, int j) {
    }

    public void addEntity(Entity entity, int i, final int j, boolean flag) {
    }

    public void untrackEntity(Entity entity) {
    }

    public void updatePlayers() {
    }

    public void a(EntityPlayer entityplayer) {
    }

    public void a(Entity entity, Packet<?> packet) {
    }

    public void sendPacketToEntity(Entity entity, Packet<?> packet) {
    }

    public void untrackPlayer(EntityPlayer entityplayer) {
    }

    public void a(EntityPlayer entityplayer, Chunk chunk) {
    }

    public void a(int i) {
    }
}
