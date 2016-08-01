package net.minecraft.server;

import java.io.IOException;
import java.security.PublicKey;

public class PacketLoginOutEncryptionBegin implements Packet<PacketLoginOutListener> {

    private String a = null;

    private PublicKey b = null;

    private byte[] c = null;

    public PacketLoginOutEncryptionBegin() {
    }

    public PacketLoginOutEncryptionBegin(String s, PublicKey publickey, byte[] abyte) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketLoginOutListener packetloginoutlistener) {
    }
}
