class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minv=Integer.MAX_VALUE;
        int l=0,sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                minv=Math.min(minv,r-l+1);
                sum-=nums[l];
                l++;
            }
        }return minv==Integer.MAX_VALUE?0:minv;
    }
}