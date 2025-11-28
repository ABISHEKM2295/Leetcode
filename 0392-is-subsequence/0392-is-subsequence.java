class Solution {
    public boolean isSubsequence(String s, String t) {
        int tlen=t.length();
        int slen=s.length();
        int j=0;
        for(int i=0;i<tlen && j<slen;i++){
            if(t.charAt(i)==s.charAt(j)) j++;
        }return j==slen;
    }
}