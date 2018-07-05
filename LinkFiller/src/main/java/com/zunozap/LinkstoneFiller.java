package com.zunozap;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;

public class LinkstoneFiller {
    public static String fillername = "LinkFiller";

    private static File f;
    public static File getFile() {
        return f;
    }

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            f = new File(args[0]);
        } else {
            System.out.println("Usage: <pathToFile>");
            f = new File("C:\\Users\\isaia\\Desktop\\oldcomput\\Linkstone\\src\\main\\java\\org\\bukkit\\craftbukkit\\block\\CraftBlock.java");
        }

        int i = 0;
        int l = 0;
        HashMap<String,String> map = new HashMap<>();
        
        for (String s : Files.readAllLines(f.toPath())) {
            //System.out.println(s.trim());
            if (s.trim().startsWith("@Override")) l++;
            if (s.trim().startsWith("public") && s.trim().endsWith("{")) {
                //System.out.println(s.trim());
                
                String z = s.trim().split(" ")[1];
                String zz = s.trim().split(" ")[2];
                if (z.equalsIgnoreCase("void")) {
                    if (!zz.endsWith(")")) {
                        int iz = 0;
                        String a = "";
                        for (String zzz : s.trim().split(" ")) {
                            iz++;
                            if (iz < 3) continue;
                            
                            a += zzz + " ";
                        }
                        a = a.substring(a.indexOf("(") + 1, a.indexOf(")"));
                        int w = a.split("arg").length;
                        String ww = "";
                        for (int q = 0; q < w; q++) {
                            if (q == w - 1) ;
                            else if (q == w - 2) ww += "arg" + q;
                            else  ww += "arg" + q + ", ";
                        }
                        String aa = zz.substring(0, zz.indexOf("("));
                        //System.out.println("base." + aa + "(" + ww + ");");
                        map.put(s.trim(), "base." + aa + "(" + ww + ");");
                    } else {
                        String aa = zz.substring(0, zz.indexOf("("));
                        map.put(s.trim(), "base." + aa + "();");
                    }
                } else {
                    try {
                    if (zz.length() > 2) {
                    if (!zz.endsWith(")") && !zz.startsWith("Craft")) {
                        int iz = 0;
                        String a = "";
                        for (String zzz : s.trim().split(" ")) {
                            iz++;
                            if (iz < 3) continue;
                            
                            a += zzz + " ";
                        }
                        a = a.substring(a.indexOf("(") + 1, a.indexOf(")"));
                        int w = a.split("arg").length;
                        String ww = "";
                        for (int q = 0; q < w; q++) {
                            if (q == w - 1) ;
                            else if (q == w - 2) ww += "arg" + q;
                            else  ww += "arg" + q + ", ";
                        }
                        String aa = zz.substring(0, zz.indexOf("("));
                        //System.out.println("base." + aa + "(" + ww + ");");
                        map.put(s.trim(), "base." + aa + "(" + ww + ");");
                    } else 
                    if (zz.endsWith(")") && zz.length() > 2) {
                        String aa = zz.substring(0, zz.indexOf("("));
                        map.put(s.trim(), "base." + aa + "();");
                    }
                    }
                    } catch (StringIndexOutOfBoundsException e) {}
                }
                i++;
            }
        }

        int after = 0;
        boolean v = false;
        String text = "";
        ArrayList<String> list = new ArrayList<>();
        list.add("/**");
        list.add(" * This file has methods auto-generated (marked with // LinkFiller)");
        list.add(" */");
        for (String s : Files.readAllLines(f.toPath())) {
            boolean add = true;
            if (after > 0) {
                if (!v) {
                    if (s.trim().startsWith("return")) {
                        s = "        return " + text + " // LinkFiller";
                        after = 0;
                    } else {
                        if (s.trim().startsWith("// TODO Auto-generated method stub")) add = false;
                        after++;
                    }
                } else {
                    s = "        " + text + " // LinkFiller";
                    after = 0;
                }
            }
            String s2 = map.get(s.trim());
            if (null != s2) {
                if (s.trim().contains("void")) {
                    v = true;
                } else v = false;
                text = s2;
                after = 1;
            }
            if (add) list.add(s);
        }

        for (String s : list) {
            if (!(!s.isEmpty() && s.trim().isEmpty())) {
                System.out.println(s);
            }
        }
    }

}