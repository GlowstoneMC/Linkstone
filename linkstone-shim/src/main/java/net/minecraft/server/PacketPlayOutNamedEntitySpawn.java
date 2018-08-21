package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.entity.meta.MetadataMap;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.net.message.play.entity.SpawnPlayerMessage;
import net.glowstone.util.Position;

import java.util.List;
import java.util.UUID;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutNamedEntitySpawn implements Packet<PacketListenerPlayOut> {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private int entityId;

    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private UUID uuid;

    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private double x;

    @LGenerate
    @LField(version = V1_12_R1, name = "d")
    private double y;

    @LGenerate
    @LField(version = V1_12_R1, name = "e")
    private double z;

    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    private byte yaw;

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private byte pitch;

    // TODO replace this field against "DataWatcher"
    private List<MetadataMap.Entry> metadata;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutNamedEntitySpawn() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutNamedEntitySpawn(EntityHuman human) {
        this.entityId = human.glow.getEntityId();
        this.uuid = human.glow.getUniqueId();
        this.x = human.glow.getLocation().getX();
        this.y = human.glow.getLocation().getY();
        this.z = human.glow.getLocation().getZ();
        this.yaw = (byte) Position.getIntYaw(human.glow.getLocation());
        this.pitch = (byte) Position.getIntPitch(human.glow.getLocation());
        this.metadata = human.glow.getMetadata().getEntryList();
    }

    @Override
    public Message toGlowMessage() {
        return new SpawnPlayerMessage(entityId, uuid, x, y, z, yaw, pitch, metadata);
    }
}
