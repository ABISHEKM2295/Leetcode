class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        int max=0;
        for(String a:wordDict){
            max=Math.max(max,a.length());
            set.add(a);
        }
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=Math.max(0,i-max);j--){
                if(dp[j] && set.contains(s.substring(j,i))) dp[i]=true;
            }
        }return dp[s.length()];
    }
}