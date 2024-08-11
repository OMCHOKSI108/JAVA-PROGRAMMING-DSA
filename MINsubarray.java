/* Code for finding minimum sum in subarray 
   same subarray logic 
   BRUTEFORCE LOGIC
 */ 
public class MINsubarray {
    public static void printSubarray(int num[])
    {
        int Currsum = 0;
        int Minsum = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
           
            int start =i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                Currsum = 0;
                for(int k=start;k<=end;k++)
                {
                   Currsum+=num[k];
                }
                  
                System.out.println(Currsum);
            }
            if(Minsum > Currsum)
            {
                Minsum = Currsum;
            }
            System.out.println();
        }
        System.out.println("Minimum Sum of Subarray :" + Minsum );
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,6,2,1};
        printSubarray(numbers);
    }
}
