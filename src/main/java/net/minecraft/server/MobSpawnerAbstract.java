package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class MobSpawnerAbstract {

    public int spawnDelay = 0;

    private final List<MobSpawnerData> mobs = null;

    private MobSpawnerData spawnData = null;

    private double d = 0.0;

    private double e = 0.0;

    private int minSpawnDelay = 0;

    private int maxSpawnDelay = 0;

    private int spawnCount = 0;

    private Entity i = null;

    private int maxNearbyEntities = 0;

    private int requiredPlayerRange = 0;

    private int spawnRange = 0;

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
