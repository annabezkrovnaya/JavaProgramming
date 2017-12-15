package ua.org.oa.annabezkrovnaya.practice1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    ArraySum arraySum;
    Integer[] arr;

    @Before
    public void setArraySum(){
        arraySum = new ArraySum();
    }
    @After
    public void arrayClose(){
        arraySum = null;
    }
    @Test
    public void sumPositive() throws Exception {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = new ArraySum().sum(arr);
        int expected = 55;
        assertEquals("Check right result of finding array sum", expected, actual, 0);
    }

    @Test
    public void sumPosUsingField(){
        arr = new Integer[]{1, 2, 3, 4, 5};
        int actual = arraySum.sum(arr);
        int expected = 15;
        assertEquals("Check actual sum", expected, actual, 0);
    }

    @Test(timeout = 100)
    public void sumPerformance() throws Exception {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        new ArraySum().sum(arr);
    }

    @Test(expected = NullPointerException.class)
    public void sumException() throws Exception {
        Integer[] arr = null;
        new ArraySum().sum(arr);
    }
}