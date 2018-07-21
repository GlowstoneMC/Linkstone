package net.glowstone.linkstone.compiler;

import org.apache.maven.artifact.Artifact;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Stores ClassNodes or loads them from jar files.
 */
public class ClassStore {
    private final Map<String, ClassNode> classes = new HashMap<>();
    private final Map<String, byte[]> classfiles = new HashMap<>();

    /**
     * Add a jar file to this ClassStore.
     *
     * @param file jar file to load
     * @throws IOException file could not be read
     */
    public void insertArtifact(File file) throws IOException {
        ZipInputStream in = new ZipInputStream(new FileInputStream(file));
        byte[] cache = new byte[8192];
        ZipEntry entry;
        while ((entry = in.getNextEntry()) != null) {
            if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                int len;
                while ((len = in.read(cache)) > 0) {
                    baos.write(cache, 0, len);
                }

                String classname = entry.getName();
                classname = classname.substring(0, classname.length() - ".class".length());
                classfiles.put(classname, baos.toByteArray());

                in.closeEntry();
            }
        }
        in.close();
    }

    public void insert(ClassNode cn) {
        classes.put(cn.name, cn);
    }

    public void insert(Collection<ClassNode> cns) {
        for (ClassNode cn : cns) {
            this.insert(cn);
        }
    }

    public ClassNode getClass(String name) {
        ClassNode cn = classes.get(name);
        if (cn == null) {
            byte[] bytecode = classfiles.get(name);
            if (bytecode != null) {
                cn = new ClassNode();
                new ClassReader(bytecode).accept(cn, 0);
                classes.put(name, cn);
            }
        }
        return cn;
    }
}
