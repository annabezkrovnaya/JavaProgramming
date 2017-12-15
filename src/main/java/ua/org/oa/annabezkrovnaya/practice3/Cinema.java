package ua.org.oa.annabezkrovnaya.practice3;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Cinema {

    private String name;
    private String address;
    private String planUrl;
    private Set<Hall> hallSet;
    private List<Movie> movieList;
    private List<User> userList;
    private List<Session> sessionList;

}
