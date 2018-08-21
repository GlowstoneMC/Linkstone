package net.minecraft.server;

import com.flowpowered.network.Message;
import com.google.common.collect.Streams;
import com.mojang.authlib.GameProfile;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.net.message.play.game.UserListItemMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class PacketPlayOutPlayerInfo implements Packet<PacketListenerPlayOut> {
    @LField(version = V1_12_R1, name = "a")
    private EnumPlayerInfoAction action;

    @LField(version = V1_12_R1, name = "b")
    private List<PlayerInfoData> entires;

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutPlayerInfo() {}

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutPlayerInfo(EnumPlayerInfoAction action, EntityPlayer... players) {
        this(action, Arrays.asList(players));
    }

    @LConstructor(version = V1_12_R1)
    public PacketPlayOutPlayerInfo(EnumPlayerInfoAction action, Iterable<EntityPlayer> players) {
        this.action = action;
        this.entires = Streams.stream(players)
                .map(player -> new PlayerInfoData(
                        player.getProfile(),
                        0, //TODO Implement ping
                        player.playerInteractManager.getGameMode(),
                        new ChatComponentText(player.glow.getDisplayName())))
                .collect(Collectors.toList());
    }

    @Override
    public Message toGlowMessage() {
        UserListItemMessage.Action action = EnumPlayerInfoAction.toGlowstone(this.action);
        List<UserListItemMessage.Entry> glowEntires = entires.stream()
                .map(e -> new UserListItemMessage.Entry(
                        e.getProfile().getId(),
                        e.getProfile().glow,
                        e.getGamemode().getId(),
                        e.getPing(),
                        IChatBaseComponent.toGlowMessage(e.getDisplayName()),
                        action
                ))
                .collect(Collectors.toList());

        return new UserListItemMessage(action, glowEntires);
    }

    @LClassfile(version = V1_12_R1)
    public enum EnumPlayerInfoAction {
        ADD_PLAYER,
        UPDATE_GAME_MODE,
        UPDATE_LATENCY,
        UPDATE_DISPLAY_NAME,
        REMOVE_PLAYER;

        public static UserListItemMessage.Action toGlowstone(EnumPlayerInfoAction action) {
            if (action == null) {
                return null;
            }

            switch (action) {
                case ADD_PLAYER: return UserListItemMessage.Action.ADD_PLAYER;
                case UPDATE_GAME_MODE: return UserListItemMessage.Action.UPDATE_GAMEMODE;
                case UPDATE_LATENCY: return UserListItemMessage.Action.UPDATE_LATENCY;
                case UPDATE_DISPLAY_NAME: return UserListItemMessage.Action.UPDATE_DISPLAY_NAME;
                case REMOVE_PLAYER: return UserListItemMessage.Action.REMOVE_PLAYER;
                default: throw new AssertionError();
            }
        }
    }

    @LClassfile(version = V1_12_R1)
    public class PlayerInfoData {
        @LField(version = V1_12_R1, name = "d")
        private GameProfile profile;

        @LField(version = V1_12_R1, name = "b")
        private int ping;

        @LField(version = V1_12_R1, name = "c")
        private EnumGamemode gamemode;

        @LField(version = V1_12_R1, name = "e")
        private IChatBaseComponent displayName;

        @LConstructor(version = V1_12_R1)
        public PlayerInfoData(GameProfile profile, int ping, EnumGamemode gamemode, IChatBaseComponent displayName) {
            this.profile = profile;
            this.ping = ping;
            this.gamemode = gamemode;
            this.displayName = displayName;
        }

        @LMethod(version = V1_12_R1, name = "a")
        public GameProfile getProfile() {
            return profile;
        }

        @LMethod(version = V1_12_R1, name = "b")
        public int getPing() {
            return ping;
        }

        @LMethod(version = V1_12_R1, name = "c")
        public EnumGamemode getGamemode() {
            return gamemode;
        }

        @LMethod(version = V1_12_R1, name = "d")
        public IChatBaseComponent getDisplayName() {
            return displayName;
        }
    }
}
