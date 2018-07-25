package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class EntityTypes {

    public static final RegistryMaterials<MinecraftKey, Class<? extends Entity>> b = new RegistryMaterials<>();

}