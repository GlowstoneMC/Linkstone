package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class BlockNote extends BlockTileEntity {

    private static final List<SoundEffect> a;

    public BlockNote() {
    }

    public void a(IBlockData iblockdata, World world, BlockPosition blockposition, Block block) {
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public void attack(World world, BlockPosition blockposition, EntityHuman entityhuman) {
    }

    public TileEntity a(World world, int i) {
        return null;
    }

    private SoundEffect e(int i) {
        return null;
    }

    public boolean a(IBlockData iblockdata, World world, BlockPosition blockposition, int i, int j) {
        return false;
    }

    public EnumRenderType a(IBlockData iblockdata) {
        return null;
    }
}
