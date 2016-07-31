package net.minecraft.server;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import jline.console.ConsoleReader;
import joptsimple.OptionSet;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.Main;

// CraftBukkit end
public abstract class MinecraftServer implements Runnable, ICommandListener, IAsyncTaskHandler, IMojangStatistics {

    public static final Logger LOGGER;

    public static final File a;

    public Convertable convertable;

    private final MojangStatisticsGenerator m;

    public File universe;

    private final List<ITickable> o;

    public final ICommandHandler b;

    public final MethodProfiler methodProfiler;

    private final ServerConnection p;

    private final ServerPing q;

    private final Random r;

    private final DataConverterManager dataConverterManager;

    private String serverIp;

    private int u;

    public WorldServer[] worldServer;

    private PlayerList v;

    private boolean isRunning;

    private boolean isStopped;

    private int ticks;

    protected final Proxy e;

    public String f;

    public int g;

    private boolean onlineMode;

    private boolean spawnAnimals;

    private boolean spawnNPCs;

    private boolean pvpMode;

    private boolean allowFlight;

    private String motd;

    private int F;

    private int G;

    public final long[] h;

    public long[][] i;

    private KeyPair H;

    private String I;

    private String J;

    private boolean demoMode;

    private boolean M;

    private String N;

    private String O;

    private boolean P;

    private long Q;

    private String R;

    private boolean S;

    private boolean T;

    private final YggdrasilAuthenticationService U;

    private final MinecraftSessionService V;

    private final GameProfileRepository W;

    private final UserCache X;

    private long Y;

    protected final Queue<FutureTask<?>> j;

    private Thread serverThread;

    private long aa;

    // CraftBukkit start
    public List<WorldServer> worlds;

    public org.bukkit.craftbukkit.CraftServer server;

    public OptionSet options;

    public org.bukkit.command.ConsoleCommandSender console;

    public org.bukkit.command.RemoteConsoleCommandSender remoteConsole;

    public ConsoleReader reader;

    public static int currentTick;

    public final Thread primaryThread;

    public java.util.Queue<Runnable> processQueue;

    public int autosavePeriod;

    // CraftBukkit end
    public MinecraftServer(OptionSet options, Proxy proxy, DataConverterManager dataconvertermanager, YggdrasilAuthenticationService yggdrasilauthenticationservice, MinecraftSessionService minecraftsessionservice, GameProfileRepository gameprofilerepository, UserCache usercache) {
    }

    public abstract PropertyManager getPropertyManager();

    // CraftBukkit end
    protected CommandDispatcher i() {
        return null;
    }

    public abstract boolean init() throws IOException;

    protected void a(String s) {
    }

    protected synchronized void b(String s) {
    }

    public void a(String s, String s1, long i, WorldType worldtype, String s2) {
    }

    protected void l() {
    }

    protected void a(String s, IDataManager idatamanager) {
    }

    public abstract boolean getGenerateStructures();

    public abstract EnumGamemode getGamemode();

    public abstract EnumDifficulty getDifficulty();

    public abstract boolean isHardcore();

    public abstract int q();

    public abstract boolean r();

    public abstract boolean s();

    protected void a_(String s, int i) {
    }

    protected void t() {
    }

    protected void saveChunks(boolean flag) {
    }

    // CraftBukkit start
    private boolean hasStopped;

    private final Object stopLock;

    // CraftBukkit end
    public void stop() throws ExceptionWorldConflict {
    }

    public String getServerIp() {
        return null;
    }

    public void c(String s) {
    }

    public boolean isRunning() {
        return false;
    }

    public void safeShutdown() {
    }

    public void run() {
    }

    public void a(ServerPing serverping) {
    }

    public File A() {
        return null;
    }

    public void a(CrashReport crashreport) {
    }

    public void B() {
    }

    protected void C() throws ExceptionWorldConflict {
    }

    public void D() {
    }

    public boolean getAllowNether() {
        return false;
    }

    public void a(ITickable itickable) {
    }

    public static void main(final OptionSet options) {
    }

    public void F() {
    }

    public File d(String s) {
        return null;
    }

    public void info(String s) {
    }

    public void warning(String s) {
    }

    public WorldServer getWorldServer(int i) {
        return null;
    }

    public String getVersion() {
        return null;
    }

    public int H() {
        return 0;
    }

    public int I() {
        return 0;
    }

    public String[] getPlayers() {
        return null;
    }

    public GameProfile[] K() {
        return null;
    }

    public boolean isDebugging() {
        return false;
    }

    public void g(String s) {
    }

    public void h(String s) {
    }

    public String getServerModName() {
        return null;
    }

