import java.io.File; 
 
public class Delete_Main {
    public static void main(String[] args)
    {
        File Obj = new File("ucantrustme.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                               + Obj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
    }
}