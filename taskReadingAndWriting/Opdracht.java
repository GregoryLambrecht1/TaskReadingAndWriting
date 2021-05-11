package taskReadingAndWriting;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Opdracht {
    public static void main(String[] args) {
        Path path = Paths.get("../../FromGregoryToPearl");
        Path path2 = Paths.get("../../FromGregoryToPearl/message.txt");
        Path path3 = Paths.get("../../FromGregoryToPearl/animal.txt");

        //making the file if not exist
        if (Files.notExists(path)) {
            try {
                Files.createDirectory(path);
                Files.createFile(path2);
                Files.createFile(path3);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //writing the joke to the file
        try{
            FileWriter fileWriter = new FileWriter("../../FromGregoryToPearl/message.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("het is blauw en het weegt niet veel? licht blauw ha ha ha");
        }catch (IOException e){
            e.printStackTrace();
        }
        //reading the joke from the file
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("../../FromGregoryToPearl/message.txt"));
            String line;
            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //writing the animal to the file
        Animal animal = new Animal("bob", true);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("../../FromGregoryToPearl/animal.txt"));
            objectOutputStream.writeObject(animal);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}