package ua.org.oa.annabezkrovnaya.task8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entity<T> {
    private T id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity<?> entity = (Entity<?>) o;

        return getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
