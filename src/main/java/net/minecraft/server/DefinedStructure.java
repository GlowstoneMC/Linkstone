package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class DefinedStructure {

    private final List<DefinedStructure.BlockInfo> a;

    private final List<DefinedStructure.EntityInfo> b;

    private BlockPosition c;

    private String d;

    public DefinedStructure() {
    }

    public BlockPosition a() {
        return null;
    }

    public void a(String s) {
    }

    public String b() {
        return null;
    }

    public void a(World world, BlockPosition blockposition, BlockPosition blockposition1, boolean flag, @Nullable Block block) {
    }

    private void a(World world, BlockPosition blockposition, BlockPosition blockposition1) {
    }

    public Map<BlockPosition, String> a(BlockPosition blockposition, DefinedStructureInfo definedstructureinfo) {
        return null;
    }

    public BlockPosition a(DefinedStructureInfo definedstructureinfo, BlockPosition blockposition, DefinedStructureInfo definedstructureinfo1, BlockPosition blockposition1) {
        return null;
    }

    public static BlockPosition a(DefinedStructureInfo definedstructureinfo, BlockPosition blockposition) {
        return null;
    }

    public void a(World world, BlockPosition blockposition, DefinedStructureInfo definedstructureinfo) {
    }

    public void b(World world, BlockPosition blockposition, DefinedStructureInfo definedstructureinfo) {
    }

    public void a(World world, BlockPosition blockposition, DefinedStructureInfo definedstructureinfo, int i) {
    }

    public void a(World world, BlockPosition blockposition, @Nullable DefinedStructureProcessor definedstructureprocessor, DefinedStructureInfo definedstructureinfo, int i) {
    }

    private void a(World world, BlockPosition blockposition, EnumBlockMirror enumblockmirror, EnumBlockRotation enumblockrotation, @Nullable StructureBoundingBox structureboundingbox) {
    }

    public BlockPosition a(EnumBlockRotation enumblockrotation) {
        return null;
    }

    private static BlockPosition b(BlockPosition blockposition, EnumBlockMirror enumblockmirror, EnumBlockRotation enumblockrotation) {
        return null;
    }

    private static Vec3D a(Vec3D vec3d, EnumBlockMirror enumblockmirror, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public BlockPosition a(BlockPosition blockposition, EnumBlockMirror enumblockmirror, EnumBlockRotation enumblockrotation) {
        return null;
    }

    public NBTTagCompound a(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void b(NBTTagCompound nbttagcompound) {
    }

    private NBTTagList a(int... aint) {
        return null;
    }

    private NBTTagList a(double... adouble) {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static final int[] b;

        static {
        }
    }

    public static class EntityInfo {

        public final Vec3D a;

        public final BlockPosition b;

        public final NBTTagCompound c;

        public EntityInfo(Vec3D vec3d, BlockPosition blockposition, NBTTagCompound nbttagcompound) {
        }
    }

    public static class BlockInfo {

        public final BlockPosition a;

        public final IBlockData b;

        public final NBTTagCompound c;

        public BlockInfo(BlockPosition blockposition, IBlockData iblockdata, @Nullable NBTTagCompound nbttagcompound) {
        }
    }

    static class a implements Iterable<IBlockData> {

        public static final IBlockData a;

        final RegistryBlockID<IBlockData> b;

        private int c;

        private a() {
        }

        public int a(IBlockData iblockdata) {
            return 0;
        }

        @Nullable
        public IBlockData a(int i) {
            return null;
        }

        public Iterator<IBlockData> iterator() {
            return null;
        }

        public void a(IBlockData iblockdata, int i) {
        }

        a(Object object) {
        }
    }
}
