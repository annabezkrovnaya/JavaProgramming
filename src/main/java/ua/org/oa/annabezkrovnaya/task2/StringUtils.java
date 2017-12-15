package ua.org.oa.annabezkrovnaya.task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {


    public String invertStringFirst(String initialString){//inverts string with reverse() method

        StringBuilder stringBuilder = new StringBuilder(initialString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public String invertStringSecond(String s){//inverts string with cycle

        char[] charArray = s.toCharArray();
        StringBuilder glue = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            glue.append(charArray[i]);
        }
        return glue.toString();
    }

    public boolean checkPalindrome(String s){//determines whether the string is a palindrome

        String original = s.replaceAll("[\\W\\s]","");
        StringBuilder stb = new StringBuilder(original);
        stb.reverse();
        String checked = stb.toString();
        return original.equalsIgnoreCase(checked);
    }

    public String changeStringForLength(String s){//checks string's length and if it more than ten, cuts to six chars, otherwise adds 'o' to twelve chars length

        String result = s;
        if(s.length() > 10) result = result.substring(0,6);
        else {
            for (int i = 0; i < 12 - s.length(); i++){
                result = result.concat("o");
            }
        }

        return result;
    }

    public String changeWordsPlace(String s)throws DeficiencyWordException{//replaces first and last word in string
        String [] array = s.split(" ");
        int arrayLength = array.length;
        if(arrayLength <= 1) throw new DeficiencyWordException("Your string must contain more than one word");
        String temp = array[arrayLength - 1];
        String replaced = array[0];
        array[0] = temp;
        array[arrayLength - 1] = replaced;
        StringBuilder clips = new StringBuilder();
        for(int i = 0; i < arrayLength; i++){
            clips.append(array[i]).append(" ");
        }
        return clips.toString().trim();
    }

    public String replaceWordsInEverySentence(String s) throws DeficiencyWordException {//replaces first and last word in every sentence(separation only with '.')
        String [] sentences = s.split("\\.\\s");
        int arrayLength = sentences.length;
        if(arrayLength <= 1) throw new DeficiencyWordException("Your string must contain more than one sentence separated by full stops");
        for (int i = 0; i < sentences.length; i++){
            String[] temp = sentences[i].split("\\s");
            String t = temp[temp.length - 1];
            String r = temp[0];
            temp[0] = t;
            temp[temp.length - 1] = r;
            StringBuilder prov = new StringBuilder();
            for (int j = 0; j < temp.length; j++){
                prov.append(temp[j]).append(" ");
            }
            sentences[i] = prov.toString().trim();
        }
        StringBuilder gluing = new StringBuilder();
        for (int y = 0; y < sentences.length; y++){
            gluing.append(sentences[y]).append(". ");
        }
        return  gluing.toString().trim();
    }

    public boolean checkStringSymbols(String s){//checks if string contains only 'abc' symbols
        Pattern pattern = Pattern.compile("[abc]*");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public boolean checkSetFormatDate(String s){//determines if string is a date of MM.DD.YYYY format
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("(\\d{1,2}\\.\\d{1,2}\\.\\d{4})");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()){
            stringBuilder.append(s);
            final DateFormat DATE_FORMAT = new SimpleDateFormat("MM.dd.yyyy");
            String date = stringBuilder.toString();
            try {
                return DATE_FORMAT.format(DATE_FORMAT.parse(date)).equals(date);
            }catch (ParseException e){
                return false;
            }
        }
        else return false;
    }

    public boolean checkMail(String s){//determines if string is an e-mail
        Pattern pattern = Pattern.compile("([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public String [] checkPhoneNumbers(String s) throws DeficiencyWordException {//finds every phone number(+Х(ХХХ)ХХХ-ХХ-ХХ) and returns them as an array
        Pattern pattern = Pattern.compile("(\\+\\d{1}\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2})");
        Matcher matcher = pattern.matcher(s);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        if (list.size() < 1) throw new DeficiencyWordException("Your text has no phone numbers");
        String[] phones = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            phones[i] = list.get(i);
        }
        return phones;
    }
}
