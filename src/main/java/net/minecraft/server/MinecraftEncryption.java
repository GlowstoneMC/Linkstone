package net.minecraft.server;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinecraftEncryption {

    private static final Logger a = null;

    public static KeyPair b() {
        return null;
    }

    public static byte[] a(String s, PublicKey publickey, SecretKey secretkey) {
        return null;
    }

    private static byte[] a(String s, byte[]... abyte) {
        return null;
    }

    public static PublicKey a(byte[] abyte) {
        return null;
    }

    public static SecretKey a(PrivateKey privatekey, byte[] abyte) {
        return null;
    }

    public static byte[] b(Key key, byte[] abyte) {
        return null;
    }

    private static byte[] a(int i, Key key, byte[] abyte) {
        return null;
    }

    private static Cipher a(int i, String s, Key key) {
        return null;
    }

    public static Cipher a(int i, Key key) {
        return null;
    }
}
