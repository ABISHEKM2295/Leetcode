class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int colbegin=0,colend=matrix[0].length-1;
        int rowbegin=0,rowend=matrix.length-1;
        while(rowbegin<=rowend && colbegin<=colend){
            for(int i=colbegin;i<=colend;i++){
                li.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++){
                li.add(matrix[i][colend]);
            }
            colend--;
            if (rowbegin <= rowend) {
                for (int i = colend; i >= colbegin; i--) {
                    li.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colbegin<=colend){
            for(int i=rowend;i>=rowbegin;i--){
                li.add(matrix[i][colbegin]);
            }
            colbegin++;
            }
        }return li;
    }
}