package ua.org.oa.annabezkrovnaya.practice4;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnglishTextUtils {

    Map<String, Integer> stringMap;


    public Map<String, Integer> countWords(String pathname){//counts unique words in the text

        File file = new File(pathname);
        stringMap = new HashMap<>();
        String fullText = readFile(file,"UTF-8");
        String interimText = fullText.replaceAll("(?!\\s)\\W", "");//remove all punctuation
        String workText = interimText.replaceAll("\\s\\n", " ");//remove all line breaks
        String[] wordArray = workText.split("\\s");

        for (int i = 0; i < wordArray.length; i++){
            if(!stringMap.containsKey(wordArray[i])){
                stringMap.put(wordArray[i], 0);
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> stringEntry : stringMap.entrySet()){
            for (int i = 0; i < wordArray.length; i++){
                if(wordArray[i].equals(stringEntry.getKey())){
                    count++;
                    stringEntry.setValue(count);
                }
            }
            count = 0;
        }
        return stringMap;
    }

    /*public Map<String, Integer> sortWithEnumOne(Map<String, Integer> stringMap, Enum currentEnum){

        switch (currentEnum){
            case KEYASCENDING:
                stringMap = stringMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
                break;
            case KEYDESCENDING:
                stringMap = stringMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
                break;
            case VALUEASCENDING:
                stringMap = stringMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
                break;
            case VALUEDESCENDING:
                stringMap = stringMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
        }
        return stringMap;
    }*/

    public Map<String, Integer> sortWithEnum(Map<String, Integer> stringMap, Enum currentEnum){ //sorts unique words with count by enum constant

        Comparator<Map.Entry<String, Integer>> comparator = null;

        switch (currentEnum){
            case KEYASCENDING:
                comparator = Comparator.comparing(Map.Entry :: getKey);
                break;
            case KEYDESCENDING:
                comparator = (((o1, o2) -> o2.getKey().compareTo(o1.getKey())));
                break;
            case VALUEASCENDING:
                comparator = Comparator.comparing(Map.Entry :: getValue);
            case VALUEDESCENDING:
                comparator = (((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        }

        return stringMap.entrySet().stream().sorted(comparator).collect(Collectors.toMap(
                Map.Entry :: getKey,
                Map.Entry :: getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
        ));
    }

    public enum Enum{
        KEYASCENDING, VALUEASCENDING, KEYDESCENDING, VALUEDESCENDING;
    }

    public String readFile(File fileName, String charset) {//file reader

        StringBuilder stringBuilder = new StringBuilder();
        String readText = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charset))) {
            while ((readText = reader.readLine()) != null) {
                stringBuilder.append(readText).append("\n");
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("Sorry, but file has different encoding");

        } catch (IOException e) {
            System.out.println("Can't read file. Check the pathname, please");
        }
        return stringBuilder.toString();
    }
}
