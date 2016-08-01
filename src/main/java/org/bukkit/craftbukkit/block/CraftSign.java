package org.bukkit.craftbukkit.block;

import net.minecraft.server.ChatComponentText;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.TileEntitySign;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.util.CraftChatMessage;

public class CraftSign extends CraftBlockState implements Sign {

    private final TileEntitySign sign = null;

    private final String[] lines = null;

    public CraftSign(final Block block) {
    }

    public CraftSign(final Material material, final TileEntitySign te) {
    }

    public String[] getLines() {
        return null;
    }

    public String getLine(int index) throws IndexOutOfBoundsException {
        return null;
    }

    public void setLine(int index, String line) throws IndexOutOfBoundsException {
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    public static IChatBaseComponent[] sanitizeLines(String[] lines) {
        return null;
    }

    public static String[] revertComponents(IChatBaseComponent[] components) {
        return null;
    }

    private static String revertComponent(IChatBaseComponent component) {
        return null;
    }

    @Override
    public TileEntitySign getTileEntity() {
        return null;
    }
}
