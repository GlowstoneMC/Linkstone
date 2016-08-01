package net.minecraft.server;

import javax.annotation.Nullable;

public class SecondaryWorldData extends WorldData {

    private final WorldData b;

    public SecondaryWorldData(WorldData worlddata) {
    }

    public NBTTagCompound a(@Nullable NBTTagCompound nbttagcompound) {
        return null;
    }

    public long getSeed() {
        return 0;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public long getTime() {
        return 0;
    }

    public long getDayTime() {
        return 0;
    }

    public NBTTagCompound h() {
        return null;
    }

    public String getName() {
        return null;
    }

    public int k() {
        return 0;
    }

    public boolean isThundering() {
        return false;
    }

    public int getThunderDuration() {
        return 0;
    }

    public boolean hasStorm() {
        return false;
    }

    public int getWeatherDuration() {
        return 0;
    }

    public EnumGamemode getGameType() {
        return null;
    }

    public void setTime(long i) {
    }

    public void setDayTime(long i) {
    }

    public void setSpawn(BlockPosition blockposition) {
    }

    public void a(String s) {
    }

    public void e(int i) {
    }

    public void setThundering(boolean flag) {
    }

    public void setThunderDuration(int i) {
    }

    public void setStorm(boolean flag) {
    }

    public void setWeatherDuration(int i) {
    }

    public boolean shouldGenerateMapFeatures() {
        return false;
    }

    public boolean isHardcore() {
        return false;
    }

    public WorldType getType() {
        return null;
    }

    public void a(WorldType worldtype) {
    }

    public boolean u() {
        return false;
    }

    public void c(boolean flag) {
    }

    public boolean v() {
        return false;
    }

    public void d(boolean flag) {
    }

    public GameRules w() {
        return null;
    }

    public EnumDifficulty getDifficulty() {
        return null;
    }

    public void setDifficulty(EnumDifficulty enumdifficulty) {
    }

    public boolean isDifficultyLocked() {
        return false;
    }

    public void e(boolean flag) {
    }

    public void a(DimensionManager dimensionmanager, NBTTagCompound nbttagcompound) {
    }

    public NBTTagCompound a(DimensionManager dimensionmanager) {
        return null;
    }
}
