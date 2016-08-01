package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldGenFactory {

    private static final Logger a = null;

    private static final Map<String, Class<? extends StructureStart>> b = null;

    private static final Map<Class<? extends StructureStart>, String> c = null;

    private static final Map<String, Class<? extends StructurePiece>> d = null;

    private static final Map<Class<? extends StructurePiece>, String> e = null;

    private static void b(Class<? extends StructureStart> oclass, String s) {
    }

    static void a(Class<? extends StructurePiece> oclass, String s) {
    }

    public static String a(StructureStart structurestart) {
        return null;
    }

    public static String a(StructurePiece structurepiece) {
        return null;
    }

    @Nullable
    public static StructureStart a(NBTTagCompound nbttagcompound, World world) {
        return null;
    }

    public static StructurePiece b(NBTTagCompound nbttagcompound, World world) {
        return null;
    }

    static {
    }
}
