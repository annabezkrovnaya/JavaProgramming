package ua.org.oa.annabezkrovnaya.practice3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class Movie extends Entity<Integer> {

    private String title;
    private String genre;
    private String country;
    private String ageLimit;
    private String format;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String posterUrl;
    private String trailerUrl;
    private String description;

    Movie(String title, String genre, String country, String ageLimit, String format){
        this.title = title;
        this.country = country;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", ageLimit='" + ageLimit + '\'' +
                ", format='" + format + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        if (genre != null ? !genre.equals(movie.genre) : movie.genre != null) return false;
        if (country != null ? !country.equals(movie.country) : movie.country != null) return false;
        if (ageLimit != null ? !ageLimit.equals(movie.ageLimit) : movie.ageLimit != null) return false;
        if (format != null ? !format.equals(movie.format) : movie.format != null) return false;
        if (!startDate.equals(movie.startDate)) return false;
        if (!finishDate.equals(movie.finishDate)) return false;
        if (!posterUrl.equals(movie.posterUrl)) return false;
        if (!trailerUrl.equals(movie.trailerUrl)) return false;
        return description.equals(movie.description);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (ageLimit != null ? ageLimit.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + startDate.hashCode();
        result = 31 * result + finishDate.hashCode();
        result = 31 * result + posterUrl.hashCode();
        result = 31 * result + trailerUrl.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }
}
