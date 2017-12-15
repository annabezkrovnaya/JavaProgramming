package ua.org.oa.annabezkrovnaya.practice6;


public class FileCopierApp {

    public static void main(String[] args) {

        FileCopier copier = new FileCopier();

        copier.copyThrowThreads("./src/main/resources", "./src/test/resources/copyFolder");

    }
}
