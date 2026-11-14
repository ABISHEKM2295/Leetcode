class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int k=l;k<=r;k++){
            int tot=0;
            for(int i=0;i<k;i++){
                tot+=nums.get(i);
            }
            if(tot>0) ans=Math.min(ans,tot);
            int j=0;
            for(int i=k;i<nums.size();i++){
                tot-=nums.get(j++);
                tot+=nums.get(i);
                if(tot>0) ans=Math.min(ans,tot);
            }
        }return ans==Integer.MAX_VALUE?-1:ans;
    }
}