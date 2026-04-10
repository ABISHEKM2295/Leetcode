class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0;
        for(int num:prices){
            if(num < min){
                min=num;
            }else{
                max=Math.max(max,num-min);
            }
        }return max;
    }
}