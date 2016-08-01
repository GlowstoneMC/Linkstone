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

    private final boolean a = false;

    private final boolean b = false;

    private final Random c = null;

    private final World world = null;

    private final double posX = 0.0;

    private final double posY = 0.0;

    private final double posZ = 0.0;

    public final Entity source = null;

    private final float size = 0.0F;

    private final List<BlockPosition> blocks = null;

    private final Map<EntityHuman, Vec3D> k = null;

    public boolean wasCanceled = false;

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
