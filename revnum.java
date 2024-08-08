/*How to reverse any positive number by simple while loop
  formula --> reverse = lastdigit + (reverse*10)....while(n>0)
   n/=10;
  */
import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while (n>0) { 
            rev =  (rev*10) + (n%10); 
            n/=10;
        }
    System.out.print(rev);

    }
}
