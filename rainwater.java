/*Famous rainwater trapping problem 
  leetcode
  HARD 

  100% beats and 0ms Timecomplexity -O(N)
 
 */

public class rainwater {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

 int l = 0, r = height.length - 1;
        int l_max = 0, r_max = 0;
        int total_water = 0;

        while (l< r) {
            if (height[l] <= height[r]) {
                if (height[l] >= l_max) {
                    l_max = height[l];
                } else {
                    total_water += l_max - height[l];
                }
                l++;
            } else {
                if (height[r] >= r_max) {
                    r_max = height[r];
                } else {
                    total_water += r_max - height[r];
                }
                r--;
            }
        }

        return total_water;
    }
    //okay 17:44
    
    public static void main(String[] args) {
  
 
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Test case 1: " + trap(height1)); // Expected output: 6

       
        int[] height2 = {4,2,0,3,2,5};
        System.out.println("Test case 2: " + trap(height2)); // Expected output: 9
        
        int[] height3 = {4,2,0,6,3,2,5};
        System.out.println("Test case 3: " + trap(height3)); // Expected output: 9
    }
}
