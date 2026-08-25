class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        int val=k,ans=0;
        int i=0;
        while(i<=100){
            if(!s.contains(val)){ ans=val; break;}
            val+=k;
            i++;
        }return ans;
    }
}