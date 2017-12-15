package ua.org.oa.annabezkrovnaya.practice1;


import lombok.*;

import java.util.*;


@Setter
@Getter
@NoArgsConstructor
public class Exam {

    private String title;
    private int mark;
    private int course;
    private int semester;
    private Exams exams;
    private List<Exam> allExams;


    Exam(String title, int mark, int course, int semester) {
        for (Exams exam : Exams.values()) {
            if (exam.name().equalsIgnoreCase(title)) {
                setTitle((exam.name().substring(0, 1).toUpperCase()).concat((exam.name().substring(1).toLowerCase())));
            }
        }
        this.mark = mark;
        this.course = course;
        this.semester = semester;
    }

    public List<Exam> createFullExamList(){
        allExams = new ArrayList<>();
        for (Exams exam : Exams.values()) {
            if (exam.name().equals("PROGRAMMING") || exam.name().equals("MATHEMATICS") || exam.name().equals("ENGLISH")) {
                allExams.add(new Exam(exam.name(), 0, 1, 1));
                allExams.add(new Exam(exam.name(), 0, 1, 2));
                allExams.add(new Exam(exam.name(), 0, 2, 1));
                allExams.add(new Exam(exam.name(), 0, 2, 2));
                allExams.add(new Exam(exam.name(), 0, 3, 1));
                allExams.add(new Exam(exam.name(), 0, 3, 2));
            }
            if (exam.name().equals("LOGIC") || exam.name().equals("UKRAINIAN")) {
                allExams.add(new Exam(exam.name(), 0, 1, 1));
                allExams.add(new Exam(exam.name(), 0, 1, 2));
                allExams.add(new Exam(exam.name(), 0, 2, 1));
                allExams.add(new Exam(exam.name(), 0, 2, 2));
            }
            if (exam.name().equals("JAVA") || exam.name().equals("C") || exam.name().equals("PYTHON")) {
                allExams.add(new Exam(exam.name(), 0, 3, 1));
                allExams.add(new Exam(exam.name(), 0, 3, 2));
                allExams.add(new Exam(exam.name(), 0, 4, 1));
                allExams.add(new Exam(exam.name(), 0, 4, 2));
                allExams.add(new Exam(exam.name(), 0, 5, 1));
                allExams.add(new Exam(exam.name(), 0, 5, 2));
            }
        }
        return allExams;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "title='" + title + '\'' +
                ", mark=" + mark +
                ", course=" + course +
                ", semester=" + semester +
                '}';
    }

    public enum Exams {

        PROGRAMMING, LOGIC, MATHEMATICS, ENGLISH, UKRAINIAN, JAVA, PYTHON, C

    }
}

