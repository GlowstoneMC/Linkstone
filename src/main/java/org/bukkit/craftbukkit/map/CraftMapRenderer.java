package org.bukkit.craftbukkit.map;

import net.minecraft.server.WorldMap;
import net.minecraft.server.MapIcon;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapCursorCollection;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class CraftMapRenderer extends MapRenderer {

    private final WorldMap worldMap = null;

    public CraftMapRenderer(CraftMapView mapView, WorldMap worldMap) {
    }

    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
    }
}
