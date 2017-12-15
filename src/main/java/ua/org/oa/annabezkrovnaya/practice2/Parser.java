package ua.org.oa.annabezkrovnaya.practice2;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class Parser {

    List<NameRating> nameRatings;
    List<Notebook> notebooks;

    private final String regex1 = "<td>(?<rating>(\\d)+)<\\/td><td>(?<maleName>(\\w){2,20})<\\/td><td>(?<femaleName>(\\w){2,20})<\\/td>"; //regex for name ratings parser

    private final String regex2 = "class=\"item_name?.+>(?<name>([Ноутбук\\sA-z0-9()-])+)<\\/a>?.+<p class=\"description\">(?<description>(.)+)<br \\/>[\\S\\s]+?<span class=\"price cost\">(?<price>([\\d{4,5}\\sгрн])+)<\\/span><br \\/>"; //regex for notebook parser

    public List<NameRating> parserForNames(String pathname){//name rating parser

        File file = new File(pathname);
        nameRatings = new ArrayList<>();
        String fullText = readFile(file,"UTF-8");

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(fullText);

        while (matcher.find()){
            nameRatings.add(new NameRating(Integer.parseInt(matcher.group("rating")), matcher.group("maleName"), matcher.group("femaleName")));
        }
        return nameRatings;
    }

    public List<Notebook> parserForNotebooks(String path){//notebook parser

        File file = new File(path);
        notebooks = new ArrayList<>();
        String full = readFile(file, "windows-1251");

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(full);

        while (matcher.find()){
            notebooks.add(new Notebook(matcher.group("name"), matcher.group("description"), matcher.group("price")));
        }
        return notebooks;
    }

    public String readFile(File fileName, String charset) {//file reader

        StringBuilder stringBuilder = new StringBuilder();
        String readText = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charset))) {
            while ((readText = reader.readLine()) != null) {
                stringBuilder.append(readText).append("\n");
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("We are sorry, but the read file has different encoding");

        } catch (IOException e) {
            System.out.println("We can't read you file. Check the pathname, please");
        }
        return stringBuilder.toString();
    }
}
