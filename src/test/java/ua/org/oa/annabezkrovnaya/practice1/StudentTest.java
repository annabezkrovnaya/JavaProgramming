package ua.org.oa.annabezkrovnaya.practice1;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentTest {

    static Student student;

    @BeforeClass
    public static void setUp() throws Exception {
        student = new Student("Dirk Gently", "programming", 2);
        student.addMark("Programming", 1, 1, 5);
        student.addMark("Programming", 1, 2, 4);
        student.addMark("Programming", 2, 1, 5);
        student.addMark("Programming", 2, 2, 3);
        student.addMark("English", 1, 1, 4);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        student = null;
        System.out.println("Testing is over");
    }

    @Test
    public void addMark() throws Exception {
        String actual = student.addMark("English", 2, 1, 4).toString();
        String expected = new Exam("English", 4, 2,1).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeMark() throws Exception {
        String actual = student.removeMark("English", 1, 1).toString();
        String expected = new Exam("English", 0, 1,1).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void removeException() throws Exception{
        student.removeMark("Ukrainian", 2, 2);
    }

    @Test
    public void getMaxSubjectMark() throws Exception {
        int actual = student.getMaxSubjectMark("Programming");
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfExamsWithSetMark() throws Exception {
        int actual = student.getNumberOfExamsWithSetMark(5);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageScore() throws Exception {
        double actual = student.getAverageScore(1,1);
        double expected = 4.5;
        Assert.assertEquals(expected, actual, 0.01);
    }

}