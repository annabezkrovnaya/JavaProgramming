package ua.org.oa.annabezkrovnaya.task8.mapper;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

public final class BeanMapper {

    private static BeanMapper beanMapper = new BeanMapper();
    private static Mapper mapper;

    private BeanMapper() {
        mapper = new DozerBeanMapper();
    }

    public static synchronized BeanMapper getInstance() {
        if (beanMapper == null) {
            beanMapper = new BeanMapper();
        }
        return beanMapper;
    }

    public static <T> T singleMapper(Object from, Class<T> toClass) {
        T map = mapper.map(from, toClass);
        return map;
    }

    public static <E, T> List<T> listMapToList(Iterable<E> iterable, Class<T> toClass) {

        List<T> list = new ArrayList<T>();

        for (E e : iterable) {
            list.add(mapper.map(e, toClass));
        }
        return list;
    }
}
