package net.minecraft.server;

import com.google.common.annotations.VisibleForTesting;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.util.Iterator;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class GameProfileSerializer {

    @Nullable
    public static GameProfile deserialize(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static NBTTagCompound serialize(NBTTagCompound nbttagcompound, GameProfile gameprofile) {
        return null;
    }

    @VisibleForTesting
    public static boolean a(NBTBase nbtbase, NBTBase nbtbase1, boolean flag) {
        return false;
    }

    public static NBTTagCompound a(UUID uuid) {
        return null;
    }

    public static UUID b(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static BlockPosition c(NBTTagCompound nbttagcompound) {
        return null;
    }

    public static NBTTagCompound a(BlockPosition blockposition) {
        return null;
    }

    public static IBlockData d(NBTTagCompound nbttagcompound) {
        return null;
    }

    private static <T extends Comparable<T>> IBlockData a(IBlockData iblockdata, IBlockState<T> iblockstate, String s) {
        return null;
    }

    public static NBTTagCompound a(NBTTagCompound nbttagcompound, IBlockData iblockdata) {
        return null;
    }

    private static <T extends Comparable<T>> String a(IBlockState<T> iblockstate, Comparable<?> comparable) {
        return null;
    }
}
