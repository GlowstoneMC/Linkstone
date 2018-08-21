package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.annotations.Version;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;

@LClassfile(version = Version.V1_12_R1)
public class ChatComponentText extends ChatBaseComponent {
    @LField(version = Version.V1_12_R1, name = "b")
    private final String text;

    @LConstructor(version = Version.V1_12_R1)
    public ChatComponentText(String text) {
        this.text = text;
    }

    @Override
    @LOverride
    public String getText() {
        return text;
    }

    @Override
    public BaseComponent toGlowstone() {
        TextComponent component = new TextComponent();
        getChatModifier().apply(component);
        return component;
    }
}
