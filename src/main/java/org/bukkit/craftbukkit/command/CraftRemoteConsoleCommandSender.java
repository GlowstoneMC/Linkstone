package org.bukkit.craftbukkit.command;

import net.minecraft.server.ChatComponentText;
import net.minecraft.server.RemoteControlCommandListener;
import org.bukkit.command.RemoteConsoleCommandSender;

public class CraftRemoteConsoleCommandSender extends ServerCommandSender implements RemoteConsoleCommandSender {

    private final RemoteControlCommandListener listener;

    public CraftRemoteConsoleCommandSender(RemoteControlCommandListener listener) {
    }

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void sendMessage(String[] messages) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(boolean value) {
    }
}
