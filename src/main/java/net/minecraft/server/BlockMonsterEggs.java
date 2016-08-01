package net.minecraft.server;

import java.util.Random;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

// CraftBukkit
public class BlockMonsterEggs extends Block {

    public static final BlockStateEnum<BlockMonsterEggs.EnumMonsterEggVarient> VARIANT = null;

    public BlockMonsterEggs() {
    }

    public int a(Random random) {
        return 0;
    }

    public static boolean i(IBlockData iblockdata) {
        return false;
    }

    protected ItemStack u(IBlockData iblockdata) {
        return null;
    }

    public void dropNaturally(World world, BlockPosition blockposition, IBlockData iblockdata, float f, int i) {
    }

    public ItemStack a(World world, BlockPosition blockposition, IBlockData iblockdata) {
        return null;
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

        static final int[] a = null;

        static {
        }
    }

    public static enum EnumMonsterEggVarient implements INamable {

        STONE(0, "stone") {

            ;

            public IBlockData d() {
                return Blocks.STONE.getBlockData().set(BlockStone.VARIANT, BlockStone.EnumStoneVariant.STONE);
            }
        }
        , COBBLESTONE(1, "cobblestone", "cobble") {

            ;

            public IBlockData d() {
                return Blocks.COBBLESTONE.getBlockData();
            }
        }
        , STONEBRICK(2, "stone_brick", "brick") {

            ;

            public IBlockData d() {
                return Blocks.STONEBRICK.getBlockData().set(BlockSmoothBrick.VARIANT, BlockSmoothBrick.EnumStonebrickType.DEFAULT);
            }
        }
        , MOSSY_STONEBRICK(3, "mossy_brick", "mossybrick") {

            ;

            public IBlockData d() {
                return Blocks.STONEBRICK.getBlockData().set(BlockSmoothBrick.VARIANT, BlockSmoothBrick.EnumStonebrickType.MOSSY);
            }
        }
        , CRACKED_STONEBRICK(4, "cracked_brick", "crackedbrick") {

            ;

            public IBlockData d() {
                return Blocks.STONEBRICK.getBlockData().set(BlockSmoothBrick.VARIANT, BlockSmoothBrick.EnumStonebrickType.CRACKED);
            }
        }
        , CHISELED_STONEBRICK(5, "chiseled_brick", "chiseledbrick") {

            ;

            public IBlockData d() {
                return Blocks.STONEBRICK.getBlockData().set(BlockSmoothBrick.VARIANT, BlockSmoothBrick.EnumStonebrickType.CHISELED);
            }
        }
        ;

        private static final BlockMonsterEggs.EnumMonsterEggVarient[] g = null;

        private final int h = 0;

        private final String i = null;

        private final String j = null;

        private EnumMonsterEggVarient(int i, String s) {
        }

        private EnumMonsterEggVarient(int i, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static BlockMonsterEggs.EnumMonsterEggVarient a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String c() {
            return null;
        }

        public abstract IBlockData d();

        public static BlockMonsterEggs.EnumMonsterEggVarient a(IBlockData iblockdata) {
            return null;
        }

        EnumMonsterEggVarient(int i, String s, BlockMonsterEggs.SyntheticClass_1 blockmonstereggs_syntheticclass_1) {
        }

        EnumMonsterEggVarient(int i, String s, String s1, BlockMonsterEggs.SyntheticClass_1 blockmonstereggs_syntheticclass_1) {
        }

        static {
        }
    }
}