    public CrashReport b(CrashReport crashreport) {
        return null;
    }

    public List<String> tabCompleteCommand(ICommandListener icommandlistener, String s, @Nullable BlockPosition blockposition, boolean flag) {
        return null;
    }

    public boolean M() {
        return false;
    }

    public String getName() {
        return null;
    }

    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean a(int i, String s) {
        return false;
    }

    public ICommandHandler getCommandHandler() {
        return null;
    }

    public KeyPair O() {
        return null;
    }

    public int P() {
        return 0;
    }

    public void setPort(int i) {
    }

    public String Q() {
        return null;
    }

    public void i(String s) {
    }

    public boolean R() {
        return false;
    }

    public String S() {
        return null;
    }

    public void setWorld(String s) {
    }

    public void a(KeyPair keypair) {
    }

    public void a(EnumDifficulty enumdifficulty) {
    }

    public boolean getSpawnMonsters() {
        return false;
    }

    public boolean V() {
        return false;
    }

    public void b(boolean flag) {
    }

    public void c(boolean flag) {
    }

    public Convertable getConvertable() {
        return null;
    }

    public String getResourcePack() {
        return null;
    }

    public String getResourcePackHash() {
        return null;
    }

    public void setResourcePack(String s, String s1) {
    }

    public void a(MojangStatisticsGenerator mojangstatisticsgenerator) {
    }

    public void b(MojangStatisticsGenerator mojangstatisticsgenerator) {
    }

    public boolean getSnooperEnabled() {
        return false;
    }

    public abstract boolean aa();

    public boolean getOnlineMode() {
        return false;
    }

    public void setOnlineMode(boolean flag) {
    }

    public boolean getSpawnAnimals() {
        return false;
    }

    public void setSpawnAnimals(boolean flag) {
    }

    public boolean getSpawnNPCs() {
        return false;
    }

    public abstract boolean ae();

    public void setSpawnNPCs(boolean flag) {
    }

    public boolean getPVP() {
        return false;
    }

    public void setPVP(boolean flag) {
    }

    public boolean getAllowFlight() {
        return false;
    }

    public void setAllowFlight(boolean flag) {
    }

    public abstract boolean getEnableCommandBlock();

    public String getMotd() {
        return null;
    }

    public void setMotd(String s) {
    }

    public int getMaxBuildHeight() {
        return 0;
    }

    public void c(int i) {
    }

    public boolean isStopped() {
        return false;
    }

    public PlayerList getPlayerList() {
        return null;
    }

    public void a(PlayerList playerlist) {
    }

    public void setGamemode(EnumGamemode enumgamemode) {
    }

    public ServerConnection am() {
        return null;
    }

    public boolean ao() {
        return false;
    }

    public abstract String a(EnumGamemode enumgamemode, boolean flag);

    public int ap() {
        return 0;
    }

    public void aq() {
    }

    public BlockPosition getChunkCoordinates() {
        return null;
    }

    public Vec3D d() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public Entity f() {
        return null;
    }

    public int getSpawnProtection() {
        return 0;
    }

    public boolean a(World world, BlockPosition blockposition, EntityHuman entityhuman) {
        return false;
    }

    public void setForceGamemode(boolean flag) {
    }

    public boolean getForceGamemode() {
        return false;
    }

    public Proxy au() {
        return null;
    }

    public static long av() {
        return 0;
    }

    public int getIdleTimeout() {
        return 0;
    }

    public void setIdleTimeout(int i) {
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    public boolean ax() {
        return false;
    }

    public MinecraftSessionService ay() {
        return null;
    }

    public GameProfileRepository getGameProfileRepository() {
        return null;
    }

    public UserCache getUserCache() {
        return null;
    }

    public ServerPing getServerPing() {
        return null;
    }

    public void aC() {
    }

    @Nullable
    public Entity a(UUID uuid) {
        return null;
    }

    public boolean getSendCommandFeedback() {
        return false;
    }

    public void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    public MinecraftServer h() {
        return null;
    }

    public int aD() {
        return 0;
    }

    public <V> ListenableFuture<V> a(Callable<V> callable) {
        return null;
    }

    public ListenableFuture<Object> postToMainThread(Runnable runnable) {
        return null;
    }

    public boolean isMainThread() {
        return false;
    }

    public int aF() {
        return 0;
    }

    public long aG() {
        return 0;
    }

    public Thread aH() {
        return null;
    }

    public DataConverterManager getDataConverterManager() {
        return null;
    }

    public int a(@Nullable WorldServer worldserver) {
        return 0;
    }

    // CraftBukkit start
    @Deprecated
    public static MinecraftServer getServer() {
        return null;
    }
    // CraftBukkit end
}
