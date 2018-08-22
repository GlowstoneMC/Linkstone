package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.HoverEvent;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatHoverable {
    public static HoverEvent toGlowstone(ChatHoverable chatHoverable) {
        if (chatHoverable == null) {
            return null;
        }

        HoverEvent.Action action = EnumHoverAction.toGlowstone(chatHoverable.getAction());
        BaseComponent[] value = { IChatBaseComponent.toGlowstone(chatHoverable.getValue()) };
        return new HoverEvent(action, value);
    }

    @LField(version = V1_12_R1, name = "a")
    private final ChatHoverable.EnumHoverAction action;

    @LField(version = V1_12_R1, name = "b")
    private final IChatBaseComponent value;

    @LConstructor(version = V1_12_R1)
    public ChatHoverable(EnumHoverAction action, IChatBaseComponent value) {
        this.action = action;
        this.value = value;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public EnumHoverAction getAction() {
        return action;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public IChatBaseComponent getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatHoverable that = (ChatHoverable) o;
        return action == that.action &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(action, value);
    }

    public static enum EnumHoverAction {
        @LEnum(version = V1_12_R1)
        SHOW_ITEM,

        @LEnum(version = V1_12_R1)
        SHOW_TEXT,

        @LEnum(version = V1_12_R1)
        SHOW_ENTITY;

        public static HoverEvent.Action toGlowstone(EnumHoverAction action) {
            if (action == null) {
                return null;
            }

            switch (action) {
                case SHOW_ITEM: return HoverEvent.Action.SHOW_ITEM;
                case SHOW_TEXT: return HoverEvent.Action.SHOW_TEXT;
                case SHOW_ENTITY: return HoverEvent.Action.SHOW_ENTITY;
                default: throw new AssertionError();
            }
        }
    }
}
