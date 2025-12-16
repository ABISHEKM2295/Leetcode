class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
           int[] count=new int[26];
            for(char ch:s.toCharArray()){
                count[ch-'a']++;
          }
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<26;i++){
            sb.append(count[i]).append("#");
          }
           String val=sb.toString();
           if(!map.containsKey(val)){
            map.put(val,new ArrayList<>());
           } map.get(val).add(s);
        }return new ArrayList<>(map.values());
    }
}