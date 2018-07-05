package net.glowstone.linkstone;

import eu.thog92.universalat.loader.ATClassLoader;
import eu.thog92.universalat.loader.ITweaker;

public class LinkstoneTweeker implements ITweaker {

	@Override
	public String[] getLaunchArguments() {
		return Linkstone.args;
	}

	@Override
	public String getLaunchTarget() {
		return "net.glowstone.GlowServer";
	}

	@Override
	public void injectIntoClassLoader(ATClassLoader classLoader) {
	    //classLoader.registerTransformer(new JavaPluginTransformer());
        //classLoader.registerTransformer(new ClassLoaderTransformer());
        // ModifierClassTransformer.addModifier(BukkitLaunchClassLoader.class);
        //classLoader.registerTransformer(new ModifierClassTransformer());
	    // TODO: Above needed?

        classLoader.addClassLoaderExclusion("org.apache.");
        classLoader.addClassLoaderExclusion("com.tobedevoured.naether.");
        classLoader.addClassLoaderExclusion("com.tobedevoured.naether.util.");
        classLoader.addClassLoaderExclusion("org.sonatype.");
        classLoader.addClassLoaderExclusion("org.bukkit.plugin.");

        classLoader.addClassLoaderExclusion("org.bukkit.");
        classLoader.addClassLoaderExclusion("com.destroystokyo.");
        classLoader.addClassLoaderExclusion("net.glowstone.");
	}

}