class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[][] dirn = {{1,0},{-1,0},{0,1},{0,-1}};
    public void dfs(int i,int j,boolean[][] ocn,int[][] heights){
        int m = heights.length;
        int n = heights[0].length;

        if(i<0 || j<0 || i>= m || j >= n || ocn[i][j])
        return;

        ocn[i][j] = true;

        for(int[] dir: dirn){
            int r = i + dir[0];
            int c = j + dir[1];
            if(r<0 || c<0 || r>= m || c >= n || ocn[r][c])
            continue;

            if(heights[r][c] >= heights[i][j]){
                dfs(r,c,ocn,heights);
            }
        }
            
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];

        //first col
        for(int i=0;i<m;i++){
            dfs(i,0,pac,heights);
        }

        //first row
        for(int j=0;j<n;j++){
            dfs(0,j,pac,heights);
        }

        //last col
        for(int i=0;i<m;i++){
            dfs(i,n-1,atl,heights);
        }

        //last row
        for(int j=0;j<n;j++){
            dfs(m-1,j,atl,heights);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j] && atl[i][j])
                {
                    ans.add(Arrays.asList(i,j));

                }
            }
        }

        return ans;
    }
}
 