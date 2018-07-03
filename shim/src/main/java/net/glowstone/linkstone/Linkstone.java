package net.glowstone.linkstone;

import com.flowpowered.network.Message;
import net.glowstone.net.message.play.game.PingMessage;
import net.minecraft.server.Packet;

public class Linkstone {
    public Linkstone() {
        // TODO: ASM class trickery
    }

    public static Message packetToMessage(Packet message) {
        String className = message.getClass().getName();
        return new PingMessage(0);
    }
}
