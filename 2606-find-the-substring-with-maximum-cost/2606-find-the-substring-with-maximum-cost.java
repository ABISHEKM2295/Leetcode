class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            char ch=(char)(i+97);
            map.put(ch,i+1);
        }
        for(int i=0;i<chars.length();i++){
            char ch=chars.charAt(i);
            map.put(ch,vals[i]);
        }
        int end=0,res=0,currsum=0;
        while(end < s.length()){
            currsum+=map.get(s.charAt(end));
            if(currsum< 0 ){
                currsum=0;
            }
            res=Math.max(res,currsum);
            end++;
        }return res;
    }
}