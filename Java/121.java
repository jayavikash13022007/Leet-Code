class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0],total = 0;
        for(int i = 0; i < prices.length; i++){
            total = prices[i] - min;
            max = Math.max(max,total);
            if(prices[i] < min) min = prices[i];
        }
        return max;
    }
}