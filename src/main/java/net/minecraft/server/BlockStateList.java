package net.minecraft.server;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class BlockStateList {

    private static final Pattern a = null;

    private static final Function<IBlockState<?>, String> b = null;

    private final Block c = null;

    private final ImmutableSortedMap<String, IBlockState<?>> d = null;

    private final ImmutableList<IBlockData> e = null;

    public BlockStateList(Block block, IBlockState<?>... aiblockstate) {
    }

    public static <T extends Comparable<T>> String a(Block block, IBlockState<T> iblockstate) {
        return null;
    }

    public ImmutableList<IBlockData> a() {
        return null;
    }

    private List<Iterable<Comparable<?>>> e() {
        return null;
    }

    public IBlockData getBlockData() {
        return null;
    }

    public Block getBlock() {
        return null;
    }

    public Collection<IBlockState<?>> d() {
        return null;
    }

    public String toString() {
        return null;
    }

    @Nullable
    public IBlockState<?> a(String s) {
        return null;
    }

    static class BlockData extends BlockDataAbstract {

        private final Block a = null;

        private final ImmutableMap<IBlockState<?>, Comparable<?>> b = null;

        private ImmutableTable<IBlockState<?>, Comparable<?>, IBlockData> c = null;

        private BlockData(Block block, ImmutableMap<IBlockState<?>, Comparable<?>> immutablemap) {
        }

        public Collection<IBlockState<?>> r() {
            return null;
        }

        public <T extends Comparable<T>> T get(IBlockState<T> iblockstate) {
            return null;
        }

        public <T extends Comparable<T>, V extends T> IBlockData set(IBlockState<T> iblockstate, V v0) {
            return null;
        }

        public ImmutableMap<IBlockState<?>, Comparable<?>> s() {
            return null;
        }

        public Block getBlock() {
            return null;
        }

        public boolean equals(Object object) {
            return false;
        }

        public int hashCode() {
            return 0;
        }

        public void a(Map<Map<IBlockState<?>, Comparable<?>>, BlockStateList.BlockData> map) {
        }

        private Map<IBlockState<?>, Comparable<?>> b(IBlockState<?> iblockstate, Comparable<?> comparable) {
            return null;
        }

        public Material getMaterial() {
            return null;
        }

        public boolean b() {
            return false;
        }

        public boolean a(Entity entity) {
            return false;
        }

        public int c() {
            return 0;
        }

        public int d() {
            return 0;
        }

        public boolean f() {
            return false;
        }

        public MaterialMapColor g() {
            return null;
        }

        public IBlockData a(EnumBlockRotation enumblockrotation) {
            return null;
        }

        public IBlockData a(EnumBlockMirror enumblockmirror) {
            return null;
        }

        public boolean h() {
            return false;
        }

        public EnumRenderType i() {
            return null;
        }

        public boolean k() {
            return false;
        }

        public boolean l() {
            return false;
        }

        public boolean m() {
            return false;
        }

        public int a(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
            return 0;
        }

        public boolean n() {
            return false;
        }

        public int a(World world, BlockPosition blockposition) {
            return 0;
        }

        public float b(World world, BlockPosition blockposition) {
            return 0.0F;
        }

        public float a(EntityHuman entityhuman, World world, BlockPosition blockposition) {
            return 0.0F;
        }

        public int b(IBlockAccess iblockaccess, BlockPosition blockposition, EnumDirection enumdirection) {
            return 0;
        }

        public EnumPistonReaction o() {
            return null;
        }

        public IBlockData b(IBlockAccess iblockaccess, BlockPosition blockposition) {
            return null;
        }

        public boolean p() {
            return false;
        }

        @Nullable
        public AxisAlignedBB d(World world, BlockPosition blockposition) {
            return null;
        }

        public void a(World world, BlockPosition blockposition, AxisAlignedBB axisalignedbb, List<AxisAlignedBB> list, @Nullable Entity entity) {
        }

        public AxisAlignedBB c(IBlockAccess iblockaccess, BlockPosition blockposition) {
            return null;
        }

        public MovingObjectPosition a(World world, BlockPosition blockposition, Vec3D vec3d, Vec3D vec3d1) {
            return null;
        }

        public boolean q() {
            return false;
        }

        public boolean a(World world, BlockPosition blockposition, int i, int j) {
            return false;
        }

        public void doPhysics(World world, BlockPosition blockposition, Block block) {
        }

        BlockData(Block block, ImmutableMap immutablemap, Object object) {
        }
    }
}
