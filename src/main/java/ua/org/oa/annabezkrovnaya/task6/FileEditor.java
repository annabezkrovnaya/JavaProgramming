package ua.org.oa.annabezkrovnaya.task6;


import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public class FileEditor {

    private File file;
    private final String DIRECTORY = "src/main/resources/FileDirectory";

    //создаёт файл
    private void createFile(String fileName){
        File dir = new File(DIRECTORY);
        if(dir.isDirectory()){
            file = new File(DIRECTORY + "/" + fileName);
            try
            {
                boolean created = file.createNewFile();
                if(created){
                    System.out.println("File create successfully");
                }
                else System.out.println("Can't create file. Check if your file name is correct");
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        else System.out.println("Directory does not exist. Please, check your path");
    }

    //переименовывает файл
    private void renameFile(String oldName, String newName){
        file = new File(DIRECTORY + "/" + oldName);
        File newFile = new File(DIRECTORY + "/" + newName);
        if(file.exists()){
            boolean renamed = file.renameTo(newFile);
            if (renamed){
                System.out.println("File rename successfully");
            }
            else System.out.println("Can't create file. Check if your file name or path is correct");
        }
    }

    //удаляет файл
    private void deleteFile(String fileName){
        file = new File(DIRECTORY + "/" + fileName);
        boolean deleted = file.delete();
        if (deleted){
            System.out.println("File delete successfully");
        }
        else System.out.println("Can't delete file. Check if your file path is correct");

    }
    //отображает все файлы внутри папки
    private void outputFilesFromDirectory(){
        File dir = new File(DIRECTORY);
        if(dir.isDirectory()) {
            if (dir.listFiles() != null) {
                for (File item : dir.listFiles()) {
                    if (item.isDirectory()) {
                        System.out.println(item.getName() + "  \tdirectory");
                    } else {
                        System.out.println(item.getName() + "\tfile");
                    }
                }
            }
        }
        else System.out.println("Directory is empty");
    }


    public void workWithConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Please, input file name:");
            String name = reader.readLine();
            System.out.println("Please input a command for work with directory or file:");
            String command = reader.readLine();
            switch (Command.valueOf(command)) {
                case CREATE:
                    createFile(name);
                    break;
                case RENAME:
                    System.out.println("Input new name you want:");
                    String name2 = reader.readLine();
                    renameFile(name, name2);
                    break;
                case DELETE:
                    deleteFile(name);
                    break;
                case LIST:
                    outputFilesFromDirectory();
                    break;
                default:
                    System.out.println("You input wrong command. Please see the list:");
                    for (Command commands : Command.values()) {
                        System.out.println(commands.name());
                    }
                    break;
            }
            System.out.println("Do you want continue? Y/N");
        }while(!reader.readLine().equals("N"));
        reader.readLine();
    }
    enum Command{
        CREATE, RENAME, DELETE, LIST
    }
}
