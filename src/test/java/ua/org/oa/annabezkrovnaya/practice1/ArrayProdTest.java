package ua.org.oa.annabezkrovnaya.practice1;


import org.junit.Assert;
import org.junit.Test;

public class ArrayProdTest {
    @Test
    public void prod() throws Exception {

        Integer[] arr = {1, 2, 3, 4, 5};
        int actual = new ArrayProd().prod(arr);
        int expected = 120;
        Assert.assertEquals("Check right result of finding array sum", expected, actual, 0);
    }
}
