package CheckedAndUnchecked;

import java.io.*;

public class CheckedAndUnchecked {



    public static void main(String[] args) {
        //Checked Exception - FileNotFound
        //Unchecked Exception - NullPointerException

        try{
            File file = new File("src/CheckedAndUnchecked/destination.txt");
            if(file.createNewFile())
                System.out.println(file.getName()+" created");
        }catch (IOException e) {e.printStackTrace();}

        try(BufferedReader br = new BufferedReader(new FileReader("src/CheckedAndUnchecked/source.txt"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("src/CheckedAndUnchecked/destination.txt"))) {
            String line;
            try {
                while ((line = br.readLine()) != null)
                    wr.write(line);

                wr.write(line);
            }catch(NullPointerException e){
                System.out.println("File reached end");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not present");
        }
        catch (IOException e) {throw new RuntimeException(e);}


    }

    }
