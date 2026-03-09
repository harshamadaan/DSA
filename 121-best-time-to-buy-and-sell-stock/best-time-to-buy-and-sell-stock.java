class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy_price=prices[0];
        int profit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }else{
                int curr_profit=prices[i]-buy_price;
                profit=Math.max(profit,curr_profit);
            }

        }
        return profit;
        
    }
}