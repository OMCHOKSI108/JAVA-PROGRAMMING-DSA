/*Best time to buy and sell stock to make max profit
  max profit  = low price buy -->>>> max price sell

  leetcode famous problme 99.34% beats  
  1ms , Time Complexity - O(N)
  My Code
  
 */

class MAXstockProfit {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; 
            } else {
          
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
         
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};
        System.out.println("MAX PROFIT : " + maxProfit(stock));

    }

}