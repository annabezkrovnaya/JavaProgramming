package ua.org.oa.annabezkrovnaya.practice6;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        System.out.println("Practice 6");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 1:");
        Thread thread = new Thread(new RunnableName());
        thread.start();
        Thread thread1 = new ThreadName();
        thread1.start();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 2:");
        Map<Integer, CurrentThread> announcementMap = new HashMap<>();
        announcementMap.put(1, new CurrentThread("Hallo", 5000));
        announcementMap.put(2, new CurrentThread("Is anybody here?", 3000));
        announcementMap.put(3, new CurrentThread("I'm lost", 1000));
        MySchedule mySchedule = new MySchedule();
        mySchedule.createGroupOfThreads(announcementMap, 10000);

    }
}
