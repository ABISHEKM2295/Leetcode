class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        long ans=0;
        int n=nums.length;
        Arrays.sort(nums);
        int m=n/2;
        if(nums[m]<k){
            for(int i=m;i<n;i++){
                if(nums[i] < k){
                    ans+=(k-nums[i]);
                }
            }
        }else{
            for(int i=0;i<=m;i++){
                if(nums[i]> k){
                    ans+=(nums[i]-k);
                }
            }
        }return ans;
    }
}