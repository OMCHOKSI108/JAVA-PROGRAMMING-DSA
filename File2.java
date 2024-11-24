import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class File2 {
   public static void main(String[] args) {
       
    File2 voidfile = new File2();

       voidfile.voidFile();   

   }
   
    void voidFile(){
      String path = "";
      String name = "";

      try {
          
  
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      

       System.out.println("Enter File path : ");
       path = br.readLine();
       System.out.println("Enter File Name : ");
       name= br.readLine();

      
       File f1  = new File(path+" " + name +".txt ");
       f1.createNewFile();

      } 
      catch (Exception e) {

         System.out.println("An Error Occured....");
      }    
   }
}


