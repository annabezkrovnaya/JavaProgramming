package ua.org.oa.annabezkrovnaya.practice5;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Group implements Serializable{

    private static final long serialVersionUID = -1712722365134140703L;
    private String code;
    private List<Student> studentList;

    @Override
    public String toString() {
        return "Group{" +
                "code='" + code + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (!code.equals(group.code)) return false;
        return studentList.equals(group.studentList);
    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + studentList.hashCode();
        return result;
    }
}
