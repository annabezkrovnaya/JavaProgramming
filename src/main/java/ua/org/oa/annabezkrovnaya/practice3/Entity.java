package ua.org.oa.annabezkrovnaya.practice3;

import lombok.Data;

@Data
public abstract class Entity<T> { //class for key realization in generic storage
    private T id;
}
