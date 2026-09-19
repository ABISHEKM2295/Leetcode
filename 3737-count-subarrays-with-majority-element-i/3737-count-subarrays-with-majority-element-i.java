class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                int val=0;
                if(map.containsKey(target)) val=map.get(target);
                if(2*val > j-i+1) c++;
            }
        }return c;
    }
}