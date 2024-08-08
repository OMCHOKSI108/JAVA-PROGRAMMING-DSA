/*   n=5
 x x x x x
 x       x
 x       x
 x x x x x
 */
import java.util.Scanner;

class printpattern {
 public static void printpattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
               if(i == 1 || i == n || j==1 || j==n ){
                  System.out.print("x ");      
               } else{
                   System.out.print(" ");
               }
        }
        System.out.println();
    }
 }

    public static void main(String args[]) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        sc.close();
        
    }
}
