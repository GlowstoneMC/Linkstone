package com.mojang.authlib.properties;

import com.destroystokyo.paper.profile.ProfileProperty;
import com.ning.http.util.Base64;
import net.glowstone.linkstone.annotations.LBox;
import net.glowstone.linkstone.annotations.LBoxed;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LMethod;
import net.glowstone.linkstone.annotations.Version;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

@LClassfile(version = Version.V1_12_R1)
@LBox(ProfileProperty.class)
public class Property {
    @LBoxed
    public ProfileProperty glow;

    public Property(ProfileProperty glow) {
        this.glow = glow;
    }

    @LConstructor(version = Version.V1_12_R1)
    public Property(String name, String value) {
        this.glow = new ProfileProperty(name, value);
    }

    @LConstructor(version = Version.V1_12_R1)
    public Property(String name, String value, String signature) {
        this.glow = new ProfileProperty(name, value, signature);
    }

    @LMethod(version = Version.V1_12_R1)
    public String getName() {
        return glow.getName();
    }

    @LMethod(version = Version.V1_12_R1)
    public String getValue() {
        return glow.getValue();
    }

    @LMethod(version = Version.V1_12_R1)
    public String getSignature() {
        return glow.getSignature();
    }

    @LMethod(version = Version.V1_12_R1)
    public boolean hasSignature() {
        return glow.getSignature() != null;
    }

    @LMethod(version = Version.V1_12_R1)
    public boolean isSignatureValid(PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(glow.getValue().getBytes());
            return signature.verify(Base64.decode(glow.getSignature()));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (SignatureException e) {
            return false;
        }
    }
}