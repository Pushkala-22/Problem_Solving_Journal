class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int r=0;
        for(int i=1;i<prices.length;i++)
        {
            m=Math.min(m,prices[i]);
            r=Math.max(r,prices[i]-m);
        }
        return r;
        
    }
}