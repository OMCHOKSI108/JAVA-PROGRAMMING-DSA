/*Conditional If Else in java are used as below 
'if()'' , 'else if()' and 'else'
 * 
 */
import java.util.Scanner;

class conditional{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Age : ");
         int age = sc.nextInt();
         if(age >= 18 ){
            System.out.println("You Are Adult ...");

         }
         else if(age > 12 && age < 18){
            System.out.println("You are teenager");


         } 
         else{
            System.out.println("Not Adult ..");
         }
    }
}