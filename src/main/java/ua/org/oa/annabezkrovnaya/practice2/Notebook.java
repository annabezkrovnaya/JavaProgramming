package ua.org.oa.annabezkrovnaya.practice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notebook {

    private String title;
    private String description;
    private String price;

    @Override
    public String toString() {
        return "Notebook " + title + " *** " +
                description + " *** " +
                " price - " + price;
    }
}
