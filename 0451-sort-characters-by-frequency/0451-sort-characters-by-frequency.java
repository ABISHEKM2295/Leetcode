class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        while(map.size()>0){
        int max=0;
        char val='\0';
        for(char num:map.keySet()){
            if(map.get(num)>max){
                max=map.get(num);
                val=num;
            }
        }
        while(max!=0){
            sb.append(val);
            max--;
        }
        map.remove(val);
        }return sb.toString();
    }
}