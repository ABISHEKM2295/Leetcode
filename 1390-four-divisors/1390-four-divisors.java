class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=1,tot=0;
        for(int n:nums){
            int flag=1;
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    flag++;
                    if(flag>4) break;
                    sum+=i;
                }
            }
            if(flag==4){
                tot+=sum;
            }
            sum=1;
        }return tot;
    }
}