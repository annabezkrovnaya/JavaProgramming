package ua.org.oa.annabezkrovnaya.task3;


public interface GenericStorage <T>{

    boolean add(T obj);
    T get(int index);
    boolean update(int index, T obj);
    T[] delete(int index);
    T[] delete(T obj);
    T[] getAll();
    int getArrayLength();

    Class<?> getDataClass();
}

