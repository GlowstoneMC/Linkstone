package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class MobSpawnerAbstract {

    public int spawnDelay;

    private final List<MobSpawnerData> mobs;

    private MobSpawnerData spawnData;

    private double d;

    private double e;

    private int minSpawnDelay;

    private int maxSpawnDelay;

    private int spawnCount;

    private Entity i;

    private int maxNearbyEntities;

    private int requiredPlayerRange;

    private int spawnRange;

    public MobSpawnerAbstract() {
    }

    public String getMobName() {
        return null;
    }

    public void setMobName(String s) {
    }

    private boolean h() {
        return false;
    }

    public void c() {
    }

    private void i() {
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound b(NBTTagCompound nbttagcompound) {
        return null;
    }

    public boolean b(int i) {
        return false;
    }

    public void a(MobSpawnerData mobspawnerdata) {
    }

    public abstract void a(int i);

    public abstract World a();

    public abstract BlockPosition b();
}
