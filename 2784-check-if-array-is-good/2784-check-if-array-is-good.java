class Solution {
    public boolean isGood(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int count=0,j=1;
        int n=nums.length;
        for(int a:map.keySet()){
            if(j!=a) return false;
            j++;
            count++;
        }
        if(count!=n-1) return false;
        for(int val:map.keySet()){
            if(val!=n-1 && n!=1){
                if(map.get(val)!=1) return false;
            }else{
                if(map.get(val)!=2) return false;
            }
        }return true;
    }
}