class Solution {
    public int fsum(int n){
        int temp=n,sum=0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }return sum;
    }
    public  int fpro(int n){
        int temp=n,pro=1;
        while(temp>0){
            pro*=temp%10;
            temp/=10;
        }return pro;
    }
    public boolean checkDivisibility(int n) {
        int sum=fsum(n);
        int pro=fpro(n);
        int val=sum+pro;
        return (n%val)==0;
    }
}