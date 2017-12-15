package ua.org.oa.annabezkrovnaya.practice6;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CurrentThread extends Thread{

    private String announce;
    private int timeDelay;
    private int i = 0;

    CurrentThread(String announce, int timeDelay){
        this.announce = announce;
        this.timeDelay = timeDelay;
    }

    @Override
    public void run() {
        while (true) {
            currentThread().setName("Announce" + i++);
            System.out.println(announce);
            try {
                sleep(timeDelay);
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}
