package net.minecraft.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldLoader implements Convertable {

    private static final Logger c = null;

    protected final File a = null;

    protected final DataConverterManager b = null;

    public WorldLoader(File file, DataConverterManager dataconvertermanager) {
    }

    public WorldData c(String s) {
        return null;
    }

    @Nullable
    public static WorldData a(File file, DataConverterManager dataconvertermanager) {
        return null;
    }

    public IDataManager a(String s, boolean flag) {
        return null;
    }

    public boolean isConvertable(String s) {
        return false;
    }

    public boolean convert(String s, IProgressUpdate iprogressupdate) {
        return false;
    }

    public File b(String s, String s1) {
        return null;
    }
}
