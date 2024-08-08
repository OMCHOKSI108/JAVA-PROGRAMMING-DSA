import java.util.Scanner;

public class switch1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter Your choice");
  int ch = sc.nextInt();
  switch(ch) {
      case 1: System.out.println("Samosa");
          
          break;
      case 2: System.out.println("momos");
          
          break; 
      case 3: System.out.println("Sandwich");
          
          break;          
      default:
          System.out.println("We are dreaming ");
  }

 }

}