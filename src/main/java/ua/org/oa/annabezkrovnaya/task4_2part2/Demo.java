package ua.org.oa.annabezkrovnaya.task4_2part2;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {
        MyDequeImpl<String> myDeque = new MyDequeImpl<>();

        myDeque.addFirst("111");
        myDeque.addLast("222");
        myDeque.addFirst("000");
        myDeque.addLast("333");

        System.out.println("After creating we have next deque:");
        System.out.println(myDeque);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Print elements with foreach method:");
        for (String element : myDeque) {
            System.out.println(element);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Print elements with visible Iterator:");
        Iterator<String> it = myDeque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("After removing gotten element we have next view of our deque:");
        Iterator<String> iter = myDeque.iterator();
        while (iter.hasNext()){
            if(iter.next().equals("222")) {
                iter.remove();
            }
        }
        myDeque.forEach(System.out :: println);
    }
}
