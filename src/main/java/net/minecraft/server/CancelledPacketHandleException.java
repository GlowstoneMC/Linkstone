package net.minecraft.server;

public final class CancelledPacketHandleException extends RuntimeException {

    public static final CancelledPacketHandleException INSTANCE;

    private CancelledPacketHandleException() {
    }

    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
