package org.bukkit.craftbukkit.boss;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import net.minecraft.server.BossBattle;
import net.minecraft.server.BossBattleServer;
import net.minecraft.server.EntityPlayer;
import net.minecraft.server.PacketPlayOutBoss;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.craftbukkit.util.CraftChatMessage;
import org.bukkit.entity.Player;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class CraftBossBar implements BossBar {

    private final BossBattleServer handle = null;

    private final Set<BarFlag> flags = null;

    private BarColor color = null;

    private BarStyle style = null;

    public CraftBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
    }

    private BossBattle.BarColor convertColor(BarColor color) {
        return null;
    }

    private BossBattle.BarStyle convertStyle(BarStyle style) {
        return null;
    }

    private void updateFlags() {
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {
    }

    @Override
    public BarColor getColor() {
        return null;
    }

    @Override
    public void setColor(BarColor color) {
    }

    @Override
    public BarStyle getStyle() {
        return null;
    }

    @Override
    public void setStyle(BarStyle style) {
    }

    @Override
    public void addFlag(BarFlag flag) {
    }

    @Override
    public void removeFlag(BarFlag flag) {
    }

    @Override
    public boolean hasFlag(BarFlag flag) {
        return false;
    }

    @Override
    public void setProgress(double progress) {
    }

    @Override
    public double getProgress() {
        return 0.0;
    }

    @Override
    public void addPlayer(Player player) {
    }

    @Override
    public void removePlayer(Player player) {
    }

    @Override
    public List<Player> getPlayers() {
        return null;
    }

    @Override
    public void setVisible(boolean visible) {
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void removeAll() {
    }
}
