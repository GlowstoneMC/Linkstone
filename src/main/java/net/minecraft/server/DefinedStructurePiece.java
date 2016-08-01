package net.minecraft.server;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class DefinedStructurePiece extends StructurePiece {

    private static final DefinedStructureInfo d;

    protected DefinedStructure a;

    protected DefinedStructureInfo b;

    protected BlockPosition c;

    public DefinedStructurePiece() {
    }

    public DefinedStructurePiece(int i) {
    }

    protected void a(DefinedStructure definedstructure, BlockPosition blockposition, DefinedStructureInfo definedstructureinfo) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        return false;
    }

    protected abstract void a(String s, BlockPosition blockposition, World world, Random random, StructureBoundingBox structureboundingbox);

    private void b() {
    }

    public void a(int i, int j, int k) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
