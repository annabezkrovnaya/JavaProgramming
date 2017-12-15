package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class Session extends Entity<Integer> {
    private LocalTime startTime;
    private double price;
    private double discount;
    private Set<Hall> currentHallSet;
    //private List<Movie> currentMovieList;

    public Session(LocalTime startTime, double price, double discount){
        this.startTime = startTime;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Session{" +
                "startTime=" + startTime +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Session session = (Session) o;

        if (Double.compare(session.price, price) != 0) return false;
        return startTime != null ? startTime.equals(session.startTime) : session.startTime == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
