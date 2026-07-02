class Solution {
    public void dfs(int i,int j,char[][] grid,boolean[][] visited){
        int n = grid.length;
        int m = grid[0].length;

        
        if( i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '0' || visited[i][j] == true){
            return;
        }

        visited[i][j] = true;
        

        dfs(i-1,j,grid,visited);
        dfs(i+1,j,grid,visited);
        dfs(i,j-1,grid,visited);
        dfs(i,j+1,grid,visited);

    }
    public int numIslands(char[][] grid) {
       int n = grid.length;
       int m = grid[0].length;
       int count = 0;

       boolean[][] visited = new boolean[n][m];

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j] == '1' && !visited[i][j]){
                count++;
                dfs(i,j,grid,visited);
            }
        }
       }
    return count;
    }
}
