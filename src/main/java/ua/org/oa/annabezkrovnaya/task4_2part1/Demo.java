package ua.org.oa.annabezkrovnaya.task4_2part1;


import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        MyDequeImpl<String> myDeque = new MyDequeImpl<>();

        myDeque.addFirst("111");
        myDeque.addLast("222");
        myDeque.addFirst("000");
        myDeque.addLast("333");

        System.out.println(myDeque);

        System.out.println(myDeque.getFirst());
        System.out.println(myDeque.getLast());

        myDeque.removeFirst();
        myDeque.removeLast();

        System.out.println(myDeque);

        System.out.println(myDeque.contains("111"));
        System.out.println(myDeque.contains("444"));

        myDeque.clear();

        System.out.println(myDeque);

        myDeque.addFirst("111");
        myDeque.addLast("222");
        myDeque.addFirst("000");
        myDeque.addLast("333");
        myDeque.addFirst("###");
        myDeque.addLast("444");
        myDeque.addFirst("***");
        myDeque.addLast("555");

        System.out.println(Arrays.toString(myDeque.toArray()));

        System.out.println(myDeque.size());

        MyDeque<String> myDeque1 = new MyDequeImpl<>();
        myDeque1.addFirst("000");
        myDeque1.addFirst("###");
        myDeque1.addLast("333");

        System.out.println(myDeque.containsAll(myDeque1));



    }
}
