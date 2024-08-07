package TryWithResourcesWithMultipleResources;

import java.io.*;

public class TryWithResourcesWithMultipleResources {
    public static void main(String[] args) {
        File file1 = new File("src/TryWithResourcesWithMultipleResources/file1.txt");
        try{
            if(file1.createNewFile())
                System.out.println(file1.getName()+" created");
        }catch(IOException e){e.printStackTrace();}

        File file2 = new File("src/TryWithResourcesWithMultipleResources/file2.txt");
        try{
            if(file2.createNewFile())
                System.out.println(file2.getName()+" created");
        }catch(IOException e){e.printStackTrace();}

        File destination_file = new File("src/TryWithResourcesWithMultipleResources/destination.txt");
        try{
            if(destination_file.createNewFile())
                System.out.println(destination_file.getName()+" created");
        }catch(IOException e){e.printStackTrace();}

        try(BufferedReader reader1 = new BufferedReader(new FileReader("src/TryWithResourcesWithMultipleResources/file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("src/TryWithResourcesWithMultipleResources/file2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/TryWithResourcesWithMultipleResources/destination.txt"))){

            String line;
            while((line=reader1.readLine())!=null) {
                writer.write(line);
                writer.write("\n");
            }

            writer.write("\n");

            while((line= reader2.readLine())!=null) {
                writer.write(line);
                writer.write("\n");
            }
        }
        catch(IOException e){e.printStackTrace();}

    }
}
