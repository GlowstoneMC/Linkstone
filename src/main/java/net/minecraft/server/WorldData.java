package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.Bukkit;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

// CraftBukkit end
public class WorldData {

    private String b = null;

    private int c = 0;

    private boolean d = false;

    public static final EnumDifficulty a = null;

    private long e = 0;

    private WorldType f = null;

    private String g = null;

    private int h = 0;

    private int i = 0;

    private int j = 0;

    private long k = 0;

    private long l = 0;

    private long m = 0;

    private long n = 0;

    private NBTTagCompound o = null;

    private int p = 0;

    private String levelName = null;

    private int r = 0;

    private int s = 0;

    private boolean t = false;

    private int u = 0;

    private boolean v = false;

    private int w = 0;

    private EnumGamemode x = null;

    private boolean y = false;

    private boolean z = false;

    private boolean A = false;

    private boolean B = false;

    private EnumDifficulty C = null;

    private boolean D = false;

    private double E = 0.0;

    private double F = 0.0;

    private double G = 0.0;

    private long H = 0;

    private double I = 0.0;

    private double J = 0.0;

    private double K = 0.0;

    private int L = 0;

    private int M = 0;

    private final Map<DimensionManager, NBTTagCompound> N = null;

    private GameRules O = null;

    public WorldServer world = null;

    // CraftBukkit
    protected WorldData() {
    }

    public static void a(DataConverterManager dataconvertermanager) {
    }

    public WorldData(NBTTagCompound nbttagcompound) {
    }

    public WorldData(WorldSettings worldsettings, String s) {
    }

    public void a(WorldSettings worldsettings) {
    }

    public WorldData(WorldData worlddata) {
    }

    public NBTTagCompound a(@Nullable NBTTagCompound nbttagcompound) {
        return null;
    }

    private void a(NBTTagCompound nbttagcompound, NBTTagCompound nbttagcompound1) {
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

    public void setTime(long i) {
    }

    public void setDayTime(long i) {
    }

    public void setSpawn(BlockPosition blockposition) {
    }

    public String getName() {
        return null;
    }

    public void a(String s) {
    }

    public int k() {
        return 0;
    }

    public void e(int i) {
    }

    public int z() {
        return 0;
    }

    public void i(int i) {
    }

    public boolean isThundering() {
        return false;
    }

    public void setThundering(boolean flag) {
    }

    public int getThunderDuration() {
        return 0;
    }

    public void setThunderDuration(int i) {
    }

    public boolean hasStorm() {
        return false;
    }

    public void setStorm(boolean flag) {
    }

    public int getWeatherDuration() {
        return 0;
    }

    public void setWeatherDuration(int i) {
    }

    public EnumGamemode getGameType() {
        return null;
    }

    public boolean shouldGenerateMapFeatures() {
        return false;
    }

    public void f(boolean flag) {
    }

    public void setGameType(EnumGamemode enumgamemode) {
    }

    public boolean isHardcore() {
        return false;
    }

    public void g(boolean flag) {
    }

    public WorldType getType() {
        return null;
    }

    public void a(WorldType worldtype) {
    }

    public String getGeneratorOptions() {
        return null;
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

    public double B() {
        return 0.0;
    }

    public double C() {
        return 0.0;
    }

    public double D() {
        return 0.0;
    }

    public void a(double d0) {
    }

    public long E() {
        return 0;
    }

    public void e(long i) {
    }

    public double F() {
        return 0.0;
    }

    public void b(double d0) {
    }

    public void c(double d0) {
    }

    public void d(double d0) {
    }

    public double G() {
        return 0.0;
    }

    public void e(double d0) {
    }

    public double H() {
        return 0.0;
    }

    public void f(double d0) {
    }

    public int I() {
        return 0;
    }

    public int J() {
        return 0;
    }

    public void j(int i) {
    }

    public void k(int i) {
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

    public void a(CrashReportSystemDetails crashreportsystemdetails) {
    }

    public NBTTagCompound a(DimensionManager dimensionmanager) {
        return null;
    }

    public void a(DimensionManager dimensionmanager, NBTTagCompound nbttagcompound) {
    }

    // CraftBukkit start - Check if the name stored in NBT is the correct one
    public void checkName(String name) {
    }
    // CraftBukkit end
}
