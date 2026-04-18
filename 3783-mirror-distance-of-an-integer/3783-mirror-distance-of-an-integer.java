class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int val=0;
        while(temp>0){
            int rem=temp%10;
            val=val*10+rem;
            temp/=10;
        }
        return Math.abs(val-n);
    }
}