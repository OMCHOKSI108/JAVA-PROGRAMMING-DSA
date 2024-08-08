/* Code by Om Choksi 
Decimal --->> binary

bin = bin + rem*10^pow
  
 */

import java.util.Scanner;

public class dectobin {
 
    public static int dectobin(int n) {
        int bin = 0;
        int mul = 1;  
        
        while(n > 0){
            int rem = n % 2;
            bin = bin + rem * mul;
            n = n / 2;
            mul = mul*10;  
        }
        
        return bin;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int dec=sc.nextInt();
      
        
        int bin = dectobin(dec);
        System.out.println("Decimal: " + dec + " -> Binary: " + bin);
    }
}
