package ua.org.oa.annabezkrovnaya.practice6;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class FileFinder {

    public void logFiles(String path, String namePart, String logPath) {
        File directory = new File(path);
        for (File entity : directory.listFiles()) {
            if (entity.isFile() && entity.getName().contains(namePart)) {
                fileWriter(entity.getPath(), logPath);
            }
            if (entity.isDirectory()) {
                new Thread(() -> {
                    try {
                        sleep(200);
                    }catch (InterruptedException e){
                        e.getMessage();
                    }
                    logFiles(entity.getPath(), namePart, logPath);
                }).start();
            }
        }
    }

    public void fileWriter (String path, String logPath){
        File file = new File(path);
        try (FileWriter writer = new FileWriter(logPath, true)) {
            writer.write(file.getPath());
            writer.append("\n");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}



