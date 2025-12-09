class Solution {
    public int specialTriplets(int[] nums) {
        long MOD=1000000007L;
        int n=nums.length;
        Map<Integer,Integer> right=new HashMap<>();
        for(int i=0;i<n;i++){
            right.put(nums[i],right.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer> left=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++){
            int val=nums[i];
            long need=(long)val*2;
            right.put(val,right.get(val)-1);
            long leftCount=left.getOrDefault((int)need,0);
            long rightCount=right.getOrDefault((int)need,0);
            ans=(ans+(leftCount*rightCount)%MOD)%MOD;
            left.put(val,left.getOrDefault(val,0)+1);
        }return (int)ans;
    }
}