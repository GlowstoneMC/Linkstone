package net.minecraft.server;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class PacketPlayOutPlayerInfo implements Packet<PacketListenerPlayOut> {

    private PacketPlayOutPlayerInfo.EnumPlayerInfoAction a = null;

    private final List<PacketPlayOutPlayerInfo.PlayerInfoData> b = null;

    public PacketPlayOutPlayerInfo() {
    }

    public PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction packetplayoutplayerinfo_enumplayerinfoaction, EntityPlayer... aentityplayer) {
    }

    public PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction packetplayoutplayerinfo_enumplayerinfoaction, Iterable<EntityPlayer> iterable) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public String toString() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a = null;

        static {
        }
    }

    public class PlayerInfoData {

        private final int b = 0;

        private final EnumGamemode c = null;

        private final GameProfile d = null;

        private final IChatBaseComponent e = null;

        public PlayerInfoData(GameProfile gameprofile, int i, EnumGamemode enumgamemode, @Nullable IChatBaseComponent ichatbasecomponent) {
        }

        public GameProfile a() {
            return null;
        }

        public int b() {
            return 0;
        }

        public EnumGamemode c() {
            return null;
        }

        @Nullable
        public IChatBaseComponent d() {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    public static enum EnumPlayerInfoAction {

        ADD_PLAYER, UPDATE_GAME_MODE, UPDATE_LATENCY, UPDATE_DISPLAY_NAME, REMOVE_PLAYER;

        private EnumPlayerInfoAction() {
        }
    }
}
