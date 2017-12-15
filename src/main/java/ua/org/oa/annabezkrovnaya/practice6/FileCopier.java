package ua.org.oa.annabezkrovnaya.practice6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.lang.Thread.sleep;

public class FileCopier {

    public void copyThrowThreads(String pathFrom, String pathTo){
        File dir = new File(pathFrom);
        File[] files = dir.listFiles();

        if(files != null){
            for (File file : files){
                if(file.isFile()){
                    try {
                        Files.copy(file.toPath(), new File(pathTo + File.separator + file.getName()).toPath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (file.isDirectory()){
                    new Thread(() -> {
                        try {
                            sleep(200);
                        }catch (InterruptedException e){
                            e.getMessage();
                        }

                        copyThrowThreads(file.getPath(), pathTo);

                    }).start();
                }
            }
        }
    }
}
