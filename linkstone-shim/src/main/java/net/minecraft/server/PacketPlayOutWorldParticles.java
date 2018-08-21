package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.net.message.play.game.PlayParticleMessage;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutWorldParticles implements Packet<PacketListenerPlayOut> {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private EnumParticle particle;

    @LGenerate
    @LField(version = V1_12_R1, name = "j")
    private boolean longDistance;

    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private float x;

    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private float y;

    @LGenerate
    @LField(version = V1_12_R1, name = "d")
    private float z;

    @LGenerate
    @LField(version = V1_12_R1, name = "e")
    private float offsetX;

    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    private float offsetY;

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private float offsetZ;

    @LGenerate
    @LField(version = V1_12_R1, name = "h")
    private float data;

    @LGenerate
    @LField(version = V1_12_R1, name = "i")
    private int count;

    @LGenerate
    @LField(version = V1_12_R1, name = "k")
    private int[] extData;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutWorldParticles() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutWorldParticles(EnumParticle particle, boolean longDistance,
                                       float x, float y, float z,
                                       float offsetX, float offsetY, float offsetZ,
                                       float data, int count, int[] extraData) {
        this.particle = particle;
        this.longDistance = longDistance;
        this.x = x;
        this.y = y;
        this.z = z;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
        this.data = data;
        this.count = count;
        this.extData = extraData;
    }

    @Override
    public Message toGlowMessage() {
        return new PlayParticleMessage(particle.getId(), longDistance, x, y, z, offsetX, offsetY, offsetZ, data, count, extData);
    }
}
