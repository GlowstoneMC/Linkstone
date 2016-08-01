package net.minecraft.server;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.Iterator;
import javax.annotation.Nullable;

public class ShapeDetector {

    private final Predicate<ShapeDetectorBlock>[][][] a = null;

    private final int b = 0;

    private final int c = 0;

    private final int d = 0;

    public ShapeDetector(Predicate<ShapeDetectorBlock>[][][] apredicate) {
    }

    public int a() {
        return 0;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    @Nullable
    private ShapeDetector.ShapeDetectorCollection a(BlockPosition blockposition, EnumDirection enumdirection, EnumDirection enumdirection1, LoadingCache<BlockPosition, ShapeDetectorBlock> loadingcache) {
        return null;
    }

    @Nullable
    public ShapeDetector.ShapeDetectorCollection a(World world, BlockPosition blockposition) {
        return null;
    }

    public static LoadingCache<BlockPosition, ShapeDetectorBlock> a(World world, boolean flag) {
        return null;
    }

    protected static BlockPosition a(BlockPosition blockposition, EnumDirection enumdirection, EnumDirection enumdirection1, int i, int j, int k) {
        return null;
    }

    public static class ShapeDetectorCollection {

        private final BlockPosition a = null;

        private final EnumDirection b = null;

        private final EnumDirection c = null;

        private final LoadingCache<BlockPosition, ShapeDetectorBlock> d = null;

        private final int e = 0;

        private final int f = 0;

        private final int g = 0;

        public ShapeDetectorCollection(BlockPosition blockposition, EnumDirection enumdirection, EnumDirection enumdirection1, LoadingCache<BlockPosition, ShapeDetectorBlock> loadingcache, int i, int j, int k) {
        }

        public BlockPosition a() {
            return null;
        }

        public EnumDirection getFacing() {
            return null;
        }

        public EnumDirection c() {
            return null;
        }

        public int d() {
            return 0;
        }

        public int e() {
            return 0;
        }

        public ShapeDetectorBlock a(int i, int j, int k) {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    static class BlockLoader extends CacheLoader<BlockPosition, ShapeDetectorBlock> {

        private final World a = null;

        private final boolean b = false;

        public BlockLoader(World world, boolean flag) {
        }

        public ShapeDetectorBlock a(BlockPosition blockposition) throws Exception {
            return null;
        }

        public Object load(Object object) throws Exception {
            return null;
        }
    }
}
