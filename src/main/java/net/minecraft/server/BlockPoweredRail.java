package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import org.bukkit.craftbukkit.event.CraftEventFactory;

// CraftBukkit
public class BlockPoweredRail extends BlockMinecartTrackAbstract {

    public static final BlockStateEnum<BlockMinecartTrackAbstract.EnumTrackPosition> SHAPE;

    public static final BlockStateBoolean POWERED;

    protected BlockPoweredRail() {
    }

    protected boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag, int i) {
        return false;
    }

    protected boolean a(World world, BlockPosition blockposition, boolean flag, int i, BlockMinecartTrackAbstract.EnumTrackPosition blockminecarttrackabstract_enumtrackposition) {
        return false;
    }

    protected void b(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public IBlockState<BlockMinecartTrackAbstract.EnumTrackPosition> g() {
        return null;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public IBlockData a(IBlockData iblockdata, EnumBlockMirror enumblockmirror) {
        return null;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static final int[] c;

        static {
        }
    }
}
