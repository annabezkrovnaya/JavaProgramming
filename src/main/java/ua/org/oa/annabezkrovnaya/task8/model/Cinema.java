package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Cinema extends Entity<Integer> {

    private String name;
    private String address;
    private String planUrl;
    private Set<Hall> hallSet;
    private List<Movie> movieList;
    private Set<User> userSet;
    private List<Session> sessionList;

    public Cinema(String name, String address, String planUrl){
        this.name = name;
        this.address = address;
        this.planUrl = planUrl;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", planUrl='" + planUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cinema cinema = (Cinema) o;

        if (name != null ? !name.equals(cinema.name) : cinema.name != null) return false;
        if (address != null ? !address.equals(cinema.address) : cinema.address != null) return false;
        if (planUrl != null ? !planUrl.equals(cinema.planUrl) : cinema.planUrl != null) return false;
        if (!hallSet.equals(cinema.hallSet)) return false;
        if (!movieList.equals(cinema.movieList)) return false;
        if (!userSet.equals(cinema.userSet)) return false;
        return sessionList.equals(cinema.sessionList);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (planUrl != null ? planUrl.hashCode() : 0);
        result = 31 * result + hallSet.hashCode();
        result = 31 * result + movieList.hashCode();
        result = 31 * result + userSet.hashCode();
        result = 31 * result + sessionList.hashCode();
        return result;
    }
}
