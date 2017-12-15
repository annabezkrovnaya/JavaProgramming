package ua.org.oa.annabezkrovnaya.task8.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Hall extends Entity<Integer> {
    private String designation;
    private int row;
    private int seat;
    private String format;
    private List<Session> hallSessionList;
    private List<Movie> hallMovieList;
    //private Cinema cinema;

    public Hall(String designation, int row, int seat, String format){
        this.designation = designation;
        this.row = row;
        this.seat = seat;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "designation='" + designation + '\'' +
                ", row=" + row +
                ", seat=" + seat +
                ", format='" + format + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Hall hall = (Hall) o;

        if (row != hall.row) return false;
        if (seat != hall.seat) return false;
        if (designation != null ? !designation.equals(hall.designation) : hall.designation != null) return false;
        return format != null ? format.equals(hall.format) : hall.format == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (designation != null ? designation.hashCode() : 0);
        result = 31 * result + row;
        result = 31 * result + seat;
        result = 31 * result + (format != null ? format.hashCode() : 0);
        return result;
    }
}
