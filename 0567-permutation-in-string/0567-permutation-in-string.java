class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] one=new int[26];
        int[] two=new int[26];
        for(int i=0;i<s1.length();i++){
            one[s1.charAt(i)-'a']++;
            two[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(one,two)) return true;
        for(int i=s1.length();i<s2.length();i++){
            two[s2.charAt(i)-'a']++;
            two[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(one,two)) return true;
        }return false;
    }
}