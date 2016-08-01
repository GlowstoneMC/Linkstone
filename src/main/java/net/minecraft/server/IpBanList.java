package net.minecraft.server;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class IpBanList extends JsonList<String, IpBanEntry> {

    public IpBanList(File file) {
    }

    protected JsonListEntry<String> a(JsonObject jsonobject) {
        return null;
    }

    public boolean isBanned(SocketAddress socketaddress) {
        return false;
    }

    public IpBanEntry get(SocketAddress socketaddress) {
        return null;
    }

    private String c(SocketAddress socketaddress) {
        return null;
    }
}
