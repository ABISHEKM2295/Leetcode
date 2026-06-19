class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        int[] f=new int[26];
        int count=0,ans=0;
        for(int i=0;i<3;i++){
            f[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f[i]==1) count++;
        }
        if(count==3) ans++;
        for(int i=3;i<s.length();i++){
            count=0;
            if(f[s.charAt(i-3)-'a']>0) f[s.charAt(i-3)-'a']--;
            f[s.charAt(i)-'a']++;
            for(int j=0;j<26;j++){
                if(f[j]==1) count++;
            }
            if(count==3) ans++;
        }return ans;
    }
}