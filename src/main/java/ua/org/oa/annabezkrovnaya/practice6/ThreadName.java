package ua.org.oa.annabezkrovnaya.practice6;


public class ThreadName extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            currentThread().setName("Simple Thread");
            System.out.println(currentThread().getName());
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
