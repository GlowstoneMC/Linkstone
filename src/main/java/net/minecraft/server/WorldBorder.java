package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class WorldBorder {

    private final List<IWorldBorderListener> a = null;

    private double b = 0.0;

    private double c = 0.0;

    private double d = 0.0;

    private double e = 0.0;

    private long f = 0;

    private long g = 0;

    private int h = 0;

    private double i = 0.0;

    private double j = 0.0;

    private int k = 0;

    private int l = 0;

    public WorldServer world = null;

    // CraftBukkit
    public WorldBorder() {
    }

    public boolean a(BlockPosition blockposition) {
        return false;
    }

    // CraftBukkit start - split method
    public boolean isInBounds(ChunkCoordIntPair chunkcoordintpair) {
        return false;
    }

    // Inlined the getters from ChunkCoordIntPair
    public boolean isInBounds(long chunkcoords) {
        return false;
    }

    // Inlined the getters from ChunkCoordIntPair
    public boolean isInBounds(int x, int z) {
        return false;
    }

    public boolean a(AxisAlignedBB axisalignedbb) {
        return false;
    }

    public double a(Entity entity) {
        return 0.0;
    }

    public double b(double d0, double d1) {
        return 0.0;
    }

    public EnumWorldBorderState getState() {
        return null;
    }

    public double b() {
        return 0.0;
    }

    public double c() {
        return 0.0;
    }

    public double d() {
        return 0.0;
    }

    public double e() {
        return 0.0;
    }

    public double getCenterX() {
        return 0.0;
    }

    public double getCenterZ() {
        return 0.0;
    }

    public void setCenter(double d0, double d1) {
    }

    public double getSize() {
        return 0.0;
    }

    public long i() {
        return 0;
    }

    public double j() {
        return 0.0;
    }

    public void setSize(double d0) {
    }

    public void transitionSizeBetween(double d0, double d1, long i) {
    }

    protected List<IWorldBorderListener> k() {
        return null;
    }

    public void a(IWorldBorderListener iworldborderlistener) {
    }

    public void a(int i) {
    }

    public int l() {
        return 0;
    }

    public double getDamageBuffer() {
        return 0.0;
    }

    public void setDamageBuffer(double d0) {
    }

    public double getDamageAmount() {
        return 0.0;
    }

    public void setDamageAmount(double d0) {
    }

    public int getWarningTime() {
        return 0;
    }

    public void setWarningTime(int i) {
    }

    public int getWarningDistance() {
        return 0;
    }

    public void setWarningDistance(int i) {
    }
}
