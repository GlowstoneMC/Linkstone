package net.minecraft.server;

import javax.annotation.Nullable;

public interface IBlockAccess {

    @Nullable
    public TileEntity getTileEntity(BlockPosition var1);

    public IBlockData getType(BlockPosition var1);

    public boolean isEmpty(BlockPosition var1);

    public int getBlockPower(BlockPosition var1, EnumDirection var2);

}