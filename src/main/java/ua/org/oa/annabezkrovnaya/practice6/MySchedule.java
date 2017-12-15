package ua.org.oa.annabezkrovnaya.practice6;

import java.util.Map;

public class MySchedule extends Thread {

    private ThreadGroup threadGroup;

    public void createGroupOfThreads(Map<Integer, CurrentThread> announcementMap, long timeLimit) {

        int announceIndex = 0;

            for (Map.Entry<Integer, CurrentThread> announce : announcementMap.entrySet()) {
                if (++announceIndex == announce.getKey()){
                    System.out.println(announce.getValue().getName());
                    announce.getValue().start();
                    threadGroup = currentThread().getThreadGroup();
                }
            }

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " Anonymous class");
            try {
                sleep(timeLimit);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadGroup.interrupt();
            System.out.println("All threads was stopped ");}).start();
        }
    }


