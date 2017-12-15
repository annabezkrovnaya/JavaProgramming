package ua.org.oa.annabezkrovnaya.practice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NameRating {
    private int ratingPosition;
    private String maleName;
    private String femaleName;

    @Override
    public String toString() {
        return "Rating position: " + ratingPosition +
                ", male name - " + maleName +
                ", female name - " + femaleName;
    }
}
