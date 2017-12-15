package ua.org.oa.annabezkrovnaya.task4_1;


public class App {

    public static void main(String[] args) {
        System.out.println("Task 4.1");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Integer[] integerArray = {200000, 350000, 150000, 320000, 280000};
        String[] array = {"Java", "C++", "JavaScript", "Python", "PHP"};
        Computer[] computers = {new Computer("Lenovo IdeaCentre 300-23ISU (F0BY00M7UA)", 1016.0),
                                new Computer("Asus V221IDUK-BA012D (90PT01Q1-M01830)", 415.0),
                                new Computer("HP ProOne 600 G2 (L3N88AV)", 802.0)};
        Car[] cars = {new Car("Kia Niro", 23139),
                      new Car("ZAZ Forza", 8123),
                      new Car(" CHERY Tiggo 2", 11074)};

        Compare<Integer> integerCompare = new Compare<>();
        Compare<String> stringCompare = new Compare<>();
        //Compare<Car> carCompare = new Compare<Car>(); - compilation error because class Car has no implementation with interface Comparable
        Compare<Computer> computerCompare = new Compare<>();

        System.out.println("Maximum of integers array is: " + integerCompare.getMaximum(integerArray));
        System.out.println("Maximum of strings array is: " + stringCompare.getMaximum(array));
        System.out.println("Maximum of computers array is: " + computerCompare.getMaximum(computers));
        System.out.println("We can't find maximum into cars array cause of lack of implementation with interface Comparable\n and, consequently, compilation error");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Task 4.2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");











    }
}
