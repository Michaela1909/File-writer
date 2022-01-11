import java.util.Random;
import java.io.*;
import java.io.FileWriter;
import java.io.File; 

public class testData {
    public static void main(String[] args) throws IOException {
        
        final int MAX = 10; 
        int value; 
        String fileName = "test.txt";
        Random rand = new Random();
        FileWriter myWriter = new FileWriter(fileName);
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        for (int line=1; line <= MAX; line++){
            for (int num=1; num <= MAX; num++){
                value = rand.nextInt(90) + 10; 
                myWriter.write(value + " ");
            }
            myWriter.write(System.lineSeparator());        
        }
        myWriter.close();
        System.out.println("Output file has been created: " + fileName);

    }
}
