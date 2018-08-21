package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.net.message.play.inv.OpenWindowMessage;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutOpenWindow implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private int windowId;

    @LField(version = V1_12_R1, name = "b")
    private String type;

    @LField(version = V1_12_R1, name = "c")
    private IChatBaseComponent title;

    @LField(version = V1_12_R1, name = "d")
    private int slots;

    /**
     * Optional entity id send when opening an HorseInventory
     */
    @LField(version = V1_12_R1, name = "e")
    private int entityId;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutOpenWindow() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutOpenWindow(int windowId, String type, IChatBaseComponent title, int slots) {
        this.windowId = windowId;
        this.type = type;
        this.title = title;
        this.slots = slots;
    }

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutOpenWindow(int windowId, String type, IChatBaseComponent title, int slots, int entityId) {
        this.windowId = windowId;
        this.type = type;
        this.title = title;
        this.slots = slots;
        this.entityId = entityId;
    }

    @Override
    public Message toGlowMessage() {
        return new OpenWindowMessage(windowId, type, IChatBaseComponent.toGlowMessage(title), slots, entityId);
    }
}
