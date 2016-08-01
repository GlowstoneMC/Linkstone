package org.bukkit.craftbukkit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.server.WorldMap;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public final class CraftMapView implements MapView {

    private final Map<CraftPlayer, RenderData> renderCache;

    private final List<MapRenderer> renderers;

    private final Map<MapRenderer, Map<CraftPlayer, CraftMapCanvas>> canvases;

    protected final WorldMap worldMap;

    public CraftMapView(WorldMap worldMap) {
    }

    public short getId() {
        return 0;
    }

    public boolean isVirtual() {
        return false;
    }

    public Scale getScale() {
        return null;
    }

    public void setScale(Scale scale) {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public int getCenterX() {
        return 0;
    }

    public int getCenterZ() {
        return 0;
    }

    public void setCenterX(int x) {
    }

    public void setCenterZ(int z) {
    }

    public List<MapRenderer> getRenderers() {
        return null;
    }

    public void addRenderer(MapRenderer renderer) {
    }

    public boolean removeRenderer(MapRenderer renderer) {
        return false;
    }

    private boolean isContextual() {
        return false;
    }

    public RenderData render(CraftPlayer player) {
        return null;
    }
}
