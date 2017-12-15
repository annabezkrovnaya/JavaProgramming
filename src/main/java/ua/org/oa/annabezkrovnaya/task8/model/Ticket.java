package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
public class Ticket {

    private LocalDate currentDate;
    private LocalTime currentTime;
    private String currentMovieTitle;
    private int currentRow;
    private int currentSeat;
    private double currentPrice;
    private double currentDiscount;
    private int currentBonus;
    private String tempQRUrl;

    public Ticket(LocalDate date){
        this.currentDate = date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "currentDate=" + currentDate +
                ", currentTime=" + currentTime +
                ", currentMovieTitle='" + currentMovieTitle + '\'' +
                ", currentRow=" + currentRow +
                ", currentSeat=" + currentSeat +
                ", currentPrice=" + currentPrice +
                ", currentDiscount=" + currentDiscount +
                ", currentBonus=" + currentBonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (currentRow != ticket.currentRow) return false;
        if (currentSeat != ticket.currentSeat) return false;
        if (Double.compare(ticket.currentPrice, currentPrice) != 0) return false;
        if (Double.compare(ticket.currentDiscount, currentDiscount) != 0) return false;
        if (currentBonus != ticket.currentBonus) return false;
        if (currentDate != null ? !currentDate.equals(ticket.currentDate) : ticket.currentDate != null) return false;
        if (!currentTime.equals(ticket.currentTime)) return false;
        if (!currentMovieTitle.equals(ticket.currentMovieTitle))
            return false;
        return tempQRUrl.equals(ticket.tempQRUrl);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = currentDate != null ? currentDate.hashCode() : 0;
        result = 31 * result + currentTime.hashCode();
        result = 31 * result + currentMovieTitle.hashCode();
        result = 31 * result + currentRow;
        result = 31 * result + currentSeat;
        temp = Double.doubleToLongBits(currentPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(currentDiscount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + currentBonus;
        result = 31 * result + tempQRUrl.hashCode();
        return result;
    }
}
