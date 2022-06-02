class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            else if(prices[i] - min > sell){
                sell = prices[i] - min;
            }
        }
        
        
        return sell;
    }
}