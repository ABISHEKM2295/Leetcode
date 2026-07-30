class Solution {
    public int minimumPushes(String word) {
        int div=word.length()/8;
        int rem=word.length()%8;
        int k=1,ans=0;
        for(int i=1;i<=div;i++){
            ans+=k*8;
            k++;
        }
        ans+=k*rem;
        return ans;
    }
}