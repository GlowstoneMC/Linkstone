package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.net.message.play.entity.EntityTeleportMessage;
import net.glowstone.util.Position;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutEntityTeleport implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private int entityId;

    @LField(version = V1_12_R1, name = "b")
    private double x;

    @LField(version = V1_12_R1, name = "c")
    private double y;

    @LField(version = V1_12_R1, name = "d")
    private double z;

    @LField(version = V1_12_R1, name = "e")
    private byte yaw;

    @LField(version = V1_12_R1, name = "f")
    private byte pitch;

    @LField(version = V1_12_R1, name = "g")
    private boolean onGround;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutEntityTeleport() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutEntityTeleport(Entity entity) {
        this.entityId = entity.glow.getEntityId();
        this.x = entity.glow.getLocation().getX();
        this.y = entity.glow.getLocation().getY();
        this.z = entity.glow.getLocation().getZ();
        this.yaw = (byte) Position.getIntYaw(entity.glow.getLocation());
        this.pitch = (byte) Position.getIntPitch(entity.glow.getLocation());
        this.onGround = entity.glow.isOnGround();
    }

    @Override
    public Message toGlowMessage() {
        return new EntityTeleportMessage(entityId, x, y, z, yaw, pitch, onGround);
    }
}
