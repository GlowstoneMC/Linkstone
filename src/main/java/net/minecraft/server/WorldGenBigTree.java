package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class WorldGenBigTree extends WorldGenTreeAbstract {

    private Random k = null;

    private World l = null;

    private BlockPosition m = null;

    int a = 0;

    int b = 0;

    double c = 0.0;

    double d = 0.0;

    double e = 0.0;

    double f = 0.0;

    int g = 0;

    int h = 0;

    int i = 0;

    List<WorldGenBigTree.Position> j = null;

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

        private final int b = 0;

        public Position(BlockPosition blockposition, int i) {
        }

        public int s() {
            return 0;
        }
    }
}
