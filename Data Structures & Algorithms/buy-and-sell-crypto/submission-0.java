class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
        }
        return maxProfit;
    }
}
