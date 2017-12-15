package ua.org.oa.annabezkrovnaya.help;


import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        File f = new File("./src/main/resources/FileDirectory");
        //deleteDirectory(f);
        if (f.isDirectory()) {
            for (File file : f.listFiles()) {
                // рекурсивный вызов
                recursiveDelete(f);
            }
        }
    }
    public static void recursiveDelete(File file) {
        // до конца рекурсивного цикла
        if (!file.exists())
            return;
    }
    public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) {
                File f = new File(dir, children[i]);
                deleteDirectory(f);
            }
            dir.delete();
        } else dir.delete();
    }
}
