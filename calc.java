import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("make choices from '+'','-','/','%','*'");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println(a+b);
            break;

            case '-': System.out.println(a-b);
            break;

            case '/': System.out.println(a/b);
            break;

            case '*': System.out.println(a*b);
            break;

            case '%': System.out.println(a%b);
            break;

            default : System.out.println("Not Found any match");
        }


        
    }
}
