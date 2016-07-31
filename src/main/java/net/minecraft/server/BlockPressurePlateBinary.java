package net.minecraft.server;

import java.util.Iterator;
import java.util.List;
import org.bukkit.event.entity.EntityInteractEvent;

// CraftBukkit
public class BlockPressurePlateBinary extends BlockPressurePlateAbstract {

    public static final BlockStateBoolean POWERED;

    private final BlockPressurePlateBinary.EnumMobType e;

    protected BlockPressurePlateBinary(Material material, BlockPressurePlateBinary.EnumMobType blockpressureplatebinary_enummobtype) {
    }

    protected int getPower(IBlockData iblockdata) {
        return 0;
    }

    protected IBlockData a(IBlockData iblockdata, int i) {
        return null;
    }

    protected void b(World world, BlockPosition blockposition) {
    }

    protected void c(World world, BlockPosition blockposition) {
    }

    protected int e(World world, BlockPosition blockposition) {
        return 0;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EnumMobType {

        EVERYTHING, MOBS;

        private EnumMobType() {
        }
    }
}
