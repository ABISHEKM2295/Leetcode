class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] b=s.split(" ");
        Map<Character,String> map=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        if(pattern.length()!=b.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(b[i])) return false;
            }else{
                map.put(ch,b[i]);
            }
            if(map2.containsKey(b[i])){
                if(!map2.get(b[i]).equals(ch)) return false;
            }else{
                map2.put(b[i],ch);
            }
        }return true;
    }
}