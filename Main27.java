import java.io.File;
import java.io.IOException;

public class Main27 {
  
    public static void main(String[] args) {
        try {
            File file1 = new File("Sanskruti.txt");
            if(file1.createNewFile()){
                System.out.println("File Created : "+ file1.getName());
            }else{

                System.out.println("File Already Exists.");
            }
            
        } catch (IOException e) {

            System.out.println("An Error has occured.");
            e.printStackTrace();
        }
    }
}
