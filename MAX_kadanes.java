/* Code for finding maximum sum in subarray 
   using kadanes algorihm
   int ms = -(infinity)
   int cs =0;
   for( i =0;i<num.length;i++){
   cs = cs + num[i];
   if(cs<0)
   {
   cs=0;
   }
   ms = Math.max(cs,ms);
   }
 */ 
public class MAX_kadanes{
    public static void kadanes(int num[])
   {
       int ms = Integer.MIN_VALUE;
       int cs = 0; 
       for(int i=0;i<num.length;i++){
        cs = cs + num[i];
        if(cs<0){
            cs =0;
        }
        ms = Math.max(ms,cs);
       }
       System.out.println("Maximu Sum : " + ms);
   }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
