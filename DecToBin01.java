/*Decimal To Binary Conversion 
 bin = bin + reminder * math.pow(10,pow);
 pow++;
 n = n/2;
   
 
 By Om Choksi 23aiml010;
 */

import java.util.Scanner;

class DecToBin01 {
    public static int bin(int n)
    {
       int pow = 0;
       int  binNum =0;
        while(n>0)
        {
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }

       return binNum;
    }
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Decimal : ");
     int binNum = sc.nextInt();
     int dec = bin(binNum);
     System.out.println(dec);
 }    
}
