class Solution {
    public boolean isPrime(int num) {
        if(num <2) return false;
        if(num==2 || num==3) return true;
        if(num%2==0) return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0) return false;
        }return true;
        }
    public boolean completePrime(int num){
        if(num < 10) return isPrime(num);
        String s=String.valueOf(num);
        int n=s.length();
        for(int i=1;i<=n;i++){
            int prefix=Integer.parseInt(s.substring(0,i));
            if(!isPrime(prefix)) return false;
        }
        for(int i=0;i<n;i++){
            int suffix=Integer.parseInt(s.substring(i));
             if(!isPrime(suffix)) return false;
        }return true;
    }
}