class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for(int price : prices){
            buy = Math.min(buy, price);
            max = Math.max(max, price - buy);
        }
        return max;
    }
}
