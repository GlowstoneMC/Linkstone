package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.Version;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = Version.V1_12_R1)
public enum ChatMessageType {
    @LEnum(version = V1_12_R1)
    CHAT,

    @LEnum(version = V1_12_R1)
    SYSTEM,

    @LEnum(version = V1_12_R1)
    GAME_INFO;

    /**
     * Get a {@link ChatMessageType} by its id or else return {@link ChatMessageType#CHAT}
     *
     * @param id to be looked up
     * @return ChatMessageType corresponding to id or {@link ChatMessageType#CHAT}
     */
    @LMethod(version = Version.V1_12_R1, name = "a")
    public static ChatMessageType fromId(byte id) {
        for (ChatMessageType type : values()) {
            if (type.getId() == id) {
                return type;
            }
        }
        return CHAT;
    }

    @LMethod(version = Version.V1_12_R1, name = "a")
    public byte getId() {
        return (byte) ordinal();
    }
}
