package net.minecraft.server;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HttpUtilities {

    public static final ListeningExecutorService a = null;

    private static final AtomicInteger b = null;

    private static final Logger c = null;

    public static String a(Map<String, Object> map) {
        return null;
    }

    public static String a(URL url, Map<String, Object> map, boolean flag, @Nullable Proxy proxy) {
        return null;
    }

    private static String a(URL url, String s, boolean flag, @Nullable Proxy proxy) {
        return null;
    }
}
