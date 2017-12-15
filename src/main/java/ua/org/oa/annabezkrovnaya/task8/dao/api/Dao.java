package ua.org.oa.annabezkrovnaya.task8.dao.api;

import ua.org.oa.annabezkrovnaya.task8.model.Entity;
import java.util.List;

public interface Dao <K, T extends Entity<K>> {

    List<T> getAll();

    T getById(K key);

    void save(T entity);

    void delete(K key);

    void update(T entity);
}
