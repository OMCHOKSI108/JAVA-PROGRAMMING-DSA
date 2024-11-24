import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;



public class File3 {
   public static void main(String[] args) {
    
    File3 F = new File3();
    F.newfile();
   }   
   void newfile(){

      String name ="";
      String path ="";

      try {
         BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter File name  : ");
         name  = br.readLine();
         System.out.println("Enter Path : ");
         path = br.readLine();
         
         FileOutputStream fos = new FileOutputStream(path + " " + name +".txt");




      } catch (Exception e) {
      }
   }
}
