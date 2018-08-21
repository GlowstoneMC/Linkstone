package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface PacketListenerPlayOut extends PacketListener {
    @LMethod(version = V1_12_R1, name = "a")
    void onPacketPlayOutTitle(PacketPlayOutTitle packet);

    @LMethod(version = V1_12_R1, name = "a")
    void onPacketPlayOutChat(PacketPlayOutChat packet);
}
