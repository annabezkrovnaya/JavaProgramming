package ua.org.oa.annabezkrovnaya.task4_1;


import com.google.common.collect.ComparisonChain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Computer implements Comparable<Computer> {
    private String name;
    private double price;


    @Override
    public int compareTo(Computer computer) {
        return ComparisonChain.start()
                .compare(price, computer.price)
                .compare(name, computer.name)
                .result();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}




