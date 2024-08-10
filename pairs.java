/*print pairs of element in array
 if arr[] = {1,2,3,4,5}
 then output: 
 
(1,2) (1,3) (1,4) (1,5) 
(2,3) (2,4) (2,5) 
(3,4) (3,5) 
(4,5) 
 
 */


public class pairs {
  public static void printPairs(int number[]){
    for(int i=0;i<number.length;i++){
        int curr = number[i];
        for(int j=i+1;j<number.length;j++)
        {
            System.out.print("("+curr+","+number[j]+") ");
        }
        System.out.println();
    }
  }
    public static void main(String[] args) {
        int numbers[] = { 14,10,9,8,5};
        printPairs(numbers);

    }
}
