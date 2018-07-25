package org.bukkit.craftbukkit.boss;

import java.util.List;

import net.glowstone.linkstone.annotations.LClassfile;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import net.glowstone.boss.GlowBossBar;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftBossBar implements BossBar {
    private GlowBossBar base;

    public CraftBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
        base = new GlowBossBar(title, color, style, flags);
    }

    @Override
    public void addFlag(BarFlag arg0) {
        base.addFlag(arg0); // LinkFiller
    }

    @Override
    public void addPlayer(Player arg0) {
        base.addPlayer(arg0); // LinkFiller
    }

    @Override
    public BarColor getColor() {
        return base.getColor(); // LinkFiller
    }

    @Override
    public List<Player> getPlayers() {
        return base.getPlayers(); // LinkFiller
    }

    @Override
    public double getProgress() {
        return base.getProgress(); // LinkFiller
    }

    @Override
    public BarStyle getStyle() {
        return base.getStyle(); // LinkFiller
    }

    @Override
    public String getTitle() {
        return base.getTitle(); // LinkFiller
    }

    @Override
    public boolean hasFlag(BarFlag arg0) {
        return base.hasFlag(arg0); // LinkFiller
    }

    @Override
    public void hide() {
        base.hide(); // LinkFiller
    }

    @Override
    public boolean isVisible() {
        return base.isVisible(); // LinkFiller
    }

    @Override
    public void removeAll() {
        base.removeAll(); // LinkFiller
    }

    @Override
    public void removeFlag(BarFlag arg0) {
        base.removeFlag(arg0); // LinkFiller
    }

    @Override
    public void removePlayer(Player arg0) {
        base.removePlayer(arg0); // LinkFiller
    }

    @Override
    public void setColor(BarColor arg0) {
        base.setColor(arg0); // LinkFiller
    }

    @Override
    public void setProgress(double arg0) {
        base.setProgress(arg0); // LinkFiller
    }

    @Override
    public void setStyle(BarStyle arg0) {
        base.setStyle(arg0); // LinkFiller
    }

    @Override
    public void setTitle(String arg0) {
        base.setTitle(arg0); // LinkFiller
    }

    @Override
    public void setVisible(boolean arg0) {
        base.setVisible(arg0); // LinkFiller
    }

    @Override
    public void show() {
        base.show(); // LinkFiller
    }

}