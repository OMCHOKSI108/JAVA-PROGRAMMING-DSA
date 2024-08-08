import java.util.Scanner;

public class arraycc{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int array[] = new int[3];
        array[0] = sc.nextInt(); 
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();


        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
            sc.close();
    }

}