package ua.org.oa.annabezkrovnaya.task6;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class BookKeeper {

    private StringBuilder stringBuilder;
    private Map<Integer, Book> bookMap;
    private Integer index = 1;
    private final String ORIGINAL_FILE = "src/main/resources/books.txt";
    private final String TEMPORARY_FILE = "C:/Users/terra/IdeaProjects/programmingptoctxvii()/src/main/resources/book_serialized.txt";

    //метод, который читает из файла
    public String readFile(){
        stringBuilder = new StringBuilder();
        String readText = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ORIGINAL_FILE), "UTF-8"))) {
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

    //create object and put to collection
    public Map<Integer, Book> getBookCollection(){
        String text = readFile();
        String[]textElements = text.split("\\n");
        //System.out.println(Arrays.toString(textElements));
        bookMap = new HashMap<>();
        for (int i = 0; i < textElements.length; i++){
            String[]objectProperties = textElements[i].split(";");
            bookMap.put(index++, new Book(objectProperties[1], objectProperties[0], Integer.parseInt(objectProperties[2])));
        }
        return bookMap;
    }

    //метод, добавляющий объект book  в файл (+ сериализация)
    public void addObjectToFile(String title, String author, int year){
        Book book = new Book(title, author, year);

        //serialization
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TEMPORARY_FILE)))
            {
                oos.writeObject(book);
                System.out.println("The record was made");
            }
        catch(Exception ex){
                System.out.println(ex.getMessage());
            }

        //deserialization
        Book newBook = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TEMPORARY_FILE)))
        {
            newBook = (Book) ois.readObject();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        //writing to file
        try {
            FileWriter writer = new FileWriter(ORIGINAL_FILE, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            if (newBook != null) {
                bufferWriter.write(newBook.toString()+"\n");
            }
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
