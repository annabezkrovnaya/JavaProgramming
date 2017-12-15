package ua.org.oa.annabezkrovnaya.practice5;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GroupApp {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aleksey Korovko", 95));
        list.add(new Student("Yulija Zemelkina", 88));
        list.add(new Student("Sanya Ovechko", 86));

        //serializeGroup("src/main/resources/serialized_group.txt", new Group("PT-7", list));
        System.out.println(deserializeGroup("src/main/resources/serialized_group.txt"));
    }

    public static void serializeGroup(String path, Group group) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Group deserializeGroup(String path) {
        Group group = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            try {
                group = (Group) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return group;
    }
}
