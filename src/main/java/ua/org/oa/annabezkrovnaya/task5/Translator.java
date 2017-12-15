package ua.org.oa.annabezkrovnaya.task5;


import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.nio.file.NotDirectoryException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Setter
@Getter
public class Translator {

    private File directory; //directory object
    private Map<String, String> vocab;
    private StringBuilder stringBuilder;

    //reads file
    public String readFile(String path) {
        stringBuilder = new StringBuilder();
        String readText = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
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

    //check if object is a directory, get necessary file and put values to the map
    public Map<String, String> getVocabularyMap(String fromLanguage, String toLanguage) throws FileNotFoundException, NotDirectoryException {
        String vocabulary = null;
        vocab = new HashMap<>();
        setDirectory(new File("src/main/resources/vocabularies")); //initialized directory object
        if (directory.exists()) {
            File[] fileList = getDirectory().listFiles();
            if (fileList != null) {
                for (File file : fileList) {
                    if (file.getName().contains(fromLanguage)) {
                        vocabulary = readFile(file.getPath());
                        String[] split = vocabulary.split("\\n");
                        for (int i = 0; i < split.length; i++) {
                            String[] temp = split[i].split("\\s=\\s");
                            vocab.put(temp[0], temp[1]);
                        }
                    } else if (file.getName().contains(toLanguage)) {
                        vocabulary = readFile(file.getPath());
                        String[] split1 = vocabulary.split("\n");
                        for (int i = 0; i < split1.length; i++) {
                            String[] temp = split1[i].split("\\s=\\s");
                            vocab.put(temp[1], temp[0]);
                        }
                    }
                    else throw new FileNotFoundException("The dictionary you need is not found");
                }
            }
            else throw new FileNotFoundException("This directory hasn't files");
        }
        else throw new NotDirectoryException(directory.getName() + " isn't exist");

        return vocab;
    }

    //translate text from file
    public void translate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input path to file that you want to translate:");
        String path = reader.readLine();
        System.out.println("Please, input with first three letters a language do you want to translate from. (For ex.: Eng):");
        String fromLanguage = reader.readLine();
        System.out.println("Please, input with first three letters a language do you want to translate to. (For ex.: Rus):");
        String toLanguage = reader.readLine();

        StringBuilder translatedText = new StringBuilder();

        String textForTranslate = readFile(path).replaceAll("[.?,]", "");
        //System.out.println(textForTranslate);
        String [] arrayForTranslation = textForTranslate.toLowerCase().split("\\s");
        //System.out.println(Arrays.toString(arrayForTranslation));
        Map<String, String> currentVocabulary = getVocabularyMap(fromLanguage, toLanguage);
        for (int i = 0; i < arrayForTranslation.length; i++){
            if(currentVocabulary.containsKey(arrayForTranslation[i])){
                String key = arrayForTranslation[i];
                arrayForTranslation[i] = currentVocabulary.get(key);
            }
            else arrayForTranslation[i] = arrayForTranslation[i];
            translatedText.append(arrayForTranslation[i]).append(" ");
        }
        System.out.println(translatedText.toString());
    }
}
