package net.minecraft.server;

import javax.annotation.Nullable;

public interface ICommandListener {

    String getName() {
        return null;
    }

    IChatBaseComponent getScoreboardDisplayName() {
        return null;
    }

    void sendMessage(IChatBaseComponent ichatbasecomponent) {
    }

    boolean a(int i, String s) {
        return false;
    }

    BlockPosition getChunkCoordinates() {
        return null;
    }

    Vec3D d() {
        return null;
    }

    World getWorld() {
        return null;
    }

    @Nullable
    Entity f() {
        return null;
    }

    boolean getSendCommandFeedback() {
        return false;
    }

    void a(CommandObjectiveExecutor.EnumCommandResult commandobjectiveexecutor_enumcommandresult, int i) {
    }

    @Nullable
    MinecraftServer h() {
        return null;
    }
}
