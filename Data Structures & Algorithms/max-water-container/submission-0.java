class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxSum = 0;
        while(i<j){
            int curSum = (j-i)*Math.min(heights[i],heights[j]);
            maxSum = Math.max(curSum,maxSum);
            if(heights[i] > heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxSum;
    }
}
