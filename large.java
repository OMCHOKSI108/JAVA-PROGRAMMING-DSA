/* Find the largest of three numbers using if else 
 first we check a > b && a>c if not than a is not max
 then we check between b and c using else if and else. 
 
 */
import java.util.Scanner;

class large {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter Three Numbers  : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a +" is the largest");
        }
        else if(b>=c){
            System.out.println(b +" is the largest");
 
        }
        else{
            System.out.println(c +" is the largest");
 
        }
    }
}
