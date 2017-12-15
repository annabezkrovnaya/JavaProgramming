package ua.org.oa.annabezkrovnaya.practice6;

public class RunnableName implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().setName("Runnable Thread");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupt");
                return;
            }
        }
    }
}
