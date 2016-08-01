package net.minecraft.server;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import java.io.PrintStream;
import org.apache.logging.log4j.Level;
import org.bukkit.craftbukkit.LoggerOutputStream;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.craftbukkit.util.Waitable;
import org.bukkit.event.server.RemoteServerCommandEvent;

// CraftBukkit end
public class DedicatedServer extends MinecraftServer implements IMinecraftServer {

    private static final Logger LOGGER = null;

    private static final Pattern l = null;

    private final List<ServerCommand> serverCommandQueue = null;

    // CraftBukkit - fix decompile error
    private RemoteStatusListener n = null;

    public final RemoteControlCommandListener remoteControlCommandListener = null;

    private RemoteControlListener p = null;

    public PropertyManager propertyManager = null;

    private EULA r = null;

    private boolean generateStructures = false;

    private EnumGamemode t = null;

    private boolean u = false;

    // CraftBukkit start - Signature changed
    public DedicatedServer(joptsimple.OptionSet options, DataConverterManager dataconvertermanager, YggdrasilAuthenticationService yggdrasilauthenticationservice, MinecraftSessionService minecraftsessionservice, GameProfileRepository gameprofilerepository, UserCache usercache) {
    }

    public boolean init() throws IOException {
        return false;
    }

    public String aK() {
        return null;
    }

    public void setGamemode(EnumGamemode enumgamemode) {
    }

    public boolean getGenerateStructures() {
        return false;
    }

    public EnumGamemode getGamemode() {
        return null;
    }

    public EnumDifficulty getDifficulty() {
        return null;
    }

    public boolean isHardcore() {
        return false;
    }

    public void a(CrashReport crashreport) {
    }

    public CrashReport b(CrashReport crashreport) {
        return null;
    }

    public void B() {
    }

    public void D() {
    }

    public boolean getAllowNether() {
        return false;
    }

    public boolean getSpawnMonsters() {
        return false;
    }

    public void a(MojangStatisticsGenerator mojangstatisticsgenerator) {
    }

    public boolean getSnooperEnabled() {
        return false;
    }

    public void issueCommand(String s, ICommandListener icommandlistener) {
    }

    public void aL() {
    }

    public boolean aa() {
        return false;
    }

    public boolean ae() {
        return false;
    }

    public DedicatedPlayerList aM() {
        return null;
    }

    public int a(String s, int i) {
        return 0;
    }

    public String a(String s, String s1) {
        return null;
    }

    public boolean a(String s, boolean flag) {
        return false;
    }

    public void a(String s, Object object) {
    }

    public void a() {
    }

    public String b() {
        return null;
    }

    public String d_() {
        return null;
    }

    public int e_() {
        return 0;
    }

    public String f_() {
        return null;
    }

    public void aN() {
    }

    public boolean ao() {
        return false;
    }

    public String a(EnumGamemode enumgamemode, boolean flag) {
        return null;
    }

    public boolean getEnableCommandBlock() {
        return false;
    }

    public int getSpawnProtection() {
        return 0;
    }

    public boolean a(World world, BlockPosition blockposition, EntityHuman entityhuman) {
        return false;
    }

    public int q() {
        return 0;
    }

    public void setIdleTimeout(int i) {
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean ax() {
        return false;
    }

    public int aD() {
        return 0;
    }

    public int aF() {
        return 0;
    }

    protected boolean aO() {
        return false;
    }

    private void aR() {
    }

    public long aP() {
        return 0;
    }

    public String getPlugins() {
        return null;
    }

    // CraftBukkit start - fire RemoteServerCommandEvent
    public String executeRemoteCommand(final String s) {
        return null;
    }

    public PlayerList getPlayerList() {
        return null;
    }

    // CraftBukkit start
    @Override
    public PropertyManager getPropertyManager() {
        return null;
    }
    // CraftBukkit end
}
