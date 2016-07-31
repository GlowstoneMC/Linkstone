package org.bukkit.craftbukkit.map;

import java.awt.Image;
import java.util.Arrays;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapCursorCollection;
import org.bukkit.map.MapFont;
import org.bukkit.map.MapFont.CharacterSprite;
import org.bukkit.map.MapPalette;

public class CraftMapCanvas implements MapCanvas {

    private final byte[] buffer;

    private final CraftMapView mapView;

    private byte[] base;

    private MapCursorCollection cursors;

    protected CraftMapCanvas(CraftMapView mapView) {
    }

    public CraftMapView getMapView() {
        return null;
    }

    public MapCursorCollection getCursors() {
        return null;
    }

    public void setCursors(MapCursorCollection cursors) {
    }

    public void setPixel(int x, int y, byte color) {
    }

    public byte getPixel(int x, int y) {
        return 0;
    }

    public byte getBasePixel(int x, int y) {
        return 0;
    }

    protected void setBase(byte[] base) {
    }

    protected byte[] getBuffer() {
        return null;
    }

    public void drawImage(int x, int y, Image image) {
    }

    public void drawText(int x, int y, MapFont font, String text) {
    }
}
