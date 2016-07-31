package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
// CraftBukkit start
import org.bukkit.craftbukkit.event.CraftEventFactory;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.Location;
import org.bukkit.event.block.BlockExplodeEvent;

// CraftBukkit end
public class Explosion {

    private final boolean a;

    private final boolean b;

    private final Random c;

    private final World world;

    private final double posX;

    private final double posY;

    private final double posZ;

    public final Entity source;

    private final float size;

    private final List<BlockPosition> blocks;

    private final Map<EntityHuman, Vec3D> k;

    public boolean wasCanceled;

    // CraftBukkit - add field
    public Explosion(World world, Entity entity, double d0, double d1, double d2, float f, boolean flag, boolean flag1) {
    }

    public void a() {
    }

    public void a(boolean flag) {
    }

    public Map<EntityHuman, Vec3D> b() {
        return null;
    }

    public EntityLiving getSource() {
        return null;
    }

    public void clearBlocks() {
    }

    public List<BlockPosition> getBlocks() {
        return null;
    }
}
