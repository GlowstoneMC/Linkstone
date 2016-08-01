package net.minecraft.server;

public class BlockCarpet extends Block {

    public static final BlockStateEnum<EnumColor> COLOR = null;

    protected static final AxisAlignedBB b = null;

    protected BlockCarpet() {
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean canPlace(World world, BlockPosition blockposition) {
        return false;
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    private boolean e(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return false;
    }

    private boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public int getDropData(IBlockData iblockdata) {
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
}
