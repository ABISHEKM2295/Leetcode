class Solution {
    public void dfs(int[][] g,int[][] t,int i,int j,int c){
        if(i<0 || i>=g.length || j<0 || j>=g[0].length || g[i][j]==0 || c>=t[i][j]) return;
        t[i][j]=c;
        dfs(g,t,i+1,j,c+1);
        dfs(g,t,i-1,j,c+1);
        dfs(g,t,i,j+1,c+1);
        dfs(g,t,i,j-1,c+1);
    }
    public int orangesRotting(int[][] grid) {
        if(grid.length==0 || grid==null) return -1;
        int r=grid.length,c=grid[0].length;
        int[][] t=new int[r][c];
        for(int i=0;i<r;i++){
            Arrays.fill(t[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    dfs(grid,t,i,j,0);
                }
            }
        }
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!=0){
                    if(t[i][j]==Integer.MAX_VALUE) return -1;
                    res=Math.max(res,t[i][j]);
                }
            }
        }return res;
    }
}