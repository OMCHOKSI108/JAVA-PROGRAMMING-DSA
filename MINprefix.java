/* Code for finding minimum sum in subarray 
   same subarray logic 
   PREFIX LOGIC

   1st we need to create a prefix array 1
    int prefix[] = new int[num.length];
    prefix[0] = num[0];
    for(int i=0;i<prefix.length;i++){
        prefix[i] = prefix[i-1] + num[i];
    } 
        
    
    in inner loop we have start =i and end = j;
    Currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
 */ 
public class MINprefix {
    public static void printSubarray(int num[])
    {
        int Currsum = 0;
        int Minsum = Integer.MAX_VALUE;
        int prefix[] = new int[num.length];
        
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
          prefix[i] = prefix[i-1] + num[i];
        }


        for(int i=0;i<num.length;i++)
        {
            int start =i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                 Currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];             
               
            }
            if(Minsum > Currsum)
            {
                Minsum = Currsum;
            }
 
        }
        System.out.println("Minimum Sum of Subarray :" + Minsum );
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,6,2,1};
        printSubarray(numbers);
    }
}
