package net.minecraft.server;

// NMS implementation prints the error location, but no plugins seems to depend on it...
public class MojangsonParseException extends Exception {
    public MojangsonParseException(net.glowstone.util.mojangson.ex.MojangsonParseException cause) {
        super(cause);
    }
}
