class hollow_pattern1{
     public static void hollow_pattern(int row,int col)
     {
       //outer loop
       for(int i=1;i<=row;i++)
       {
        for(int j=1;j<=col;j++)
        {
            if(i==1 || j==1 || i==row || j==col)
            {
                System.out.print("*");

            }
           else{

            System.out.print(" ");
        }
    }
        System.out.println();
       }

     }

     
     public static void inverted_half(int n)
     {
            for (int i = 1; i <= n; i++) {
               for(int j=1;j<=n+1-i;j++)
               {
                System.out.print(j);
               }   
               System.out.println();
            }
     }

     
     public static void floyed_triangle(int n1)
     {
       int counter=1;
        for(int i=1;i<=n1;i++)
        {
            for(int j=i;j<=n1;j++)
            {
                System.out.print(counter + " ");
                counter++;
            }
          System.out.println();
        }
     }

      
     public static void triangle_0_1_pattern(int line)
      {
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+ " ");
                }
                else if((i+j)%2!=0) {System.out.print(0 + " ");   }
        }
            System.out.println();
        }
      }


      public static void printpattern(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                   if(i == 1 || i == n-1 || j==1 || j==n ){
                      System.out.print("x ");      
                   } else{
                       System.out.print("  ");
                   }
            }
            System.out.println();
            
        }
     }


      public static void butterfly(int n)

    {
  
         //how many line you want to print for 1st half
        for(int i=1;i<=n;i++)
        {
            //i want to print i number *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //i want to print 2(n-i) space
            for(int j=1 ;j<=2*(n-i);j++)
            {
               System.out.print(" ");
            }

            //again i want to print i number *
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //how many line you want to print 2nd half
        for(int i=n-1;i>0;i--)
        {
            //print i number of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //print 2(n-i) space and 
            for(int j=1 ;j<=2*(n-i);j++)
            {
               System.out.print(" ");
            }
            
            //print i number of *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //new line
            System.out.println();
        }
         
    }
    

    public static void solid_rohombos(int h)
    {
        for(int i=1;i<=h;i++)
        {
            for(int j=h-1;j>=i;j--)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=h;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void hollow_rohombos(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(j==1 || i==1 || j==n || i ==n)
                {
                    System.out.print("*");
                }
                else
                {

                     System.out.print(" ");
                }
                 
            }
         System.out.println();
            
        }
 
    }

    public static void diamond_patter(int n)
     {
           for(int i=1;i<=n;i++)
           {
            for(int j=i;j<=n;j++)
            {
                    System.out.print("  ");     
            }
            
            //Method -01
            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("* ");
            // }
            // for(int j=1;j<i;j++)
            // {
            //     System.out.print("* ");
            // }
            for(int j=1;j<=2*(i)-1;j++)
            {
                System.out.print("* ");
            }
       
            System.out.println();
           }
           for(int i=n-1;i>=1;i--)
           {
            for(int j=i;j<=n;j++)
            {
                    System.out.print("  ");     
            }
            for(int j=1;j<=2*(i)-1;j++)
            {
                System.out.print("* ");
            }
            //Method -01
            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("* ");
            // }
            // for(int j=1;j<i;j++)
            // {
            //     System.out.print("* ");
            // }
       
            System.out.println();
           }
    }
    

    public static void number_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i -1;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }   
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
      public static void main(String args[]) {
      //hollow_pattern(4,5);
      //inverted_half(5);
      //floyed_triangle(5); 
      //printpattern(5);
      //triangle_0_1_pattern(5);
      // butterfly(3);
      // solid_rohombos(5);
      //hollow_rohombos(5); 
      // diamond_patter(5);
      //number_pyramid(5);
      //palindromic_pyramid(5);
    }
}
