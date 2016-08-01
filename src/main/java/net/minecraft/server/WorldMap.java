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

    public int centerX = 0;

    public int centerZ = 0;

    public byte map = 0;

    public boolean track = false;

    public byte scale = 0;

    public byte[] colors = null;

    public List<WorldMap.WorldMapHumanTracker> h = null;

    private final Map<EntityHuman, WorldMap.WorldMapHumanTracker> j = null;

    public Map<String, MapIcon> decorations = null;

    // CraftBukkit start
    public final CraftMapView mapView = null;

    private CraftServer server = null;

    private UUID uniqueId = null;

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

        public final EntityHuman trackee = null;

        private boolean d = false;

        private int e = 0;

        private int f = 0;

        private int g = 0;

        private int h = 0;

        private int i = 0;

        public int b = 0;

        public WorldMapHumanTracker(EntityHuman entityhuman) {
        }

        public Packet<?> a(ItemStack itemstack) {
            return null;
        }

        public void a(int i, int j) {
        }
    }
}
