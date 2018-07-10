package net.glowstone.linkstone.compiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    /**
     * Delete a file or folder with its content
     *
     * @param file that will be deleted
     */
    public static void delete(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                delete(f);
            }
        }

        file.delete();
    }

    /**
     * @param directory whose content will be listed
     * @return all files (recursive) in that directory.
     */
    public static List<File> listFiles(File directory) {
        List<File> list = new ArrayList<>();
        collectFiles(directory, list);
        return list;
    }

    private static void collectFiles(File file, List<File> list) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                collectFiles(f, list);
            }
        } else {
            list.add(file);
        }
    }

}
