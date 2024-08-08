/*prime number login 01
  iterate loop i = 2 to i = n-1 
  if n % i==0 found 
  then not prime 
  otherwise prime


  prime number login 02
  iterate loop i = 2 to i = Math.sqrt(n) 
  if n % i==0 found 
  then not prime 
  otherwise prime
 */

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number N :");
        int n = sc.nextInt();

        boolean isPrime = true;
        if(n==2){
            System.out.println("N is Prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
        }

        if(isPrime==true){
            System.out.println("N is Prime");
        }else{
            System.out.println("N is Not Prime");
        }
    }
}
