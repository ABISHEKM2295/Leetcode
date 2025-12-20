class Solution {
    public int isLexi(String[] strs,int i){
        for(int j=1;j<strs.length;j++){
            if(strs[j].charAt(i) < strs[j-1].charAt(i)) return 1;
        }return 0;
    }
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0;i<strs[0].length();i++){
            ans+=isLexi(strs,i);
        }return ans;
    }
}