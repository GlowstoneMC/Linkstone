package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.net.message.play.game.PluginMessage;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutCustomPayload implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private String channel;

    @LField(version = V1_12_R1, name = "b")
    private PacketDataSerializer data;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutCustomPayload() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutCustomPayload(String channel, PacketDataSerializer data) {
        this.channel = channel;
        this.data = data;
    }

    @Override
    public Message toGlowMessage() {
        return new PluginMessage(channel, data.toByteArray());
    }
}
