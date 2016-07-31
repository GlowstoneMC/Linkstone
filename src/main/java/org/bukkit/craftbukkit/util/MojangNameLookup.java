package org.bukkit.craftbukkit.util;

import com.google.common.base.Charsets;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import org.apache.commons.io.IOUtils;

public class MojangNameLookup {

    private static final Logger logger;

    public static String lookupName(UUID id) {
        return null;
    }

    private class Response {

        String errorMessage;

        String cause;

        String name;
    }
}
