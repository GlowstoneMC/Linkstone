package net.minecraft.server;

public class RemoteControlCommandListener implements ICommandListener {

    private final StringBuffer a = null;

    private final MinecraftServer b = null;

    public RemoteControlCommandListener(MinecraftServer minecraftserver) {
    }

    public void clearMessages() {
    }

    public String getMessages() {
        return null;
    }

    public String getName() {
        return null;
    }

    public IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    // CraftBukkit start - Send a String
    public void sendMessage(String message) {
    }

    // CraftBukkit end
    public void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    public boolean a(int i, String s) {
        return false;
    }

    public BlockPosition getChunkCoordinates() {
        return null;
    }

    public Vec3D d() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public Entity f() {
        return null;
    }

    public boolean getSendCommandFeedback() {
        return false;
    }

    public void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    public MinecraftServer h() {
        return null;
    }
}
