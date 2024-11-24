
import java.io.FileWriter;
import java.io.IOException;

public class Main20 {
   public static void main(String[] args) {
       try {
        FileWriter writer = new FileWriter("ucantrustme.txt");
        writer.write("Hii, nothing only hiii Sanskruti...");
        writer.close();
        System.out.println("Successfully written..");
           
       } catch (IOException e) {
        System.out.println("A Error Occured..");
        e.printStackTrace();
       }
   }    
}
