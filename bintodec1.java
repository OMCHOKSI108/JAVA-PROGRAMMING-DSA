/*Decimal To Binary Conversion 
 Dec = Dec + (reminder * math.pow(10,pow));
 pow++;
 n = n/10;
   
 
 By Om Choksi 23aiml010;
 */
import java.util.Scanner;

class bintodec1 {
    public static int dec(int n)
    {
       int pow = 0;
       int  DecNum =0;
        while(n>0)
        {
            int rem = n%2;
            DecNum = DecNum + (rem * (int)Math.pow(2,pow));
            pow++;

        }

       return DecNum;
    }
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter BinaryNum : ");
     int binNum = sc.nextInt();
     int dec = dec(binNum);
     System.out.println(dec);
 }    
}
