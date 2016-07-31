package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
// CraftBukkit start
import java.util.UUID;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.map.CraftMapView;

// CraftBukkit end
public class WorldMap extends PersistentBase {

    public int centerX;

    public int centerZ;

    public byte map;

    public boolean track;

    public byte scale;

    public byte[] colors;

    public List<WorldMap.WorldMapHumanTracker> h;

    private final Map<EntityHuman, WorldMap.WorldMapHumanTracker> j;

    public Map<String, MapIcon> decorations;

    // CraftBukkit start
    public final CraftMapView mapView;

    private CraftServer server;

    private UUID uniqueId;

    // CraftBukkit end
    public WorldMap(String s) {
    }

    public void a(double d0, double d1, int i) {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound b(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(EntityHuman entityhuman, ItemStack itemstack) {
    }

    private void a(int i, World world, String s, double d0, double d1, double d2) {
    }

    @Nullable
    public Packet<?> a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        return null;
    }

    public void flagDirty(int i, int j) {
    }

    public WorldMap.WorldMapHumanTracker a(EntityHuman entityhuman) {
        return null;
    }

    public class WorldMapHumanTracker {

        public final EntityHuman trackee;

        private boolean d;

        private int e;

        private int f;

        private int g;

        private int h;

        private int i;

        public int b;

        public WorldMapHumanTracker(EntityHuman entityhuman) {
        }

        public Packet<?> a(ItemStack itemstack) {
            return null;
        }

        public void a(int i, int j) {
        }
    }
}
