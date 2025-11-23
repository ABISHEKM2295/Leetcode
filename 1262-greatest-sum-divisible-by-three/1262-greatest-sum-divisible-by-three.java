class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp=new int[3];
        for(int num:nums){
            int[] temp=dp.clone();
            for(int r=0;r<3;r++){
                int newsum=temp[r]+num;
                dp[newsum%3]=Math.max(dp[newsum%3],newsum);
            }
        }return dp[0];
    }
}