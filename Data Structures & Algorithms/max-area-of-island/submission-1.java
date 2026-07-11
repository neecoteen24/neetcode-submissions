class Solution {
    int maxArea=0;
    public int dfs(int i,int j,int[][] grid,boolean[][] vis){
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || j<0 || i >= m || j >= n || vis[i][j] || grid[i][j] == 0)
        return 0;

        vis[i][j] = true;

        return 1 + (dfs(i+1,j,grid,vis) +
        dfs(i-1,j,grid,vis) +
        dfs(i,j+1,grid,vis) +
        dfs(i,j-1,grid,vis));

    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    int area = dfs(i,j,grid,visited);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }

        return maxArea;
    }
}
