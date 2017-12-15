package ua.org.oa.annabezkrovnaya.practice4;


import java.util.*;

public class StudentUtils {

    public static Map<String, Student> createMapFromList(List<Student> students){
        Map<String, Student> studentMap = new HashMap<>();
        for (Student student : students){
            studentMap.put(student.getLastName() + " " + student.getFirstName(), student);
        }
        return studentMap;
    }

    public static void printStudentsThrowMap(List<Student> students, int course){
        Map<String, Student> studentMap = createMapFromList(students);
        for (Map.Entry<String, Student> studentMap1 : studentMap.entrySet()){
            if(studentMap1.getValue().getCourse() == course){
                System.out.println(studentMap1.getKey());
            }
        }
    }

    public static List<Student> sortStudents(List<Student> student) { // sorts by the last name and then by the first name
        student.sort((s1, s2) -> {
            if (s1.getLastName().compareTo(s2.getLastName()) == 0) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            } else
                return s1.getLastName().compareTo(s2.getLastName());
        });
        return student;
    }
}
