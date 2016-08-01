package net.minecraft.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;

public class DataConverterSignText implements IDataConverter {

    public static final Gson a;

    public DataConverterSignText() {
    }

    public int a() {
        return 0;
    }

    public NBTTagCompound a(NBTTagCompound nbttagcompound) {
        return null;
    }

    private void a(NBTTagCompound nbttagcompound, String s) {
    }
}
