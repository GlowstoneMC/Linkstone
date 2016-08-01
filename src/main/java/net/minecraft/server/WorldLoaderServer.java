package net.minecraft.server;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldLoaderServer extends WorldLoader {

    private static final Logger c;

    public WorldLoaderServer(File file, DataConverterManager dataconvertermanager) {
    }

    protected int c() {
        return 0;
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

    private void g(String s) {
    }

    private void a(File file, Iterable<File> iterable, WorldChunkManager worldchunkmanager, int i, int j, IProgressUpdate iprogressupdate) {
    }

    private void a(File file, File file1, WorldChunkManager worldchunkmanager, int i, int j, IProgressUpdate iprogressupdate) {
    }

    private void a(File file, Collection<File> collection) {
    }
}
