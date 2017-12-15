package ua.org.oa.annabezkrovnaya.task3;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;

@Getter
@Setter
public class GenericStorageImpl<T> implements GenericStorage<T> {
    private T [] array;
    private int arrIndex = 0;

    //workarounds with using additional method getDataClass
    @SuppressWarnings("unchecked")
    public GenericStorageImpl (Class<T> tClass){
        array = (T[]) Array.newInstance(tClass, 10);
    }
    @SuppressWarnings("unchecked")
    public GenericStorageImpl (Class<T> tClass, int size){
        array = (T[]) Array.newInstance(tClass, size);
    }

    @Override
    public Class<?> getDataClass() {
        return array.getClass();
    }


    @Override
    public boolean add(T obj) {//adds object into end of storage
        if (arrIndex < array.length) {
            array[arrIndex++] = obj;
        }
        else throw new IndexOutOfBoundsException("You can't add any other element, because array is full. Create other object or change existing");

        return true;
    }

    @Override
    public T get(int index) {//returns object by index
        return array[index];
    }

    @Override
    public boolean update(int index, T obj) {//changes element by index but in case asked element exist
        if(array[index]!= null){
            array[index] = obj;
        }

        return true;
    }

    @Override
    public T[] delete(int index) {//deletes element by index in case asked element exist and remove empty cell
        if(array[index]!= null) {
            array = ArrayUtils.removeElement(array, array[index]);
        }

       return array;
    }

    @Override
    public T[] delete(T obj) {//deletes asked object and remove empty cell
        return array = ArrayUtils.removeElement(array, obj);


    }

    @Override
    public T[] getAll() {//gets all array's elements
        return array;
    }

    @Override
    public int getArrayLength() {//gets current filled array length
        int count = 0;
        for (T anArray : array) {
            if (anArray != null) {
                count++;
            }
        }
        return count;
    }
}
