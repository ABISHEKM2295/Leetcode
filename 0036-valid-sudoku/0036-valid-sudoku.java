class Solution {
    public boolean isValidSudoku(char[][] b) {
        Set s=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=b[i][j];
                if(ch!='.'){
                    if(!s.add(ch+"in r"+i) || !s.add(ch+"in c"+j) || !s.add(ch+"."+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }return true;
    }
}