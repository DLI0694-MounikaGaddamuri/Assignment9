package ExceptionHandlingWithResourceCleanUp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingWithResourceCleanUp {
    public static void main(String[] args) {
        File file = new File("src/ExceptionHandlingWithResourceCleanUp/input.txt");
        try{
            file.createNewFile();
            System.out.println("File created");
        }catch(IOException e){System.out.println(e);}

        try(BufferedReader reader = new BufferedReader(new FileReader("src/ExceptionHandlingWithResourceCleanUp/input.txt"))){
            String line;
            while((line= reader.readLine())!=null)
                System.out.println(line);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
