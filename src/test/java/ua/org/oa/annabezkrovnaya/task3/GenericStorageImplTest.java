package ua.org.oa.annabezkrovnaya.task3;

import org.junit.*;

import static org.junit.Assert.*;

public class GenericStorageImplTest {

    private static GenericStorage<String> genericStorage;

    @Before
    public void createObjectAndArray(){
        genericStorage = new GenericStorageImpl<>(String.class);
        genericStorage.getDataClass().getName();
        genericStorage.add("Java");
        genericStorage.add("C#");
        genericStorage.add("C");
        genericStorage.add("Python");

    }
    @After
    public void removeObject(){
        genericStorage = null;
    }

    @Test
    public void add() throws Exception {
        Assert.assertTrue(genericStorage.add("C++"));
    }

    @Test
    public void get() throws Exception {
        String actual = genericStorage.get(0);
        String excepted = "Java";
        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void update() throws Exception {
        String[] actual = genericStorage.delete("C");
    }

    @Test
    public void delete() throws Exception {
        String [] actual = genericStorage.delete(1);
        String [] expected = new String[]{"Java","C","Python",null, null, null, null, null, null};
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void delete1() throws Exception {
      String [] actual = genericStorage.delete("C");
      String [] expected = new String[]{"Java", "C#", "Python", null, null, null, null, null, null};
      Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void getAll() throws Exception {
        String[] actual = genericStorage.getAll();
        String[] expected = new String[]{"Java", "C#", "C", "Python", null, null, null, null, null, null};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getArrayLength() throws Exception {
        int actual = genericStorage.getArrayLength();
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addException(){
        genericStorage.add("111");
        genericStorage.add("111");
        genericStorage.add("111");
        genericStorage.add("111");
        genericStorage.add("111");
        genericStorage.add("111");
        genericStorage.add("111");

    }

}