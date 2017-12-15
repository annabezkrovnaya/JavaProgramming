package ua.org.oa.annabezkrovnaya.practice5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Student implements Serializable{


    private static final long serialVersionUID = 8542711504148996715L;
    private String name;
    private double averageScore;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.averageScore, averageScore) != 0) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(averageScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
