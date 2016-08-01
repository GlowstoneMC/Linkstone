package net.minecraft.server;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlockAnvil extends BlockFalling {

    public static final BlockStateDirection FACING;

    public static final BlockStateInteger DAMAGE;

    protected static final AxisAlignedBB c;

    protected static final AxisAlignedBB d;

    protected static final Logger e;

    protected BlockAnvil() {
    }

    public boolean c(IBlockData iblockdata) {
        return false;
    }

    public boolean b(IBlockData iblockdata) {
        return false;
    }

    public IBlockData getPlacedState(World world, BlockPosition blockposition, EnumDirection enumdirection, float f, float f1, float f2, int i, EntityLiving entityliving) {
        return null;
    }

    public boolean interact(World world, BlockPosition blockposition, IBlockData iblockdata, EntityHuman entityhuman, EnumHand enumhand, @Nullable ItemStack itemstack, EnumDirection enumdirection, float f, float f1, float f2) {
        return false;
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public AxisAlignedBB a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return null;
    }

    protected void a(EntityFallingBlock entityfallingblock) {
    }

    public void a_(World world, BlockPosition blockposition) {
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

    protected BlockStateList getStateList() {
        return null;
    }

    public static class TileEntityContainerAnvil implements ITileEntityContainer {

        private final World a;

        private final BlockPosition b;

        public TileEntityContainerAnvil(World world, BlockPosition blockposition) {
        }

        public String getName() {
            return null;
        }

        public boolean hasCustomName() {
            return false;
        }

        public IChatBaseComponent getScoreboardDisplayName() {
            return null;
        }

        public Container createContainer(PlayerInventory playerinventory, EntityHuman entityhuman) {
            return null;
        }

        public String getContainerName() {
            return null;
        }
    }
}
