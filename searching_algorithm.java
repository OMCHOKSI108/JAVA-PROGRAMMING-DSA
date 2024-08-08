import java.util.Scanner;
public class searching_algorithm {
    
    public static int liniear_search(int arr[],int key)
    {
     
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==key)
             {
                return i;
             }
         }
         return -1;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.err.print("Enter Size  : ");
        size=sc.nextInt();
       int arr[] = new int[size];
       System.err.print("Enter element all : ");
       for(int i=0;i<size;i++)
       {
        arr[i] = sc.nextInt();
       }
       System.out.print("Enter element you want to search  : ");
       int target = sc.nextInt();

       System.out.println("Your element is on index " + liniear_search(arr, target));
       
    }
}
