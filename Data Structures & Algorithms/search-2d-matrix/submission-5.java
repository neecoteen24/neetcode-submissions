class Solution {
    public boolean search(int[] mat,int target){
        int n = mat.length;
        int hi = n - 1;
        int lo = 0;

        while(hi >= lo){
            int mid = lo + (hi-lo)/2;
            if(mat[mid] == target)
            return true;

            else if(mat[mid] > target){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int lo = 0;
        int hi = n - 1;
        int row = -1;
        while(hi >= lo){
            int mid = lo + (hi - lo)/2; 
            if(target == matrix[mid][0])
            return true;

            else if(matrix[mid][0] > target){
                hi = mid - 1;   
            }

            else{
                row = mid;
                lo = mid + 1;
            }
        }

        if(row == -1)
        return false;

        return search(matrix[row],target);
        
    }
}
