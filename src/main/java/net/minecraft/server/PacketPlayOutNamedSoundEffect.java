package net.minecraft.server;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class PacketPlayOutNamedSoundEffect implements Packet<PacketListenerPlayOut> {

    private SoundEffect a = null;

    private SoundCategory b = null;

    private int c = 0;

    private int d = 0;

    private int e = 0;

    private float f = 0.0F;

    private float g = 0.0F;

    public PacketPlayOutNamedSoundEffect() {
    }

    public PacketPlayOutNamedSoundEffect(SoundEffect soundeffect, SoundCategory soundcategory, double d0, double d1, double d2, float f, float f1) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}
