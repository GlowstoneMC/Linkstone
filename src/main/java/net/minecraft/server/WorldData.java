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

    private String b;

    private int c;

    private boolean d;

    public static final EnumDifficulty a;

    private long e;

    private WorldType f;

    private String g;

    private int h;

    private int i;

    private int j;

    private long k;

    private long l;

    private long m;

    private long n;

    private NBTTagCompound o;

    private int p;

    private String levelName;

    private int r;

    private int s;

    private boolean t;

    private int u;

    private boolean v;

    private int w;

    private EnumGamemode x;

    private boolean y;

    private boolean z;

    private boolean A;

    private boolean B;

    private EnumDifficulty C;

    private boolean D;

    private double E;

    private double F;

    private double G;

    private long H;

    private double I;

    private double J;

    private double K;

    private int L;

    private int M;

    private final Map<DimensionManager, NBTTagCompound> N;

    private GameRules O;

    public WorldServer world;

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
