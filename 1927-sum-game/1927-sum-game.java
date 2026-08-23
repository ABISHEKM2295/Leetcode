class Solution {
    public double exp(char ch){
        return ch=='?'?4.5:ch-'0';
    }
    public boolean sumGame(String num) {
        int n=num.length();
        double ans=0.0;
        for(int i=0;i<n/2;i++){
            ans+=exp(num.charAt(i));
        }
        for(int i=n/2;i<n;i++){
            ans-=exp(num.charAt(i));
        }return ans!=0.0;
    }
}