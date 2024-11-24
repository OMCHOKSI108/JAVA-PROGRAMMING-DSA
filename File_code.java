import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;




public class File_code {
   public static void main(String args[]) throws IOException{
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter DirPath : ");
    String dirpath = br.readLine();
    System.out.println("Enter DirName :");
    String dirname = br.readLine();

    File f = new File(dirpath,dirname);


    if(f.exists()){
         String arr[] = f.list();
         int n = arr.length;

         for (int i=0;i<n;i++){
             System.out.println(arr[i]);

             File f1 = new File(arr[i]);
            if(f1.isFile()){
                System.out.println(": is a File");
            }
            if(f1.isDirectory()){
                System.out.println(" :is a Directory");
            }
              

         }

         System.out.println("No. of entities in this directory " + n);


    }
    else{
        System.out.println("Directory not found");
    }




   }    
}
