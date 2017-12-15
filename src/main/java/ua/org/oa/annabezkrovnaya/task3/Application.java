package ua.org.oa.annabezkrovnaya.task3;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        GenericStorage<String> genericStorage = new GenericStorageImpl<String>(String.class);
        genericStorage.getDataClass().getName();//create new array (type String, length 10)

        //add 10 elements to the current array
        genericStorage.add("Java");
        genericStorage.add("C#");
        genericStorage.add("JavaScript");
        genericStorage.add("C");
        genericStorage.add("Python");
        genericStorage.add("Ruby");
        genericStorage.add("PHP");
        genericStorage.add("SQL");
        genericStorage.add("React");
        genericStorage.add("Vue");
        genericStorage.add("DDD");


        System.out.println("Manipulation with generic array:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Print filled array:");
        System.out.println(Arrays.toString(genericStorage.getAll()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Get element from array by index 2:");
        System.out.println(genericStorage.get(2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Update element from cell with index 3:");
        genericStorage.update(3, "C++");
        System.out.println(Arrays.toString(genericStorage.getAll()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Delete element from array by index 5 with cell removing:");
        genericStorage.delete(5);
        System.out.println(Arrays.toString(genericStorage.getAll()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Delete element \"Vue\" from array with cell removing:");
        genericStorage.delete("PHP");
        System.out.println(Arrays.toString(genericStorage.getAll()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The length of our final filled array is " + genericStorage.getArrayLength());





    }

}
