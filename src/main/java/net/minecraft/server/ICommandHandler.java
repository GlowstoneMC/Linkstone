package net.minecraft.server;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface ICommandHandler {

    int a(ICommandListener icommandlistener, String s) {
        return 0;
    }

    List<String> a(ICommandListener icommandlistener, String s, @Nullable BlockPosition blockposition) {
        return null;
    }

    List<ICommand> a(ICommandListener icommandlistener) {
        return null;
    }

    Map<String, ICommand> getCommands() {
        return null;
    }
}
