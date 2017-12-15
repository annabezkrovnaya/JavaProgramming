package ua.org.oa.annabezkrovnaya.practice5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileUtils {

    public static void createFileWithRandomNumbers(String path, int limit, int startValue, int finishValue){

        //create random numbers
        int[] array = new int[limit];
        for (int i = 0; i < limit; i++){
            for (int j = startValue; j < finishValue; j++){
                array[i] = (int)(Math.random()*(j));
                if(array[i] < startValue) {
                    array[i] = startValue + array[i];
                }
                else if(array[i] > finishValue){
                    array[i] = finishValue - array[i];
                }
            }
        }
        //write into file
        try(FileWriter fileWriter = new FileWriter(new File(path))){
            for (int i = 0; i < array.length; i++){
                fileWriter.write(String.valueOf(array[i]) + "\n");
            }
        }catch (IOException e){
            e.getMessage();
        }
        System.out.println("File was created");
    }

    public static List<Integer> sortNumbers(String path){

        ArrayList<Integer> listInt = new ArrayList<>();
        //read from file and add to ArrayList
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            while (reader.readLine() != null){
                listInt.add(Integer.parseInt(reader.readLine()));
            }
        }catch (IOException e){
            e.getMessage();
        }
        //sort Array List content
        listInt.sort(Integer :: compareTo);
        return listInt;
    }

    public static void checkStudentAverageScore(String path, int setScore) {
        List<Integer> scoreList = null;
        Map<String, List<Integer>> studentMap = new HashMap<>();
        int[] scoresBox = null;
        StringBuilder stringBuilder = new StringBuilder();

        //read strings from file and put to StringBuilder with lambda
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(s -> stringBuilder.append(s).append(";"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //put data from StringBuilder to Map
        String s = stringBuilder.toString();
        String[] studentsArray = s.split(";");

        for (int i = 0; i < studentsArray.length; i++) {
            String name = studentsArray[i].substring(0, studentsArray[i].indexOf('='));
            String scores = studentsArray[i].substring((studentsArray[i].indexOf('=') + 2));
            String[]scoreArray = scores.split(", ");
            scoreList = new ArrayList<>();
            for (int j = 0; j < scoreArray.length; j++){
                scoreList.add(Integer.parseInt(scoreArray[j]));
            }
            studentMap.put(name, scoreList);
        }

        //find average score for each student and get condition satisfying
        studentMap.forEach((key, value) -> {
            if(value.stream().mapToInt(value1 -> value1).average().getAsDouble() >= setScore){
                System.out.println(key);
            }
        });
    }

    public static String changeWordsInStrings(String path){
        StringBuilder sb = new StringBuilder();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(s -> {
                String [] tempArray = s.split("\\s");
                String temp = tempArray[0];
                tempArray[0] = tempArray[tempArray.length - 1];
                tempArray[tempArray.length - 1] = temp;
                StringBuilder forString = new StringBuilder();
                Arrays.stream(tempArray).forEach(a -> forString.append(a).append(" "));
                sb.append(forString.toString()).append("\n");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String changeWordsInSentences(String path){
        StringBuilder textB = new StringBuilder();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(s -> {
                String [] sentenceArray = s.split("[.]\\s");
                StringBuilder sentB = new StringBuilder();
                for (int i = 0; i < sentenceArray.length; i++){
                    String[] wordsArray = sentenceArray[i].split(" ");
                    String temp = wordsArray[0];
                    wordsArray[0] = wordsArray[wordsArray.length - 1];
                    wordsArray[wordsArray.length - 1] = temp;
                    StringBuilder tsb = new StringBuilder();
                    Arrays.stream(wordsArray).forEach(w -> tsb.append(w).append(" "));
                    sentB.append(tsb.toString().trim()).append(". ");
                }
                textB.append(sentB.toString()).append("\n");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textB.toString();
    }

    public static void copyFileContent(String pathFrom, String pathTo){
        try(InputStreamReader isp = new InputStreamReader(new FileInputStream(pathFrom));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(pathTo))) {
            while (isp.ready()){
                osw.write(isp.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileContentBuffered(String pathFrom, String pathTo){
        try (BufferedReader br = new BufferedReader(new FileReader(pathFrom));
             BufferedWriter bw = new BufferedWriter(new FileWriter(pathTo))){
            while (br.ready()) {
                bw.write(br.readLine());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
