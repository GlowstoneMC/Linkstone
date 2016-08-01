package org.bukkit.craftbukkit.block;

import net.minecraft.server.*;
import net.minecraft.server.BlockJukeBox.TileEntityRecordPlayer;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Jukebox;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;

public class CraftJukebox extends CraftBlockState implements Jukebox {

    private final CraftWorld world = null;

    private final TileEntityRecordPlayer jukebox = null;

    public CraftJukebox(final Block block) {
    }

    public CraftJukebox(final Material material, TileEntityRecordPlayer te) {
    }

    @Override
    public Material getPlaying() {
        return null;
    }

    @Override
    public void setPlaying(Material record) {
    }

    public boolean isPlaying() {
        return false;
    }

    public boolean eject() {
        return false;
    }

    @Override
    public TileEntityRecordPlayer getTileEntity() {
        return null;
    }
}
