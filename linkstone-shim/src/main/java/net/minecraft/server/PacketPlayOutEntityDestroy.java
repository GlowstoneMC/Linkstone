package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.net.message.play.entity.DestroyEntitiesMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutEntityDestroy implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private int[] entityIds;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutEntityDestroy(int[] entityIds) {
        this.entityIds = entityIds;
    }

    @Override
    public Message toGlowMessage() {
        List<Integer> entityIdList = Arrays.stream(entityIds).boxed().collect(Collectors.toList());
        return new DestroyEntitiesMessage(entityIdList);
    }
}
