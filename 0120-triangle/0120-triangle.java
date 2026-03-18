class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int h=triangle.size();
        int[][] dp=new int[h+1][h+1];
        for(int l=h-1;l>=0;l--){
            for(int i=0;i<=l;i++){
                dp[l][i]=triangle.get(l).get(i)+Math.min(dp[l+1][i],dp[l+1][i+1]);
            }
        }return dp[0][0];
    }
}