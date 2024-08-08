import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int sum=0,i=0;
        while (i <=n) { 
            sum+=i;
            i++;
        } 
        System.out.println("Sum Of " + n + " natural number is "+ sum);

    }
}
