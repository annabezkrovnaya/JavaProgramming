package ua.org.oa.annabezkrovnaya.practice1;


public class ArrayProd {

    public static int prod(Integer[] arrayProd){//returns product of numbers from array
        int prod = 1;
        for(Integer anArrayProd : arrayProd){
            prod = prod * anArrayProd;
        }
        return prod;
    }
}
