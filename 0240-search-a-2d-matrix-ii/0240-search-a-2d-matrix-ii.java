class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) return false;
        int r=0,c=matrix[0].length-1;
        while(r <= matrix.length-1 && c >=0){
            if(t==matrix[r][c]) return true;
            else if( t < matrix[r][c]) c--;
            else r++;
        }return false;
    }
}