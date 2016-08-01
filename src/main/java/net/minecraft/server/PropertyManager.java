package net.minecraft.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import joptsimple.OptionSet;

// CraftBukkit
public class PropertyManager {

    private static final Logger a = null;

    public final Properties properties = null;

    private final File file = null;

    public PropertyManager(File file) {
    }

    // CraftBukkit start
    private OptionSet options = null;

    public PropertyManager(final OptionSet options) {
    }

    private <T> T getOverride(String name, T value) {
        return null;
    }

    // CraftBukkit end
    public void a() {
    }

    public void savePropertiesFile() {
    }

    public File c() {
        return null;
    }

    public String getString(String s, String s1) {
        return null;
    }

    public int getInt(String s, int i) {
        return 0;
    }

    public long getLong(String s, long i) {
        return 0;
    }

    public boolean getBoolean(String s, boolean flag) {
        return false;
    }

    public void setProperty(String s, Object object) {
    }

    public boolean a(String s) {
        return false;
    }

    public void b(String s) {
    }
}
