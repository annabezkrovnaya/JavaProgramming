package ua.org.oa.annabezkrovnaya.practice3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Session {

    private LocalTime time;
    private Hall hall;
    private Movie movie;
}
