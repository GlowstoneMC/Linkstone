package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.block.BlockState;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockSpreadEvent;

// CraftBukkit end
public class BlockMycel extends Block {

    public static final BlockStateBoolean SNOWY = null;

    protected BlockMycel() {
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public void b(World world, BlockPosition blockposition, IBlockData iblockdata, Random random) {
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }
}
