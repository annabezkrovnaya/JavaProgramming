package ua.org.oa.annabezkrovnaya.task2;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StringUtilsTest {

    StringUtils stringUtils;

    @Before
    public void createObject(){
        stringUtils = new StringUtils();
    }

    @After
    public void cleanObject(){
        stringUtils = null;
    }

    @Test
    public void invertStringFirstPositive() throws Exception {
        String actual = stringUtils.invertStringFirst("Stories of imagination tend to upset those without one");
        String expected = "eno tuohtiw esoht tespu ot dnet noitanigami fo seirotS";
        assertEquals(expected, actual);
    }

    @Test
    public void invertStringSecond() throws Exception {
        String actual = stringUtils.invertStringSecond("Stories of imagination tend to upset those without one");
        String expected = "eno tuohtiw esoht tespu ot dnet noitanigami fo seirotS";
        assertEquals(expected, actual);
    }

    @Test
    public void checkPalindromePositive() throws Exception {
        assertTrue(stringUtils.checkPalindrome("Was it a cat I saw"));
    }

    @Test
    public void checkPalindromeNegative() throws Exception {
        assertFalse(stringUtils.checkPalindrome("I love cats"));
    }

    @Test
    public void changeStringForLengthIfItMoreThenTen()throws Exception{
        String actual = stringUtils.changeStringForLength("It was great");
        String expected = "It was";
        assertEquals(expected, actual);
    }

    @Test
    public void changeStringForLengthIfItLessThenTen() throws Exception{
        String actual = stringUtils.changeStringForLength("Oh-oh");
        String expected = "Oh-ohooooooo";
        assertEquals(expected, actual);
    }

    @Test
    public void changeWordsPlace() throws DeficiencyWordException {
        String actual = stringUtils.changeWordsPlace("It's still magic even if you know how it's done");
        String expected = "done still magic even if you know how it's It's";
        assertEquals(expected, actual);
    }

    @Test(expected = DeficiencyWordException.class)
    public void changeWordsPlaceWithException()throws DeficiencyWordException{
            stringUtils.changeWordsPlace("Java");
    }

    @Test
    public void replaceWordsInEverySentence() throws DeficiencyWordException {
        String actual = stringUtils.replaceWordsInEverySentence("Give a man a fire and he's warm for a day. But set fire to him and he's warm for the rest of his life");
        String expected = "day a man a fire and he's warm for a Give. life set fire to him and he's warm for the rest of his But.";
        assertEquals(expected, actual);
    }

    @Test(expected = DeficiencyWordException.class)
    public void replaceWordsInEverySentenceWithException() throws DeficiencyWordException{
        stringUtils.replaceWordsInEverySentence("Java is enthralling");
    }

    @Test
    public void checkStringSymbolsPositive(){
        assertTrue(stringUtils.checkStringSymbols("abcbcacccaabbbbabcbb"));
    }

    @Test
    public void checkStringSymbolsNegative(){
        assertFalse(stringUtils.checkStringSymbols("aflkbnljeglehjgepo"));
    }

    @Test
    public void checkSetFormatDatePositive(){
        assertTrue(stringUtils.checkSetFormatDate("05.24.2007"));
    }

    @Test
    public void checkSetFormatDateNegative(){
        assertFalse(stringUtils.checkSetFormatDate("24.05.2007"));
    }

    @Test
    public void checkMailPositive(){
        assertTrue(stringUtils.checkMail("terrainc80@gmail.com"));
    }

    @Test
    public void checkMailNegative(){
        assertFalse(stringUtils.checkMail("trertww@fopuw-1332"));
    }

    @Test
    public void checkPhoneNumbers() throws DeficiencyWordException {
        String [] actual = stringUtils.checkPhoneNumbers("mobile phone +7(555)555-55-55, office phone +7(333)333-33-33, support phone +7(888)888-88-88");
        String [] expected = {"+7(555)555-55-55", "+7(333)333-33-33", "+7(888)888-88-88"};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = DeficiencyWordException.class)
    public void checkPhoneNumbersWithException() throws DeficiencyWordException {
        stringUtils.checkPhoneNumbers("There ara no phone numbers");
    }







}