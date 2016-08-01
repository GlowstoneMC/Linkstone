package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerVelocityEvent;

// CraftBukkit end
public class EntityTrackerEntry {

    private static final Logger c = null;

    private final Entity tracker = null;

    private final int e = 0;

    private int f = 0;

    private final int g = 0;

    private long xLoc = 0;

    private long yLoc = 0;

    private long zLoc = 0;

    private int yRot = 0;

    private int xRot = 0;

    private int headYaw = 0;

    private double n = 0.0;

    private double o = 0.0;

    private double p = 0.0;

    public int a = 0;

    private double q = 0.0;

    private double r = 0.0;

    private double s = 0.0;

    private boolean isMoving = false;

    private final boolean u = false;

    private int v = 0;

    private List<Entity> w = null;

    private boolean x = false;

    private boolean y = false;

    public boolean b = false;

    public final Set<EntityPlayer> trackedPlayers = null;

    public EntityTrackerEntry(Entity entity, int i, int j, int k, boolean flag) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public void track(List<EntityHuman> list) {
    }

    private void d() {
    }

    public void broadcast(Packet<?> packet) {
    }

    public void broadcastIncludingSelf(Packet<?> packet) {
    }

    public void a() {
    }

    public void a(EntityPlayer entityplayer) {
    }

    public void updatePlayer(EntityPlayer entityplayer) {
    }

    public boolean c(EntityPlayer entityplayer) {
        return false;
    }

    private boolean e(EntityPlayer entityplayer) {
        return false;
    }

    public void scanPlayers(List<EntityHuman> list) {
    }

    private Packet<?> e() {
        return null;
    }

    public void clear(EntityPlayer entityplayer) {
    }

    public Entity b() {
        return null;
    }

    public void a(int i) {
    }

    public void c() {
    }
}
