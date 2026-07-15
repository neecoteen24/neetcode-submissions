class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        if(m<3 || n<3)
        return;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j]=='O'){
                    dfs(i,j,board);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'X')continue;

                else if(board[i][j] == 'T')
                board[i][j] = 'O';

                else
                board[i][j] = 'X';
            }
        }

    }
    public void dfs(int i,int j,char[][] board){
        int m = board.length;
        int n = board[0].length;


        if(i<0 || i > m-1 || j<0 || j > n-1 || board[i][j]!='O')
        return;


        board[i][j] = 'T';

        dfs(i-1,j,board);
        dfs(i,j-1,board);
        dfs(i+1,j,board);
        dfs(i,j+1,board);

    }
}
