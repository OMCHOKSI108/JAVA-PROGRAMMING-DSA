

/*print subarrays
 if arr[] = {4,5,6,2,1}
 then output:
4 
4 5 
4 5 6 
4 5 6 2 
4 5 6 2 1 

5 
5 6 
5 6 2 
5 6 2 1 

6 
6 2 
6 2 1 

2 
2 1 

1 

Total Subarray : 15
 

and print total number of subarray ts
Total subarrays  = (n*(n+1)) / 2; 
 */

 public class subarray {
    public static void printSubarray(int num[])
    {
        int ts=0;
        for(int i=0;i<num.length;i++)
        {
           
            int start =i;
            for(int j=i;j<num.length;j++)
            {
                int end =j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(num[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray : " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {4,5,6,2,1};
        printSubarray(numbers);
    }
}
