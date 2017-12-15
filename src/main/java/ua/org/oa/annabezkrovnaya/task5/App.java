package ua.org.oa.annabezkrovnaya.task5;


import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Translator translator = new Translator();
        //System.out.println(translator.getVocabularyMap("Rus", "Eng"));
        translator.translate();
        //System.out.println(translator.readFile("C:/Users/terra/IdeaProjects/programmingptoctxvii()/src/main/resources/Почему Java.txt"));
        //translator.readFile("C:/Users/terra/IdeaProjects/programmingptoctxvii()/src/main/resources/The History of Chocolate.txt");

    }

}
