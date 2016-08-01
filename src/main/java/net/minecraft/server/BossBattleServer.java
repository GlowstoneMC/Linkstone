package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class BossBattleServer extends BossBattle {

    private final Set<EntityPlayer> h;

    private final Set<EntityPlayer> i;

    public boolean visible;

    public BossBattleServer(IChatBaseComponent ichatbasecomponent, BossBattle.BarColor bossbattle_barcolor, BossBattle.BarStyle bossbattle_barstyle) {
    }

    public void setProgress(float f) {
    }

    public BossBattle setDarkenSky(boolean flag) {
        return null;
    }

    public BossBattle setPlayMusic(boolean flag) {
        return null;
    }

    public BossBattle setCreateFog(boolean flag) {
        return null;
    }

    public void sendUpdate(PacketPlayOutBoss.Action packetplayoutboss_action) {
    }

    public void addPlayer(EntityPlayer entityplayer) {
    }

    public void removePlayer(EntityPlayer entityplayer) {
    }

    public void setVisible(boolean flag) {
    }

    public Collection<EntityPlayer> getPlayers() {
        return null;
    }
}
