package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public class ShapeDetectorBlock {

    private final World a;

    private final BlockPosition b;

    private final boolean c;

    private IBlockData d;

    private TileEntity e;

    private boolean f;

    public ShapeDetectorBlock(World world, BlockPosition blockposition, boolean flag) {
    }

    public IBlockData a() {
        return null;
    }

    @Nullable
    public TileEntity b() {
        return null;
    }

    public BlockPosition getPosition() {
        return null;
    }

    public static Predicate<ShapeDetectorBlock> a(final Predicate<IBlockData> predicate) {
        return null;
    }
}
