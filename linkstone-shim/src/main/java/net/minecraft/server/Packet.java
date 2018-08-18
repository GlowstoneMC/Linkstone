package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface Packet<T extends PacketListener> {
    /**
     * Convert a Vanilla packet to a {@link Message} from glowstone.
     *
     * @return a Glowstone {@link Message} corresponding to this packet.
     */
    Message toGlowMessage();
}
