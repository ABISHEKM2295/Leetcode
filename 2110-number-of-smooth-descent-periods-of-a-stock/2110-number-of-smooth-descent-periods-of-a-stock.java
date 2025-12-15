class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=1,count=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1){
                count+=1;
            }else{
                count=1;
            }
            res+=count;
        }return res;
    }
}