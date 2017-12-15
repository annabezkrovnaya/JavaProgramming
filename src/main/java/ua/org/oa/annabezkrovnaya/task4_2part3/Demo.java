package ua.org.oa.annabezkrovnaya.task4_2part3;

public class Demo {

    public static void main(String[] args) {

        MyDequeImpl<String> myDeque = new MyDequeImpl<>();

        myDeque.addFirst("111");
        myDeque.addLast("222");
        myDeque.addFirst("000");
        myDeque.addLast("333");

        System.out.println("Print each previous element from end to beginning with list iterator:");
        ListIterator<String> listIt = myDeque.listIterator();
        while (listIt.hasPrevious()){
            System.out.println(listIt.previous());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Print each next element from beginning to end with list iterator:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        ListIterator<String> listIterator = myDeque.listIterator();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Current deque with replaced element:");
        while (listIterator.hasNext()){
            if(listIterator.next().equals("333")){
                listIterator.set("888");
            }
        }
        System.out.println(myDeque);

















    }
}
