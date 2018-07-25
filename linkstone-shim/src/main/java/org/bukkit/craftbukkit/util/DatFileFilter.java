package org.bukkit.craftbukkit.util;

import net.glowstone.linkstone.annotations.LClassfile;

import java.io.File;
import java.io.FilenameFilter;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class DatFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return name.endsWith(".dat");
    }
}
