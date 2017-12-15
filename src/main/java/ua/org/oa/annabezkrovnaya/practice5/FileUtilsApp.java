package ua.org.oa.annabezkrovnaya.practice5;


import java.io.IOException;

public class FileUtilsApp {

    public static void main(String[] args) throws IOException {

        System.out.println("Point 1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Necessary file was creating");
        //FileUtils.createFileWithRandomNumbers("src/main/resources/random_num.txt", 100, 100, 1000);
        //file with random numbers was creating and for farther successful work we commented out this action code
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sorted numbers from current file:");
        FileUtils.sortNumbers("src/main/resources/random_num.txt").forEach(System.out :: println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 3");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Get students' names from file, who has an average score 90 and more:");
        FileUtils.checkStudentAverageScore("src/main/resources/student_list_with_scores.txt", 90);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 4.1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("After words replacing, current text has next view:");
        System.out.println("***");
        System.out.println(FileUtils.changeWordsInStrings("src/main/resources/tortoise and eagle.txt"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 4.2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("After replacing words of each text sentence, it has next view:");
        System.out.println("***");
        System.out.println(FileUtils.changeWordsInSentences("src/main/resources/tortoise and eagle.txt"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 5.1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Unbuffered copying was competed");
        //FileUtils.copyFileContent("src/main/resources/tortoise and eagle.txt", "src/main/resources/tortoise and eagle(1).txt");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Point 5.2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Buffered copying was competed. It was performed for 450 ms longer then Unbuffered");
        //FileUtils.copyFileContentBuffered("src/main/resources/tortoise and eagle.txt", "src/main/resources/tortoise and eagle(2).txt");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();













    }
}
