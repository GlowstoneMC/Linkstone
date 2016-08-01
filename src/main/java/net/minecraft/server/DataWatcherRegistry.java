package net.minecraft.server;

import com.google.common.base.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class DataWatcherRegistry {

    private static final RegistryID<DataWatcherSerializer<?>> n;

    public static final DataWatcherSerializer<Byte> a;

    public static final DataWatcherSerializer<Integer> b;

    public static final DataWatcherSerializer<Float> c;

    public static final DataWatcherSerializer<String> d;

    public static final DataWatcherSerializer<IChatBaseComponent> e;

    public static final DataWatcherSerializer<Optional<ItemStack>> f;

    public static final DataWatcherSerializer<Optional<IBlockData>> g;

    public static final DataWatcherSerializer<Boolean> h;

    public static final DataWatcherSerializer<Vector3f> i;

    public static final DataWatcherSerializer<BlockPosition> j;

    public static final DataWatcherSerializer<Optional<BlockPosition>> k;

    public static final DataWatcherSerializer<EnumDirection> l;

    public static final DataWatcherSerializer<Optional<UUID>> m;

    public static void a(DataWatcherSerializer<?> datawatcherserializer) {
    }

    @Nullable
    public static DataWatcherSerializer<?> a(int i) {
        return null;
    }

    public static int b(DataWatcherSerializer<?> datawatcherserializer) {
        return 0;
    }

    static {
    }
}
