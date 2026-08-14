class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,max=0,st=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
            if(map.get(ch)>=2){
                while(map.get(ch)>=2){
                    char ab=s.charAt(l);
                    map.put(ab,map.getOrDefault(ab,0)-1);
                    l++;
                }
            }
            }
                map.put(ch,map.getOrDefault(ch,0)+1);
                max=Math.max(max,r-l+1);
            
        }return max;
    }
}