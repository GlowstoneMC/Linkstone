package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.Version;

@LClassfile(version = Version.V1_12_R1)
public enum ChatMessageType {
    CHAT, SYSTEM, GAME_INFO;

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
