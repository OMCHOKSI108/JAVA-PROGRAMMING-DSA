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
                    System.out.print(num[k]+ ",");
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
