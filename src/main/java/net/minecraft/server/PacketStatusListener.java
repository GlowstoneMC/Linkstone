package net.minecraft.server;

// CraftBukkit start
import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelFutureListener;
import java.net.InetSocketAddress;
import java.util.Iterator;
import org.bukkit.craftbukkit.util.CraftIconCache;
import org.bukkit.entity.Player;

// CraftBukkit end
public class PacketStatusListener implements PacketStatusInListener {

    private static final IChatBaseComponent a;

    private final MinecraftServer minecraftServer;

    private final NetworkManager networkManager;

    private boolean d;

    public PacketStatusListener(MinecraftServer minecraftserver, NetworkManager networkmanager) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    public void a(PacketStatusInStart packetstatusinstart) {
    }

    public void a(PacketStatusInPing packetstatusinping) {
    }
}
