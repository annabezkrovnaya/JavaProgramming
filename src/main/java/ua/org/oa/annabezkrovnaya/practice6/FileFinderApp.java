package ua.org.oa.annabezkrovnaya.practice6;


public class FileFinderApp {

    public static void main(String[] args) {

        FileFinder finder = new FileFinder();
        finder.logFiles("src/main/resources", "txt","src/test/resources/log_file.txt");
        System.out.println("Logging complete");
    }
}
