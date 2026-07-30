class Solution {
    public boolean issame(int[] sf,int[] pf){
        for(int i=0;i<26;i++){
            if(sf[i]!=pf[i]) return false;
        }return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li=new ArrayList<>();
        if(p.length() > s.length()) return li;
        int[] sf=new int[26];
        int[] pf=new int[26];
        for(int i=0;i<p.length();i++){
            pf[p.charAt(i)-'a']++;
        } 
        int l=0;
        for(int r=0;r<s.length();r++){
            sf[s.charAt(r)-'a']++;
            if(r-l+1 > p.length()){
                sf[s.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1 == p.length()){
                if(issame(sf,pf)) li.add(l);
            }
        }return li;
    }
}