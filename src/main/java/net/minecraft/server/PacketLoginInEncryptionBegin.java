package net.minecraft.server;

import java.io.IOException;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class PacketLoginInEncryptionBegin implements Packet<PacketLoginInListener> {

    private byte[] a;

    private byte[] b;

    public PacketLoginInEncryptionBegin() {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketLoginInListener packetlogininlistener) {
    }

    public SecretKey a(PrivateKey privatekey) {
        return null;
    }

    public byte[] b(PrivateKey privatekey) {
        return null;
    }
}
