import java.util.Scanner;
class hollowpattern 
{
    public static void printpattern(int n)
    {
           for(int i=1;i<=n-1;i++)
           {
              
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n-1){System.out.print("x ");}
                
            }
      
              System.out.println("x");
            
              
            
           }
    }
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n : ");
       int n = sc.nextInt();
      printpattern(n);

   }    
}
