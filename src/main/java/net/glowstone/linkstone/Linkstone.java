package net.glowstone.linkstone;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.CraftServer;

public class Linkstone {
    public static String[] args;

	public Linkstone() {
        // TODO: ASM class trickery

	    // TODO: I'm just going to pack Glowstone with the Linkstone jar because 
	    // TODO: trying to use sponge's Mixins with a Launchwrapper replacment is very errorfull (Fix one error, two more showup)
    }

    public static void main(String[] arguments) throws MalformedURLException, IOException {
    	args = arguments;

    	System.out.println("Welcome to Linkstone! Your server is starting.\nLinkstone is an addon to Glowstone for NMS/OBC compatability");
    	File config = new File("linkstone.yml");
    	/*File glowjar = new File("glowstone.jar"); // TODO: config jar name?
    	if (!glowjar.exists()) {
    		System.err.println("Glowstone.jar does not exist");
    		return;
    	}
    	addURL(glowjar.toURI().toURL());*/
    	Timer timer = new Timer();
    	timer.schedule(new TimerTask() {
    	    @Override
    	    public void run() {
    	      System.out.println("running linkstone debug:");
    	      System.out.println(Bukkit.getServer().toString());
    	      System.out.println(((CraftServer)Bukkit.getServer()).toString());
    	    }
    	  }, TimeUnit.MINUTES.toMillis(2));
    	
    	net.glowstone.GlowServer.main(args);
    	//Launch.launch(new LinkstoneTweeker());
    }

    private static void addURL(URL u) throws IOException {
        System.out.println("Adding url to classpath");
        URLClassLoader sysloader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class<?> sysclass = URLClassLoader.class;

        try {
            Method method = sysclass.getDeclaredMethod("addURL", new Class[]{URL.class});
            method.setAccessible(true);
            method.invoke(sysloader, new Object[]{u});
        } catch (Throwable t) {
            t.printStackTrace();
            throw new IOException("Error, could not add URL to system classloader");
        }
    }
}