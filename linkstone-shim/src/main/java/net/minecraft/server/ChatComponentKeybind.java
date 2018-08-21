package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LOverride;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.KeybindComponent;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatComponentKeybind extends ChatBaseComponent {
    @LField(version = V1_12_R1, name = "c")
    private final String keybind;

    @LConstructor(version = V1_12_R1)
    public ChatComponentKeybind(String keybind) {
        this.keybind = keybind;
    }

    @Override
    @LOverride
    public String getText() {
        return keybind;
    }

    @Override
    public BaseComponent toGlowstone() {
        KeybindComponent component = new KeybindComponent(keybind);
        getChatModifier().apply(component);
        return component;
    }
}
