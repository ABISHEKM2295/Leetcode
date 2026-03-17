class Solution {
    public int maxVowels(String s, int k) {
        String v="aeiou";
        int l=0,res=0,count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(v.contains(""+ch)) count++;
        }
        res=Math.max(res,count);
        for(int i=k;i<s.length();i++){
            if(v.contains(""+s.charAt(l))) count--;
            l++;
            if(v.contains(""+s.charAt(i))) count++;
            res=Math.max(res,count);
        }return res;
    }
}