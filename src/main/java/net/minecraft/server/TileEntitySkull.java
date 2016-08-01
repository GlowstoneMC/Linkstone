package net.minecraft.server;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import javax.annotation.Nullable;

public class TileEntitySkull extends TileEntity implements ITickable {

    private int a;

    public int rotation;

    private GameProfile g;

    private int h;

    private boolean i;

    private static UserCache j;

    private static MinecraftSessionService k;

    public TileEntitySkull() {
    }

    public static void a(UserCache usercache) {
    }

    public static void a(MinecraftSessionService minecraftsessionservice) {
    }

    public NBTTagCompound save(NBTTagCompound nbttagcompound) {
        return null;
    }

    public void a(NBTTagCompound nbttagcompound) {
    }

    public void E_() {
    }

    @Nullable
    public GameProfile getGameProfile() {
        return null;
    }

    @Nullable
    public PacketPlayOutTileEntityData getUpdatePacket() {
        return null;
    }

    public NBTTagCompound c() {
        return null;
    }

    public void setSkullType(int i) {
    }

    public void setGameProfile(@Nullable GameProfile gameprofile) {
    }

    private void h() {
    }

    public static GameProfile b(GameProfile gameprofile) {
        return null;
    }

    public int getSkullType() {
        return 0;
    }

    public void setRotation(int i) {
    }

    public void a(EnumBlockMirror enumblockmirror) {
    }

    public void a(EnumBlockRotation enumblockrotation) {
    }
}
