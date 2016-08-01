package net.minecraft.server;

// CraftBukkit start
import java.net.InetAddress;
import java.util.HashMap;

// CraftBukkit end
public class HandshakeListener implements PacketHandshakingInListener {

    // CraftBukkit start - add fields
    private static final HashMap<InetAddress, Long> throttleTracker = null;

    private static int throttleCounter = 0;

    // CraftBukkit end
    private final MinecraftServer a = null;

    private final NetworkManager b = null;

    public HandshakeListener(MinecraftServer minecraftserver, NetworkManager networkmanager) {
    }

    public void a(PacketHandshakingInSetProtocol packethandshakinginsetprotocol) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }
}
