import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        try {
          
            File file = new File("Sanskruti.txt");

             if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.err.println("File already exists.");
            }

         
            FileWriter obj1 = new FileWriter(file);
        
            obj1.write("Files in Java might be tricky, but this works!");

             obj1.close();

            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
