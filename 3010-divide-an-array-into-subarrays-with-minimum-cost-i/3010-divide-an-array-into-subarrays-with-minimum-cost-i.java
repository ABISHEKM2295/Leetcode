class Solution {
    public int minimumCost(int[] nums) {
        int tot=nums[0];
        nums[0]=0;
        Arrays.sort(nums);
        tot+=nums[1]+nums[2];
        return tot;
    }
}