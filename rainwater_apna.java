public class rainwater_apna {
    
    public static int trappedrainwater(int height[]){
        int n = height.length; 
        //calculate left max boundary -array
         int leftmax[] = new int[n];
         leftmax[0] = height[0];
         for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
         }

         //calculate right max boundary-array
         int rightmax[] = new int[n];
         rightmax[n-1] = height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
         } 
         
         int trapped_water=0;
       
         
         //loop

         for(int i=0;i<n;i++){
            //waterLeval= Math.min(leftmax,rightmax)
           int waterLeval = Math.min(rightmax[i],leftmax[i]);
        
            //trapped_water = waterLeval = height[i]
            trapped_water += waterLeval - height[i];
        }
         
         return trapped_water;


    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Traped Water : " + trappedrainwater(height));

    }
}
