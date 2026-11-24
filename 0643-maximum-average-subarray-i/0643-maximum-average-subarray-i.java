class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,res=Integer.MIN_VALUE;
        int l=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i+1 == k){
                res=Math.max(res,sum/k);
            }
            if(i+1 > k){
                sum-=nums[l++];
                res=Math.max(res,sum/k);
            }
        }return res;
    }
}