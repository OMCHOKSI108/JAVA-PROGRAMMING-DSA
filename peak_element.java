
/*
 Integer.MAX_VALUE = +(infinity)
 Integer.MIN_VALUE = -(infinity)
 */
public class peak_element {
   
   public static int largest(int number[]){
    int largest = Integer.MIN_VALUE;  // largest = -(infinity)
    for(int i=0;i<number.length;i++)
    {
        if(number[i]>largest){
            largest = number[i];
        }
    }
    return largest;

   }
    public static void main(String[] args) {
        int numbers[] = {4,9,32,20,19};
        System.out.println("Largest element is " + largest(numbers));
 
    }
}
