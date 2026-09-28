class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:map.values()){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int val=-1;
        for(int num:nums){
            int a=map.get(num);
            int b=m.get(a);
            if(b==1){
                val=num;
                break;
            }
        }return val;
    }
}