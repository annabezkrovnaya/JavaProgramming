package ua.org.oa.annabezkrovnaya.practice4;

public class EnglishTextUtilsApp {

    public static void main(String[] args) {
        System.out.println("The number of the unique words in the current text (in the reverse order) is:");
        EnglishTextUtils englishTextUtils = new EnglishTextUtils();
        englishTextUtils.countWords("src/test/resources/Romeo.txt");
        (englishTextUtils.sortWithEnum(englishTextUtils.stringMap, EnglishTextUtils.Enum.KEYDESCENDING)).entrySet().forEach(System.out :: println);

    }
}
