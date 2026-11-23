class Solution {
    public boolean checkString(String s) {
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') c++;
        }
        for(int i=0;i<c;i++){
            if(s.charAt(i)=='b') return false;
        }return true;
    }
}