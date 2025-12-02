class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int start=0,lar=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            while(set.contains(a)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(a);
            lar=Math.max(lar,i-start+1);
        }return lar;
    }
}