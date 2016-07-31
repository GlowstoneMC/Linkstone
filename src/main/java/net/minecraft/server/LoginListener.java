package net.minecraft.server;

import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// CraftBukkit start
import org.bukkit.craftbukkit.util.Waitable;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;

// CraftBukkit end
public class LoginListener implements PacketLoginInListener, ITickable {

    private static final AtomicInteger b;

    private static final Logger c;

    private static final Random random;

    private final byte[] e;

    private final MinecraftServer server;

    public final NetworkManager networkManager;

    private LoginListener.EnumProtocolState g;

    private int h;

    private GameProfile i;

    private final String j;

    private SecretKey loginKey;

    private EntityPlayer l;

    public String hostname;

    // CraftBukkit - add field
    public LoginListener(MinecraftServer minecraftserver, NetworkManager networkmanager) {
    }

    public void E_() {
    }

    public void disconnect(String s) {
    }

    public void b() {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    public String d() {
        return null;
    }

    public void a(PacketLoginInStart packetlogininstart) {
    }

    public void a(PacketLoginInEncryptionBegin packetlogininencryptionbegin) {
    }

    protected GameProfile a(GameProfile gameprofile) {
        return null;
    }

    static enum EnumProtocolState {

        HELLO, KEY, AUTHENTICATING, READY_TO_ACCEPT, DELAY_ACCEPT, ACCEPTED;

        private EnumProtocolState() {
        }
    }
}
