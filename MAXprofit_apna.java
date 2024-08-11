/*Best time to buy and sell stock to make max profit
  max profit  = low price buy -->>>> max price sell

  leetcode famous problme 99.82 beats  
  1ms , Time Complexity - O(N)
  Code apna college
  
 */

 class MAXprofit_apna {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;  //+(infinity)
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
           return maxProfit;
     }

    public static void main(String[] args) {
        int stock[] = {7,1,5,3,6,4};
        System.out.println("MAX PROFIT : " + maxProfit(stock));

    }

}