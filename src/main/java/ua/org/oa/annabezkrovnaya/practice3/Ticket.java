package ua.org.oa.annabezkrovnaya.practice3;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private LocalDate date;
    private Session session;
    private Hall seat;
    private Hall row;
    private double price;
    private String barcodeUrl;
}
