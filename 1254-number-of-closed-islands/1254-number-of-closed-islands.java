class Solution {
    public boolean dfs(int[][] g,int i,int j){
        int m =g.length;
        int n = g[0].length;
        if(i<0 || j<0 || i>=m || j>=n) return false;
        if(g[i][j]==1) return true;
        g[i][j]=1;
         boolean up = dfs(g, i - 1, j);
        boolean down = dfs(g, i + 1, j);
        boolean left = dfs(g, i, j - 1);
        boolean right = dfs(g, i, j + 1);

        return up && down && left && right;
    }
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)) c++;
                }
            }
        }
        return c;
    }
}