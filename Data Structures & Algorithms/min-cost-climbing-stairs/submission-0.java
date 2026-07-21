class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);

        return rec(n,cost,arr);
    }
    public int rec(int i,int[] cost,int[] dp){
        if(i == 0 || i == 1)
        return dp[i] = 0;

        if(dp[i] != -1)
        return dp[i];

        int oneStep = cost[i-1] + rec(i-1,cost,dp);
        int twoStep = cost[i-2] + rec(i-2,cost,dp);

        dp[i] = Math.min(oneStep, twoStep);

        return dp[i];

    }
}
