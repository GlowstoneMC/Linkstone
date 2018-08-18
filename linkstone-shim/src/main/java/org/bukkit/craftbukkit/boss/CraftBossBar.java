package org.bukkit.craftbukkit.boss;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;

import net.glowstone.boss.GlowBossBar;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftBossBar {
    @LDelegate(BossBar.class)
    private GlowBossBar base;

    public CraftBossBar(GlowBossBar base) {
        this.base = base;
    }

    @LConstructor(version = V1_12_R1)
    public CraftBossBar(String title, BarColor color, BarStyle style, BarFlag... flags) {
        base = new GlowBossBar(title, color, style, flags);
    }
}