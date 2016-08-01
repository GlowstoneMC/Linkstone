package net.minecraft.server;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MojangsonParser {

    private static final Logger a = null;

    private static final Pattern b = null;

    public static NBTTagCompound parse(String s) throws MojangsonParseException {
        return null;
    }

    static int b(String s) throws MojangsonParseException {
        return 0;
    }

    static MojangsonParser.MojangsonTypeParser a(String... astring) throws MojangsonParseException {
        return null;
    }

    static MojangsonParser.MojangsonTypeParser a(String s, String s1) throws MojangsonParseException {
        return null;
    }

    private static MojangsonParser.MojangsonTypeParser a(String s, boolean flag) throws MojangsonParseException {
        return null;
    }

    private static String b(String s, boolean flag) throws MojangsonParseException {
        return null;
    }

    private static String a(String s, int i) throws MojangsonParseException {
        return null;
    }

    private static String c(String s, boolean flag) throws MojangsonParseException {
        return null;
    }

    private static String d(String s, boolean flag) throws MojangsonParseException {
        return null;
    }

    private static int a(String s, char c0) {
        return 0;
    }

    private static boolean b(String s, int i) {
        return false;
    }

    static class MojangsonPrimitiveParser extends MojangsonParser.MojangsonTypeParser {

        private static final Pattern c = null;

        private static final Pattern d = null;

        private static final Pattern e = null;

        private static final Pattern f = null;

        private static final Pattern g = null;

        private static final Pattern h = null;

        private static final Pattern i = null;

        private static final Splitter j = null;

        protected String b = null;

        public MojangsonPrimitiveParser(String s, String s1) {
        }

        public NBTBase a() throws MojangsonParseException {
            return null;
        }
    }

    static class MojangsonListParser extends MojangsonParser.MojangsonTypeParser {

        protected List<MojangsonParser.MojangsonTypeParser> b = null;

        public MojangsonListParser(String s) {
        }

        public NBTBase a() throws MojangsonParseException {
            return null;
        }
    }

    static class MojangsonCompoundParser extends MojangsonParser.MojangsonTypeParser {

        protected List<MojangsonParser.MojangsonTypeParser> b = null;

        public MojangsonCompoundParser(String s) {
        }

        public NBTBase a() throws MojangsonParseException {
            return null;
        }
    }

    abstract static class MojangsonTypeParser {

        protected String a = null;

        MojangsonTypeParser() {
        }

        public abstract NBTBase a() throws MojangsonParseException;
    }
}
