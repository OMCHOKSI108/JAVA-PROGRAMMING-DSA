/*check if input number is even or odd using ternary operator 
 * (confition)  ? print true : print false
 */
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     
     System.out.print("Enter a number yiu want to check  : ");
     int number = sc.nextInt();
     String ans = (number%2==0)?"even":"odd";
     System.out.println(ans);
    }
}
