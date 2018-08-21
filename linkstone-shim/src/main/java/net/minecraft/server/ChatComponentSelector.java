package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.annotations.Version;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.SelectorComponent;

@LClassfile(version = Version.V1_12_R1)
public class ChatComponentSelector extends ChatBaseComponent {
    @LField(version = Version.V1_12_R1, name = "b")
    private final String selector;

    @LConstructor(version = Version.V1_12_R1)
    public ChatComponentSelector(String selector) {
        this.selector = selector;
    }

    @Override
    @LOverride
    public String getText() {
        return selector;
    }

    @Override
    public BaseComponent toGlowstone() {
        SelectorComponent component = new SelectorComponent(this.selector);
        getChatModifier().apply(component);
        return component;
    }
}
