class Solution {
    public void fun(String digits, int idx, List<String> res, Map<Character,String> map,StringBuilder sb){
        if(idx==digits.length()){
            res.add(sb.toString());
            return;
        }
        String s=map.get(digits.charAt(idx));
        for(char ch:s.toCharArray()){
            sb.append(ch);
            fun(digits, idx+1 , res, map,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        fun(digits , 0 , res, map,new StringBuilder());
        return res;
    }
}