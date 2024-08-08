import java.util.Scanner;

class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
          f = f*i;
        }
        
        return f; 
      }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int f1 = sc.nextInt();
    System.out.println("factorial Of given Integer is " + fact(f1));

   }    
}
