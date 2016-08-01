package org.bukkit.craftbukkit.block;

import com.google.common.base.Preconditions;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.TileEntitySkull;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.SkullType;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Skull;
import org.bukkit.craftbukkit.CraftWorld;

public class CraftSkull extends CraftBlockState implements Skull {

    private static final int MAX_OWNER_LENGTH = 0;

    private final TileEntitySkull skull = null;

    private GameProfile profile = null;

    private SkullType skullType = null;

    private byte rotation = 0;

    public CraftSkull(final Block block) {
    }

    public CraftSkull(final Material material, final TileEntitySkull te) {
    }

    static SkullType getSkullType(int id) {
        return null;
    }

    static int getSkullType(SkullType type) {
        return 0;
    }

    static byte getBlockFace(BlockFace rotation) {
        return 0;
    }

    static BlockFace getBlockFace(byte rotation) {
        return null;
    }

    public boolean hasOwner() {
        return false;
    }

    public String getOwner() {
        return null;
    }

    public boolean setOwner(String name) {
        return false;
    }

    @Override
    public OfflinePlayer getOwningPlayer() {
        return null;
    }

    @Override
    public void setOwningPlayer(OfflinePlayer player) {
    }

    public BlockFace getRotation() {
        return null;
    }

    public void setRotation(BlockFace rotation) {
    }

    public SkullType getSkullType() {
        return null;
    }

    public void setSkullType(SkullType skullType) {
    }

    @Override
    public boolean update(boolean force, boolean applyPhysics) {
        return false;
    }

    @Override
    public TileEntitySkull getTileEntity() {
        return null;
    }
}
