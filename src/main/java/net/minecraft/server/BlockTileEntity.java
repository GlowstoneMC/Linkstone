package net.minecraft.server;

public abstract class BlockTileEntity extends Block implements ITileEntity {

    protected BlockTileEntity(Material material) {
    }

    protected BlockTileEntity(Material material, MaterialMapColor materialmapcolor) {
    }

    protected boolean a(World world, BlockPosition blockposition, EnumDirection enumdirection) {
        return false;
    }

    protected boolean b(World world, BlockPosition blockposition) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }

    public void remove(World world, BlockPosition blockposition, IBlockData iblockdata) {
    }

    public boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, int i, int j) {
        return false;
    }
}
