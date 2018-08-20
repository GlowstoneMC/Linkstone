package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LMethod;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.HoverEvent;

import java.util.List;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IChatBaseComponent extends Iterable<IChatBaseComponent> {
    public static BaseComponent toGlowstone(IChatBaseComponent value) {
        return value == null ? null : value.toGlowstone();
    }

    BaseComponent toGlowstone();

    @LMethod(version = V1_12_R1)
    IChatBaseComponent addSibling(IChatBaseComponent sibling);

    @LMethod(version = V1_12_R1, name = "a")
    IChatBaseComponent addSibling(String text);

    @LMethod(version = V1_12_R1)
    IChatBaseComponent setChatModifier(ChatModifier modifier);

    @LMethod(version = V1_12_R1, name = "a")
    List<IChatBaseComponent> getSiblings();

    @LMethod(version = V1_12_R1)
    ChatModifier getChatModifier();

    @LMethod(version = V1_12_R1)
    String getText();

    @LMethod(version = V1_12_R1)
    String toPlainText();
}
