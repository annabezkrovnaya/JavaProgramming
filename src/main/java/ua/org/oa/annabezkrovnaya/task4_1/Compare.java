package ua.org.oa.annabezkrovnaya.task4_1;


import java.util.*;

public class Compare<T extends Comparable<T>> implements Comparable<Compare<T>> {
    T data;
    List<T> list;

    public T getMaximum(T [] array){
        List<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        list.sort(Comparator.reverseOrder());
        return list.get(0);
    }

    @Override
    public int compareTo(Compare<T> o) {
        return data.compareTo(o.data);
    }
}

