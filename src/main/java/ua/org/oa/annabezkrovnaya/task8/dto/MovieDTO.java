package ua.org.oa.annabezkrovnaya.task8.dto;

import ua.org.oa.annabezkrovnaya.task8.model.Entity;

public class MovieDTO extends Entity<Integer> {

    private String title;
    private String description;
    private int duration;

    public MovieDTO() {
    }

    public MovieDTO(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                "} ";
    }

}
