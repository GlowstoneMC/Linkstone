package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import javax.annotation.Nullable;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IBlockAccess {

    @Nullable
    public TileEntity getTileEntity(BlockPosition var1);

    public IBlockData getType(BlockPosition var1);

    public boolean isEmpty(BlockPosition var1);

    public int getBlockPower(BlockPosition var1, EnumDirection var2);

}