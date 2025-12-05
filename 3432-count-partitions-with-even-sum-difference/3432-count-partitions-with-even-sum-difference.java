class Solution {
    public int countPartitions(int[] nums) {
        int count=0,left=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            int right=sum-left;
            if((right%2)==(left%2)) count++;
        }
        return count;
    }
}