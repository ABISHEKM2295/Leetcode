class Solution {
    public boolean canPartition(int[] nums) {
        int tot=0;
        for(int num:nums){
            tot+=num;
        }
        if(tot%2!=0) return false;
        int need=tot/2;
        boolean[] b=new boolean[need+1];
        b[0]=true;
        for(int num:nums){
            for(int i=need;i>=num;i--){
                b[i]=b[i] | b[i-num];
                if(b[need]) return true;
            }
        }return b[need];
    }
}