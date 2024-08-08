
import java.util.Scanner;


class Function{ 
    public static void printHello() {
        System.out.println("hello, World");
        System.out.println("Hello World");
    }

    public static int calc(int a1, int a2) {
        return a1 + a2;
    }

    public static int product(int b1, int b2) {
        return b1 * b2;
    }

    public void swap(int a1, int a2) {
        int temp;
        temp = a1;
        a1 = a2;
        a2 = temp;
    }

    public static int sumArray(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum; // Add return statement to return the sum
    }

    public static int factorial(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f = f*i;
      }
      
      return f; 
    }
    public static float bino(int n,int r){
       int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        float bino;
        bino =  ((fact_n)/(fact_r))/fact_nmr;
        return bino;
    }

    // public static int sum(int a1,int a2){
    //   return a1+a2;
    // }
    // public static int sum(int a1,int a2,int a3){
    //   return a1+a2+a3;
    // }
    // public static int sum(int a1,int a2,int a3,int a4){
    //   return a1+a2+a3+a4;
    // }
    
     public static float sum(float a,float b){
      return a+b;
     }
     public static float sum(float a,float b,float c){
      return a+b+c;
     }
  
  //Methon-01
    
    //  public static boolean isprime(int n){
    //   if(n==2){
    //     return true;
    //   }
    //   for(int i=2;i<=n-1;i++){
    //     if(n % i ==0){
    //      return false;
    //     }
    //   }
    //   return true;
    //  }

 //Method-02 optimized
  public static boolean isprime(int n){
        if(n==2){
          return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i ==0){
              return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // printHello();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter two Numbers: ");

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int sum = calc(n1, n2);
        // System.out.println("Sum of Two is: " + sum); // Changed to println for better output formatting
        // int p = product(n1, n2);
        // System.out.println("Multiplication: " + p); // Changed to println for better output formatting

        // System.out.println("Enter Size of Array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size]; // Corrected array declaration
        // System.out.println("Enter Array Elements: ");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int sum1 = sumArray(arr, size); // Corrected the way array is passed

        // System.out.println("Sum Of all array Elements: " + sum1); // Changed to println for better output formatting
      // System.out.print("Enter F to find A factorial :  ");
      // int F = sc.nextInt();
      // long Fac = factorial(F);
      //   System.out.println("Factortial Of n is  : " + Fac);

    // System.out.print("Enter n & r You want to find nCr : ");
    // int fnn = sc.nextInt();
    // int rnn = sc.nextInt();
    //  float nCr = bino(fnn, rnn);
    //  System.out.println("Binomial theoram of Given integer is " + nCr); 
     // System.out.println(sum(10,24,26,30));
    //  System.out.println(sum(40.1f,48.2f));  
    //  System.out.println(sum(40.1f,48.2f,20.41f));  
    
     int np = sc.nextInt();
     boolean check = isprime(np);
     System.out.println("Prime check status  : " + check);
     
  
  
  }
}