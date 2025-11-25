class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%10==2 || k%10==5) return -1;
        int val=0;
        for(int i=0;i<k;i++){
             val=(val*10+1)%k;
             if(val%k==0) return i+1;
        }return -1;
    }
}