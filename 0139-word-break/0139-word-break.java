class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        int maxlen=0;
        for(String a:wordDict){
            maxlen=Math.max(maxlen,a.length());
            set.add(a);
        }
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-maxlen);j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }return dp[n];
    }
}