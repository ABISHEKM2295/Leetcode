class Solution {
    public int maxDepth(String s) {
        int c=0,max=0;
        for(char a:s.toCharArray()){
            if(a=='(') c++;
            else if(a==')') c--;
            max=Math.max(max,c);
        }return max;
    }
}