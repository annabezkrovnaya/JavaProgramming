package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
    private int duration;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String posterUrl;
    private String trailerUrl;
    private String description;

    public Movie(String title, String genre, String country, String ageLimit, String format, int duration,
                 LocalDate startDate, LocalDate finishDate, String posterUrl, String trailerUrl, String description){
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.ageLimit = ageLimit;
        this.format = format;
        this.duration = duration;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.posterUrl = posterUrl;
        this.trailerUrl = trailerUrl;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", ageLimit='" + ageLimit + '\'' +
                ", format='" + format + '\'' +
                ", duration='" + duration + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", posterUrl='" + posterUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        if (duration != movie.duration) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        if (genre != null ? !genre.equals(movie.genre) : movie.genre != null) return false;
        if (country != null ? !country.equals(movie.country) : movie.country != null) return false;
        if (ageLimit != null ? !ageLimit.equals(movie.ageLimit) : movie.ageLimit != null) return false;
        if (format != null ? !format.equals(movie.format) : movie.format != null) return false;
        if (startDate != null ? !startDate.equals(movie.startDate) : movie.startDate != null) return false;
        if (finishDate != null ? !finishDate.equals(movie.finishDate) : movie.finishDate != null) return false;
        if (posterUrl != null ? !posterUrl.equals(movie.posterUrl) : movie.posterUrl != null) return false;
        if (trailerUrl != null ? !trailerUrl.equals(movie.trailerUrl) : movie.trailerUrl != null) return false;
        return description != null ? description.equals(movie.description) : movie.description == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (ageLimit != null ? ageLimit.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (posterUrl != null ? posterUrl.hashCode() : 0);
        result = 31 * result + (trailerUrl != null ? trailerUrl.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
