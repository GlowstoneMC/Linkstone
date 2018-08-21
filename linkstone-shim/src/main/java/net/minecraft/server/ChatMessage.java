package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LOverride;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;

import java.util.Arrays;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatMessage extends ChatBaseComponent {
    @LField(version = V1_12_R1, name = "d")
    private String text;

    @LField(version = V1_12_R1, name = "e")
    private Object[] with;

    @LConstructor(version = V1_12_R1)
    public ChatMessage(String text, Object[] with) {
        this.text = text;
        this.with = with;
    }

    @Override
    @LOverride
    public String getText() {
        return toGlowstone().toPlainText();
    }

    @Override
    public BaseComponent toGlowstone() {
        Object[] glowWith = Arrays.stream(this.with)
                .map(obj -> obj instanceof IChatBaseComponent ? ((IChatBaseComponent) obj).toGlowstone() : obj)
                .toArray(Object[]::new);

        TranslatableComponent component = new TranslatableComponent(text, glowWith);
        getChatModifier().apply(component);
        return component;
    }
}
