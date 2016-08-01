package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockTallPlant extends BlockPlant implements IBlockFragilePlantElement {

    public static final BlockStateEnum<BlockTallPlant.EnumTallFlowerVariants> VARIANT;

    public static final BlockStateEnum<BlockTallPlant.EnumTallPlantHalf> HALF;

    public static final BlockStateEnum<EnumDirection> d;

    public BlockTallPlant() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    private BlockTallPlant.EnumTallFlowerVariants a(IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public boolean a(IBlockAccess iblockaccess, BlockPosition blockposition) {
        return false;
    }

    protected void e(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean f(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public void a(World world, BlockPosition blockposition, BlockTallPlant.EnumTallFlowerVariants blocktallplant_enumtallflowervariants, int i) {
    }

    public void postPlace(World world, BlockPosition blockposition, IBlockData iblockdata, EntityLiving entityliving, ItemStack itemstack) {
    }

    public void a(World world, EntityHuman entityhuman, BlockPosition blockposition, IBlockData iblockdata, @Nullable TileEntity tileentity, @Nullable ItemStack itemstack) {
    }

    public void a(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
    }

    private boolean b(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman) {
        return false;
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
    }

    public boolean a(World world, BlockPosition blockposition, IBlockData iblockdata, boolean flag) {
        return false;
    }

    public boolean a(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    public void b(World world, Random random, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public IBlockData updateState(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public static enum EnumTallPlantHalf implements INamable {

        UPPER, LOWER;

        private EnumTallPlantHalf() {
        }

        public String toString() {
            return null;
        }

        public String getName() {
            return null;
        }
    }

    public static enum EnumTallFlowerVariants implements INamable {

        SUNFLOWER(0, "sunflower"), SYRINGA(1, "syringa"), GRASS(2, "double_grass", "grass"), FERN(3, "double_fern", "fern"), ROSE(4, "double_rose", "rose"), PAEONIA(5, "paeonia");

        private static final BlockTallPlant.EnumTallFlowerVariants[] g;

        private final int h;

        private final String i;

        private final String j;

        private EnumTallFlowerVariants(int i, String s) {
        }

        private EnumTallFlowerVariants(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockTallPlant.EnumTallFlowerVariants a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String c() {
            return null;
        }

        static {
        }
    }
}
