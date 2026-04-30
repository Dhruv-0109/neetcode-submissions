class Solution {
    public int maxProfit(int[] prices) {

        
        int len = prices.length;
        int max = 0;

        if (prices == null || len <= 1 ) 
            return 0;
        
        int buy = prices[0];

        for(int i=1; i<len; i++)
        {
            int sell = prices[i];
            
            if(buy>sell)
                buy = sell;
            
            else
            {
                int profit = sell - buy;

                max = Math.max(max,profit);

            }
        }

        return max;


        
    }
}
