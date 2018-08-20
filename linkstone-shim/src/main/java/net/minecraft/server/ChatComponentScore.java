package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.LOverride;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ScoreComponent;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatComponentScore extends ChatBaseComponent {
    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private final String name;

    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private final String objective;

    @LGenerate
    @LField(version = V1_12_R1, name = "d")
    private String value = "";

    @LConstructor(version = V1_12_R1)
    public ChatComponentScore(String name, String objective) {
        this.name = name;
        this.objective = objective;
    }

    @LMethod(version = V1_12_R1, name = "g")
    public String getName() {
        return name;
    }

    @LMethod(version = V1_12_R1, name = "h")
    public String getObjective() {
        return objective;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    @LOverride
    public String getText() {
        return value;
    }

    @Override
    public BaseComponent toGlowstone() {
        ScoreComponent component = new ScoreComponent(name, objective, value);
        getChatModifier().apply(component);
        return component;
    }
}
