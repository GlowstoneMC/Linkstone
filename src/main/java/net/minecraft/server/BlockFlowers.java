package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;

public abstract class BlockFlowers extends BlockPlant {

    protected BlockStateEnum<BlockFlowers.EnumFlowerVarient> TYPE = null;

    protected BlockFlowers() {
    }

    public int getDropData(IBlockData iblockdata) {
        return 0;
    }

    public IBlockData fromLegacyData(int i) {
        return null;
    }

    public abstract BlockFlowers.EnumFlowerType e();

    public IBlockState<BlockFlowers.EnumFlowerVarient> g() {
        return null;
    }

    public int toLegacyData(IBlockData iblockdata) {
        return 0;
    }

    protected BlockStateList getStateList() {
        return null;
    }

    public static enum EnumFlowerVarient implements INamable {

        DANDELION(BlockFlowers.EnumFlowerType.YELLOW, 0, "dandelion"), POPPY(BlockFlowers.EnumFlowerType.RED, 0, "poppy"), BLUE_ORCHID(BlockFlowers.EnumFlowerType.RED, 1, "blue_orchid", "blueOrchid"), ALLIUM(BlockFlowers.EnumFlowerType.RED, 2, "allium"), HOUSTONIA(BlockFlowers.EnumFlowerType.RED, 3, "houstonia"), RED_TULIP(BlockFlowers.EnumFlowerType.RED, 4, "red_tulip", "tulipRed"), ORANGE_TULIP(BlockFlowers.EnumFlowerType.RED, 5, "orange_tulip", "tulipOrange"), WHITE_TULIP(BlockFlowers.EnumFlowerType.RED, 6, "white_tulip", "tulipWhite"), PINK_TULIP(BlockFlowers.EnumFlowerType.RED, 7, "pink_tulip", "tulipPink"), OXEYE_DAISY(BlockFlowers.EnumFlowerType.RED, 8, "oxeye_daisy", "oxeyeDaisy");

        private static final BlockFlowers.EnumFlowerVarient[][] k = null;

        private final BlockFlowers.EnumFlowerType l = null;

        private final int m = 0;

        private final String n = null;

        private final String o = null;

        private EnumFlowerVarient(BlockFlowers.EnumFlowerType blockflowers_enumflowertype, int i, String s) {
        }

        private EnumFlowerVarient(BlockFlowers.EnumFlowerType blockflowers_enumflowertype, int i, String s, String s1) {
        }

        public BlockFlowers.EnumFlowerType a() {
            return null;
        }

        public int b() {
            return 0;
        }

        public static BlockFlowers.EnumFlowerVarient a(BlockFlowers.EnumFlowerType blockflowers_enumflowertype, int i) {
            return null;
        }

        public String toString() {
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

    public static enum EnumFlowerType {

        YELLOW, RED;

        private EnumFlowerType() {
        }

        public BlockFlowers a() {
            return null;
        }
    }
}
