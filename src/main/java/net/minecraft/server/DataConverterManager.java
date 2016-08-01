package net.minecraft.server;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataConverterManager implements DataConverter {

    private static final Logger a;

    private final Map<DataConverterType, List<DataInspector>> b;

    private final Map<DataConverterType, List<IDataConverter>> c;

    private final int d;

    public DataConverterManager(int i) {
    }

    public NBTTagCompound a(DataConverterType dataconvertertype, NBTTagCompound nbttagcompound) {
        return null;
    }

    public NBTTagCompound a(DataConverterType dataconvertertype, NBTTagCompound nbttagcompound, int i) {
        return null;
    }

    private NBTTagCompound b(DataConverterType dataconvertertype, NBTTagCompound nbttagcompound, int i) {
        return null;
    }

    private NBTTagCompound c(DataConverterType dataconvertertype, NBTTagCompound nbttagcompound, int i) {
        return null;
    }

    public void a(DataConverterTypes dataconvertertypes, DataInspector datainspector) {
    }

    public void a(DataConverterType dataconvertertype, DataInspector datainspector) {
    }

    public void a(DataConverterType dataconvertertype, IDataConverter idataconverter) {
    }

    private <V> List<V> a(Map<DataConverterType, List<V>> map, DataConverterType dataconvertertype) {
        return null;
    }
}
