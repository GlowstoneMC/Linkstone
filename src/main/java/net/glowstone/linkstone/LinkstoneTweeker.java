package net.glowstone.linkstone;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.LogManager;

import org.spongepowered.asm.launch.MixinBootstrap;

import eu.thog92.universalat.AccessTransformer;
import eu.thog92.universalat.hook.BukkitLaunchClassLoader;
import eu.thog92.universalat.hook.ClassLoaderTransformer;
import eu.thog92.universalat.hook.JavaPluginTransformer;
import eu.thog92.universalat.loader.ATClassLoader;
import eu.thog92.universalat.loader.ITweaker;
import eu.thog92.universalat.loader.Launch;
import eu.thog92.universalat.modifier.ModifierClassTransformer;

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
	    classLoader.registerTransformer(new JavaPluginTransformer());
        classLoader.registerTransformer(new ClassLoaderTransformer());
        ModifierClassTransformer.addModifier(BukkitLaunchClassLoader.class);
        classLoader.registerTransformer(new ModifierClassTransformer());
        classLoader.addClassLoaderExclusion("org.apache.");
        classLoader.addClassLoaderExclusion("com.tobedevoured.naether.");
        classLoader.addClassLoaderExclusion("com.tobedevoured.naether.util.");
        classLoader.addClassLoaderExclusion("org.sonatype.");
        classLoader.addClassLoaderExclusion("org.bukkit.plugin.");
	}
	
}