package net.minecraft.server;

import com.flowpowered.network.Message;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.net.message.play.game.TitleMessage;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutTitle implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private EnumTitleAction action;

    /**
     * Text for {@link EnumTitleAction#TITLE}, {@link EnumTitleAction#SUBTITLE} and {@link EnumTitleAction#ACTIONBAR}
     */
    @LField(version = V1_12_R1, name = "b")
    private IChatBaseComponent text;

    /**
     * Ticks to spend fading text in for {@link EnumTitleAction#TIMES}
     */
    @LField(version = V1_12_R1, name = "c")
    private int fadeInTime;

    /**
     * Ticks to keep the title displayed for {@link EnumTitleAction#TIMES}
     */
    @LField(version = V1_12_R1, name = "d")
    private int stayTime;

    /**
     * Ticks to spend out, not when to start fading out for {@link EnumTitleAction#TIMES}
     */
    @LField(version = V1_12_R1, name = "e")
    private int fadeOutTime;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutTitle() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutTitle(int fadeInTime, int stayTime, int fadeOutTime) {
        this.fadeInTime = fadeInTime;
        this.stayTime = stayTime;
        this.fadeOutTime = fadeOutTime;
    }

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutTitle(EnumTitleAction action, IChatBaseComponent text) {
        this.action = action;
        this.text = text;
    }

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutTitle(EnumTitleAction action, IChatBaseComponent text, int fadeInTime, int stayTime, int fadeOutTime) {
        this.action = action;
        this.text = text;
        this.fadeInTime = fadeInTime;
        this.stayTime = stayTime;
        this.fadeOutTime = fadeOutTime;
    }

    @Override
    public Message toGlowMessage() {
        TitleMessage.Action glowAction = EnumTitleAction.toGlowstone(action);
        switch (action) {
            case TITLE:
            case SUBTITLE:
            case ACTIONBAR:
                return new TitleMessage(glowAction, IChatBaseComponent.toGlowMessage(text));

            case TIMES:
                return new TitleMessage(glowAction, fadeInTime, stayTime, fadeOutTime);

            case CLEAR:
            case RESET:
                return new TitleMessage(glowAction);

            default:
                throw new AssertionError();
        }
    }

    @LClassfile(version = V1_12_R1)
    public static enum EnumTitleAction {
        TITLE,
        SUBTITLE,
        TIMES,
        ACTIONBAR,
        CLEAR,
        RESET;

        public static TitleMessage.Action toGlowstone(EnumTitleAction action) {
            if (action == null) {
                return null;
            }

            switch (action) {
                case TITLE: return TitleMessage.Action.TITLE;
                case SUBTITLE: return TitleMessage.Action.SUBTITLE;
                case TIMES: return TitleMessage.Action.TIMES;
                case ACTIONBAR: return TitleMessage.Action.ACTION;
                case CLEAR: return TitleMessage.Action.CLEAR;
                case RESET: return TitleMessage.Action.RESET;
                default: throw new AssertionError();
            }
        }
    }
}
