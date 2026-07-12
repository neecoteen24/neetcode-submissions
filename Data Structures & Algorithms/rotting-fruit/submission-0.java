class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        int time = 0;
        while(!q.isEmpty() && fresh > 0){
            int s = q.size();
            for(int i=0;i<s;i++)
            {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];

                for(int[] d : dir){
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if(nr < 0 || nc < 0 || nr >= n || nc >= m)
                    continue;

                    if(grid[nr][nc] != 1)
                    continue;

                    q.offer(new int[]{nr,nc});
                    fresh--;
                    grid[nr][nc] = 2;
                }
            }    
            time++;
        }

        
        return (fresh == 0)? time : -1;
    }
}
