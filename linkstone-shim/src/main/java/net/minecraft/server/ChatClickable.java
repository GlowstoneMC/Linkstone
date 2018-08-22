package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LEnum;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.md_5.bungee.api.chat.ClickEvent;

import java.util.Objects;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatClickable {
    public static ClickEvent toGlowstone(ChatClickable chatClickable) {
        if (chatClickable == null) {
            return null;
        }

        ClickEvent.Action action = EnumClickAction.toGlowstone(chatClickable.getAction());
        return new ClickEvent(action, chatClickable.getValue());
    }

    @LField(version = V1_12_R1, name = "a")
    private final ChatClickable.EnumClickAction action;

    @LField(version = V1_12_R1, name = "b")
    private final String value;

    @LConstructor(version = V1_12_R1)
    public ChatClickable(EnumClickAction action, String value) {
        this.action = action;
        this.value = value;
    }

    @LMethod(version = V1_12_R1, name = "a")
    public EnumClickAction getAction() {
        return action;
    }

    @LMethod(version = V1_12_R1, name = "b")
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        // implementation might differ from nms implementation
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatClickable that = (ChatClickable) o;
        return action == that.action &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        // implementation might differ from nms implementation
        return Objects.hash(action, value);
    }

    public static enum EnumClickAction {
        @LEnum(version = V1_12_R1)
        OPEN_FILE,

        @LEnum(version = V1_12_R1)
        RUN_COMMAND,

        @LEnum(version = V1_12_R1)
        OPEN_URL,

        @LEnum(version = V1_12_R1)
        SUGGEST_COMMAND,

        @LEnum(version = V1_12_R1)
        CHANGE_PAGE;

        public static ClickEvent.Action toGlowstone(EnumClickAction action) {
            if (action == null) {
                return null;
            }
            switch (action) {
                case OPEN_FILE: return ClickEvent.Action.OPEN_FILE;
                case RUN_COMMAND: return ClickEvent.Action.RUN_COMMAND;
                case OPEN_URL: return ClickEvent.Action.OPEN_URL;
                case SUGGEST_COMMAND: return ClickEvent.Action.SUGGEST_COMMAND;
                case CHANGE_PAGE: return ClickEvent.Action.CHANGE_PAGE;
                default: throw new AssertionError();
            }
        }
    }
}
