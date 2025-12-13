class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Set<String> valid=Set.of( "electronics", "grocery", "pharmacy", "restaurant");
        Map<String,List<String>> map=new HashMap<>();
        for(String line:valid){
            map.put(line,new ArrayList<>());
        }
        String reg="^[A-Za-z0-9_]+$";
        for(int i=0;i<code.length;i++){
            if(!isActive[i]) continue;
            if(!valid.contains(businessLine[i])) continue;
            if(code[i]==null || !code[i].matches(reg)) continue;
            map.get(businessLine[i]).add(code[i]);
        }
         List<String> res = new ArrayList<>();
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};
        for(String line:order){
            List<String>li=map.get(line);
            Collections.sort(li);
            res.addAll(li);
        }
        return res;
    }
}