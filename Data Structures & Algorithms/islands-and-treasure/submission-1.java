class Solution {
    int INF = 2147483647;
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];

            for(int i=0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nc < 0 || nr < 0 || nr >= n || nc >= m)
                continue;

                if(grid[nr][nc]!= INF)
                continue;

                grid[nr][nc] = grid[r][c] + 1;
                q.offer(new int[]{nr,nc});
            }
            
        }
    }
}
