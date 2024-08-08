/* if else statment example with income tax calculator by income 
 
 */
import java.util.Scanner;

class ifelsetax {
 public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Youe Income  : ");
    int income = sc.nextInt();
    float tax;
    if(income < 500000){
        tax = 0;
    }
    else if(income>500000 && income <1000000){
        tax  = (int)(income*0.20);
    }
    else{
       tax = (int)(income*0.30);
    }
    System.out.println("Your payble tax is = "+ tax);
 }   
}
