package ua.org.oa.annabezkrovnaya.task8.web;


import ua.org.oa.annabezkrovnaya.task8.dto.MovieDTO;
import ua.org.oa.annabezkrovnaya.task8.service.api.Service;
import ua.org.oa.annabezkrovnaya.task8.service.impl.MovieServiceImpl;

public class App {

    public static void main(String[] args) {
        Service<Integer, MovieDTO> service = MovieServiceImpl.getInstance();
        service.save(new MovieDTO("Star", "film", 180));
        service.getAll().forEach(System.out::println);
    }
}
