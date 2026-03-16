class Solution {
    public int maxOperations(int[] nums, int k) {
        int res=0;
        int l=0,r=nums.length-1;
        Arrays.sort(nums);
        while(l<r){
            if(nums[l]+nums[r]==k){
                res++;
                l++;
                r--;
            }else if(nums[l]+nums[r]>k){
                r--;
            }else{
                l++;
            }
        }return res;
    }
}