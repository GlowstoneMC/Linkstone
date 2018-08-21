package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.net.message.play.game.UserListHeaderFooterMessage;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutPlayerListHeaderFooter implements Packet<PacketListenerPlayOut> {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private IChatBaseComponent header;

    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private IChatBaseComponent footer;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutPlayerListHeaderFooter() {}

    @Override
    public Message toGlowMessage() {
        return new UserListHeaderFooterMessage(
                IChatBaseComponent.toGlowMessage(header),
                IChatBaseComponent.toGlowMessage(footer));
    }
}
