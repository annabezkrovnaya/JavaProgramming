package ua.org.oa.annabezkrovnaya.task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Book implements Serializable{
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return author + ";" + title + ";" + year;
    }
}
