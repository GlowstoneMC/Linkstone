package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public interface IWorldBorderListener {

    public void a(WorldBorder var1, double var2);

    public void a(WorldBorder var1, double var2, double var4, long var6);

    public void a(WorldBorder var1, double var2, double var4);

    public void a(WorldBorder var1, int var2);

    public void b(WorldBorder var1, int var2);

    public void b(WorldBorder var1, double var2);

    public void c(WorldBorder var1, double var2);

}