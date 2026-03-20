class Solution {
    public int maxProfit(int[] p) {
        int min = Integer.MAX_VALUE, profit = 0;
        for(int x : p){
            min = Math.min(min, x);
            profit = Math.max(profit, x - min);
        }
        return profit;
    }
}