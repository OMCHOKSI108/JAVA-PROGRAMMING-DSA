//below code is for convert binary number to decimal number by logic 
//decimal = decimal + lastdigit * 2^pow 
import java.util.Scanner;

class bintodec {
    public static int binTodec(int n){
         int  dec =0;
         int pow=0,ld;
         while(n!=0){
            ld = n%10; 
            dec = dec + ld*(int)Math.pow(2,pow);
            n = n/10;          
            pow++;

         }
           return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number :");
        int binnum = sc.nextInt();
        int dec = binTodec(binnum);
        System.out.println("Decimal : " + dec);

    }    
}
