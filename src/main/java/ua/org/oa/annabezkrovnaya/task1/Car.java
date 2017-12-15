package ua.org.oa.annabezkrovnaya.task1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

    private String brand;
    private String color;
    private int mileage;
    private int price;

    Car(String brand, String color, int mileage, int price) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(brand).append(" *** ").append(color).append(" *** ").append(mileage).
                append(" miles ").append(" *** ").append(price).append("$"));
    }
}
