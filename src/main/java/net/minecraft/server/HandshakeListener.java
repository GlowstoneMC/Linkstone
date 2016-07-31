package net.minecraft.server;

// CraftBukkit start
import java.net.InetAddress;
import java.util.HashMap;

// CraftBukkit end
public class HandshakeListener implements PacketHandshakingInListener {

    // CraftBukkit start - add fields
    private static final HashMap<InetAddress, Long> throttleTracker;

    private static int throttleCounter;

    // CraftBukkit end
    private final MinecraftServer a;

    private final NetworkManager b;

    public HandshakeListener(MinecraftServer minecraftserver, NetworkManager networkmanager) {
    }

    public void a(PacketHandshakingInSetProtocol packethandshakinginsetprotocol) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }
}
