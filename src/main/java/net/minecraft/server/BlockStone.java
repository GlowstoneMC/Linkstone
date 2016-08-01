package net.minecraft.server;

import java.util.Random;
import javax.annotation.Nullable;

public class BlockStone extends Block {

    public static final BlockStateEnum<BlockStone.EnumStoneVariant> VARIANT = null;

    public BlockStone() {
    }

    public String getName() {
        return null;
    }

    public MaterialMapColor r(IBlockData iblockdata) {
        return null;
    }

    @Nullable
    public Item getDropType(IBlockData iblockdata, Random random, int i) {
        return null;
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

    public static enum EnumStoneVariant implements INamable {

        STONE(0, MaterialMapColor.m, "stone"), GRANITE(1, MaterialMapColor.l, "granite"), GRANITE_SMOOTH(2, MaterialMapColor.l, "smooth_granite", "graniteSmooth"), DIORITE(3, MaterialMapColor.p, "diorite"), DIORITE_SMOOTH(4, MaterialMapColor.p, "smooth_diorite", "dioriteSmooth"), ANDESITE(5, MaterialMapColor.m, "andesite"), ANDESITE_SMOOTH(6, MaterialMapColor.m, "smooth_andesite", "andesiteSmooth");

        private static final BlockStone.EnumStoneVariant[] h = null;

        private final int i = 0;

        private final String j = null;

        private final String k = null;

        private final MaterialMapColor l = null;

        private EnumStoneVariant(int i, MaterialMapColor materialmapcolor, String s) {
        }

        private EnumStoneVariant(int i, MaterialMapColor materialmapcolor, String s, String s1) {
        }

        public int a() {
            return 0;
        }

        public MaterialMapColor c() {
            return null;
        }

        public String toString() {
            return null;
        }

        public static BlockStone.EnumStoneVariant a(int i) {
            return null;
        }

        public String getName() {
            return null;
        }

        public String d() {
            return null;
        }

        static {
        }
    }
}
