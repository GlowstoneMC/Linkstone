package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class WorldGenBigTree extends WorldGenTreeAbstract {

    private Random k;

    private World l;

    private BlockPosition m;

    int a;

    int b;

    double c;

    double d;

    double e;

    double f;

    int g;

    int h;

    int i;

    List<WorldGenBigTree.Position> j;

    public WorldGenBigTree(boolean flag) {
    }

    void a() {
    }

    void a(BlockPosition blockposition, float f, IBlockData iblockdata) {
    }

    float a(int i) {
        return 0.0F;
    }

    float b(int i) {
        return 0.0F;
    }

    void a(BlockPosition blockposition) {
    }

    void a(BlockPosition blockposition, BlockPosition blockposition1, Block block) {
    }

    private int b(BlockPosition blockposition) {
        return 0;
    }

    private BlockLogAbstract.EnumLogRotation b(BlockPosition blockposition, BlockPosition blockposition1) {
        return null;
    }

    void b() {
    }

    boolean c(int i) {
        return false;
    }

    void c() {
    }

    void d() {
    }

    int a(BlockPosition blockposition, BlockPosition blockposition1) {
        return 0;
    }

    public void e() {
    }

    public boolean generate(World world, Random random, BlockPosition blockposition) {
        return false;
    }

    private boolean f() {
        return false;
    }

    static class Position extends BlockPosition {

        private final int b;

        public Position(BlockPosition blockposition, int i) {
        }

        public int s() {
            return 0;
        }
    }
}
