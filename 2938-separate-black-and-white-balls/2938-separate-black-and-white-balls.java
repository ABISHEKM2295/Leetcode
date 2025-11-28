class Solution {
    public long minimumSteps(String s) {
        char ch[]=s.toCharArray();
        long tone=0,count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1') tone++;
        }
        for(int i=ch.length-1;i>=0;i--){
            int sum=1;
            if(ch[i]=='1') tone--;
            else{
                sum*=tone;
                count+=sum;
            }
        }return count;
    }
}