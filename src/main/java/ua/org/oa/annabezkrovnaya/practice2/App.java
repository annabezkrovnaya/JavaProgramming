package ua.org.oa.annabezkrovnaya.practice2;


public class App {

    public static void main(String[] args) {

        Parser parser = new Parser();

        System.out.println("Name rating table");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        parser.parserForNames("C:\\Users\\terra\\IdeaProjects\\ProgrammingPTOCTXVII\\src\\test\\resources\\baby2008.html");
        parser.nameRatings.forEach(System.out :: println);
        System.out.println();

        System.out.println("Notebooks table");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        parser.parserForNotebooks("C:\\Users\\terra\\IdeaProjects\\ProgrammingPTOCTXVII\\src\\test\\resources\\source.html");
        parser.notebooks.forEach(System.out :: println);
    }
}
