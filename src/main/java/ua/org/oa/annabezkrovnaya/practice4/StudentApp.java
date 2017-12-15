package ua.org.oa.annabezkrovnaya.practice4;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentApp {

    private static Map<String, Student> studentMap;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Richard", "Castle", 5));
        students.add(new Student("Kathe", "Beckett", 3));
        students.add(new Student("Ashly", "Riane", 3));
        students.add(new Student("Javier", "Esposito", 5));

        System.out.println("Students from list, who study on third curse:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentUtils.printStudentsThrowMap(students, 3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Students from list, who study on fifth curse:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentUtils.printStudentsThrowMap(students, 5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Sorted list of students:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StudentUtils.sortStudents(students).forEach(System.out :: println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

    }
}
