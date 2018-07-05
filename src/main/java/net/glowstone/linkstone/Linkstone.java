package net.glowstone.linkstone;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import eu.thog92.universalat.loader.Launch;

public class Linkstone {
    public static String[] args;

	public Linkstone() {
    }

    public static void main(String[] arguments) throws MalformedURLException, IOException {
    	args = arguments;

    	System.out.println("Welcome to Linkstone! Bridging the gap between CraftBukkit and Glowstone");

    	// TODO: Better configuration
    	File configdir = new File("config");
    	File config = new File(configdir, "linkstone.yml");
    	configdir.mkdirs();
    	if (!config.exists()) {
    	    config.createNewFile();
    	    List<String> lines = Arrays.asList("# Name for the glowstone jar", "glowstone: glowstone.jar");
    	    Files.write(config.toPath(), lines, Charset.forName("UTF-8"));
    	}

    	String glowstone = "glowstone.jar";
        for (String s : Files.readAllLines(config.toPath())) {
            if (s.startsWith("glowstone:")) glowstone = s.substring("glowstone:".length()).trim();
        }

    	File glowjar = new File(glowstone);
    	addURL(glowjar.toURI().toURL());
    	Launch.launch(new LinkstoneTweeker());
    }

    private static void addURL(URL u) throws IOException {
        System.out.println("Adding url to classpath");
        URLClassLoader sysloader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class<?> sysclass = URLClassLoader.class;

        try {
            Method method = sysclass.getDeclaredMethod("addURL", new Class[]{URL.class});
            method.setAccessible(true);
            method.invoke(sysloader, u);
            // Thread.currentThread().setContextClassLoader(sysloader);
        } catch (Throwable t) {
            t.printStackTrace();
            throw new IOException("Error, could not add URL to system classloader");
        }
    }
}