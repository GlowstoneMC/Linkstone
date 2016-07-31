package org.bukkit.craftbukkit.block;

import net.minecraft.server.TileEntityFlowerPot;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.FlowerPot;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.material.MaterialData;

public class CraftFlowerPot extends CraftBlockState implements FlowerPot {

    private final TileEntityFlowerPot pot;

    public CraftFlowerPot(Block block) {
    }

    public CraftFlowerPot(Material material, TileEntityFlowerPot pot) {
    }

    @Override
    public MaterialData getContents() {
        return null;
    }

    @Override
    public void setContents(MaterialData item) {
    }
}
