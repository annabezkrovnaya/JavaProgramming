package ua.org.oa.annabezkrovnaya.practice1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ArraySum {

    public int [] arr;
    public int sum;

    public static int sum(Integer[] array){//returns sum of numbers from array
        int sum = 0;
        for (Integer anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }

    ArraySum(int[] arr){
        this.arr = arr;
    }

    public void sum(){
        for (Integer anArray : arr){//returns sum of numbers from array that realized in constructor
            sum = sum + anArray;
        }
    }
}
