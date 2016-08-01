package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataWatcher {

    private static final Logger a = null;

    private static final Map<Class<? extends Entity>, Integer> b = null;

    private final Entity c = null;

    private final Map<Integer, DataWatcher.Item<?>> d = null;

    private final ReadWriteLock e = null;

    private boolean f = false;

    private boolean g = false;

    public DataWatcher(Entity entity) {
    }

    public static <T> DataWatcherObject<T> a(Class<? extends Entity> oclass, DataWatcherSerializer<T> datawatcherserializer) {
        return null;
    }

    public <T> void register(DataWatcherObject<T> datawatcherobject, Object t0) {
    }

    private <T> void registerObject(DataWatcherObject<T> datawatcherobject, Object t0) {
    }

    private <T> DataWatcher.Item<T> c(DataWatcherObject<T> datawatcherobject) {
        return null;
    }

    public <T> T get(DataWatcherObject<T> datawatcherobject) {
        return null;
    }

    public <T> void set(DataWatcherObject<T> datawatcherobject, T t0) {
    }

    public <T> void markDirty(DataWatcherObject<T> datawatcherobject) {
    }

    public boolean a() {
        return false;
    }

    public static void a(List<DataWatcher.Item<?>> list, PacketDataSerializer packetdataserializer) throws IOException {
    }

    @Nullable
    public List<DataWatcher.Item<?>> b() {
        return null;
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    @Nullable
    public List<DataWatcher.Item<?>> c() {
        return null;
    }

    private static <T> void a(PacketDataSerializer packetdataserializer, DataWatcher.Item<T> datawatcher_item) throws IOException {
    }

    @Nullable
    public static List<DataWatcher.Item<?>> b(PacketDataSerializer packetdataserializer) throws IOException {
        return null;
    }

    public boolean d() {
        return false;
    }

    public void e() {
    }

    public static class Item<T> {

        private final DataWatcherObject<T> a = null;

        private T b = null;

        private boolean c = false;

        public Item(DataWatcherObject<T> datawatcherobject, T t0) {
        }

        public DataWatcherObject<T> a() {
            return null;
        }

        public void a(T t0) {
        }

        public T b() {
            return null;
        }

        public boolean c() {
            return false;
        }

        public void a(boolean flag) {
        }
    }
}
