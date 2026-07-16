class Solution {
    public int nod(int a){
        int c=0;
        while(a!=0){
            c++;
            a/=10;
        }return c;
    }
    public int seq(int n){
        int a=0,rem=0,c=1;
        while(a < n){
            rem=rem*10+c;
            c++;
            a++;
        }return rem;
    }
    public int one(int n){
        int rem=0,a=0;
        while(a < n){
            rem=rem*10+1;
            a++;
        }return rem;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li=new ArrayList<>();
        int s=nod(low);
        int e=nod(high);
        int num=seq(s);
        while(num <= high){
            if(num >= low ) li.add(num);
            int curr=nod(num);
            if(num%10==9){
                num=seq(curr+1);
            }else {
            num+=one(curr);
            }
        }return li;
    }
}