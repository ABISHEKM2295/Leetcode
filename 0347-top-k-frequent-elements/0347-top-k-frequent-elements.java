class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=0;
        while(k-- > 0){
        int max=0,val=nums[0];
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                val=key;
            }
        }
        arr[n++]=val;
        map.remove(val);
        }return arr;
    }
}