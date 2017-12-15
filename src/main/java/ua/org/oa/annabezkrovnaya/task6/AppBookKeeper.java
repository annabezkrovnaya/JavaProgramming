package ua.org.oa.annabezkrovnaya.task6;


public class AppBookKeeper {

    public static void main(String[] args) {
        BookKeeper bookKeeper = new BookKeeper();
        bookKeeper.addObjectToFile("The Stranger(The Labyrinths of Echo)", "Max Frei",2009);
        bookKeeper.addObjectToFile("Nine Princes in Amber(The Chronicles of Amber)", "Roger Zelazny", 1997);
    }
}
