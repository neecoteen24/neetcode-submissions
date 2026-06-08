class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //columns
        int n = matrix[0].length; //rows length

        if(target < matrix[0][0] || target > matrix[m-1][n-1])
        return false;

        for(int i=0;i<m;i++){
            if(target > matrix[i][n-1])
                {
                   continue; 
                }
            for(int j = 0;j< n;j++){
                if(matrix[i][j]== target)
                return true;
            }
        }
        return false;
    }
}
