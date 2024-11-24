import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main17{
    public static void main(String args[]){
        
        try{
            File f1 = new File("Sanskruti.txt");
            Scanner r = new Scanner(f1);
            
            while(r.hasNextLine()){
                String data = r.nextLine();
                System.out.println(data);
            }
            
            r.close();
            
        }catch(FileNotFoundException e){
            System.out.println("An Error Occured .");
            e.printStackTrace();
        }
    }
}