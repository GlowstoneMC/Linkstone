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

    private static final Logger c;

    private final Entity tracker;

    private final int e;

    private int f;

    private final int g;

    private long xLoc;

    private long yLoc;

    private long zLoc;

    private int yRot;

    private int xRot;

    private int headYaw;

    private double n;

    private double o;

    private double p;

    public int a;

    private double q;

    private double r;

    private double s;

    private boolean isMoving;

    private final boolean u;

    private int v;

    private List<Entity> w;

    private boolean x;

    private boolean y;

    public boolean b;

    public final Set<EntityPlayer> trackedPlayers;

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
