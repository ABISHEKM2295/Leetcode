class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,maxw=0,maxf=0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(r)-'A']);
            int winl=r-left+1;
            if(winl-maxf > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            winl=r-left+1;
            maxw=Math.max(maxw,winl);

        }return maxw;
    }
}