package ua.org.oa.annabezkrovnaya.task1;

import java.time.LocalDate;

public class AppDate {

    public static void main(String[] args){

        Date date = new Date(15, 10,2017);

        System.out.println("Task 1.1: Inner classes and interfaces");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        date.printFullDate();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println ("There are " + date.getDayOfYear() + " days in the year");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("The week's day of your date is " + date.getDayOfWeek());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("There are " + date.getDayOfMonth() + " days in the month");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("There are " + date.daysBetween(LocalDate.now()) + " days between today and set date");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}
