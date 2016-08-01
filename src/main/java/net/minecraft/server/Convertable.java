package net.minecraft.server;

import java.io.File;

public interface Convertable {

    IDataManager a(String s, boolean flag) {
        return null;
    }

    boolean isConvertable(String s) {
        return false;
    }

    boolean convert(String s, IProgressUpdate iprogressupdate) {
        return false;
    }

    File b(String s, String s1) {
        return null;
    }
}
