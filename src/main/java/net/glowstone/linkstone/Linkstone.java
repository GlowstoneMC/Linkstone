package net.glowstone.linkstone;

public class Linkstone {
    public static String[] args;

	public Linkstone() {
        // TODO: ASM class trickery

	    // TODO: I'm just going to pack Glowstone with the Linkstone jar because 
	    // TODO: trying to use sponge's Mixins with a Launchwrapper replacment doesn't end well
    }

    public static void main(String[] arguments) {
    	args = arguments;

    	System.out.println("Welcome to Linkstone! Bridging the gap between CraftBukkit and Glowstone");
    	net.glowstone.GlowServer.main(args);

    	// addURL(glowjar.toURI().toURL());
    	// Launch.launch(new LinkstoneTweeker());
    }
}