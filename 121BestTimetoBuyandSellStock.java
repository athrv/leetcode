/* Kadane's Algorithm */

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1; i<prices.length; i++) {
            if(prices[i]<buy) {
                buy=prices[i];
            } else if(prices[i]-buy>profit) {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}

/* Dynamic Programming */
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minBuy=prices[0];
        for(int i=1; i<prices.length; i++) {
            int cost=prices[i]-minBuy;
            profit=Math.max(profit, cost);
            minBuy=Math.min(minBuy, prices[i]);
        }
        return profit;
    }
}
