class Solution {
    public long dfs(int[][] g,int i,int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]==0) return 0;
        long val=g[i][j];
        g[i][j]=0;
        return val+dfs(g,i+1,j)+dfs(g,i-1,j)+dfs(g,i,j-1)+dfs(g,i,j+1);
    }
    public int countIslands(int[][] grid, int k) {
        long tot=0;
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] > 0){
                    tot=dfs(grid,i,j);
                    if(tot%k==0) c++;
                }
            }
        }return c;
    }
}