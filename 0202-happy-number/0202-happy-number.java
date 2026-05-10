class Solution {
    public int compute(int n){
        int res=0;
        while(n!=0){
            res+=(n%10)*(n%10);
            n/=10;
        }return res;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=compute(slow);
            fast=compute(fast);
            fast=compute(fast);
        }while(slow!=fast);
        return slow==1;
    }
}