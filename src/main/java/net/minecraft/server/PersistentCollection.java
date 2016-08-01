package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class PersistentCollection {

    private final IDataManager b = null;

    protected Map<String, PersistentBase> a = null;

    private final List<PersistentBase> c = null;

    private final Map<String, Short> d = null;

    public PersistentCollection(IDataManager idatamanager) {
    }

    @Nullable
    public PersistentBase get(Class<? extends PersistentBase> oclass, String s) {
        return null;
    }

    public void a(String s, PersistentBase persistentbase) {
    }

    public void a() {
    }

    private void a(PersistentBase persistentbase) {
    }

    private void b() {
    }

    public int a(String s) {
        return 0;
    }
}
