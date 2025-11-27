class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq=new int[k];
        freq[0]=1;
        int count=0,mod=0,sum=0;
        for(int num:nums){
            sum+=num;
            mod=sum%k;
            if(mod<0) mod+=k;
            count+=freq[mod];
            freq[mod]++;
        }return count;
    }
}