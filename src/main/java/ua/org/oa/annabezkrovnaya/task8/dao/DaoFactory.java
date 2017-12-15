package ua.org.oa.annabezkrovnaya.task8.dao;

import ua.org.oa.annabezkrovnaya.task8.dao.api.Dao;
import ua.org.oa.annabezkrovnaya.task8.dao.impl.MovieDaoImpl;
import ua.org.oa.annabezkrovnaya.task8.helper.PropertyHolder;
import ua.org.oa.annabezkrovnaya.task8.model.Movie;


public class DaoFactory {

    private static DaoFactory instance = null;

    private Dao<Integer, Movie> movieDao;

    private DaoFactory(){
        loadDaos();
    }



    public static DaoFactory getInstance(){
        if(instance == null){
            instance = new DaoFactory();
        }
        return instance;
    }

    private void loadDaos() {
        if(PropertyHolder.getInstance().isInMemoryDB()){

        }else{
            movieDao = MovieDaoImpl.getInstance();
        }
    }

    public Dao<Integer, Movie> getMovieDao() {
        return movieDao;
    }

    public void setMovieDao(Dao<Integer, Movie> movieDao) {
        this.movieDao = movieDao;
    }
}
