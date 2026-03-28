class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pref=0,res=0;
        for(int n:nums){
            pref+=n;
            if(map.containsKey(pref-k)){
                res+=map.get(pref-k);
            }
            map.put(pref,map.getOrDefault(pref,0)+1);
        }return res;
    }
}