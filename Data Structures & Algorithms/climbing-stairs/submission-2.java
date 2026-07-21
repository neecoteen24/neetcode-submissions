class Solution {
    public int climbStairs(int n) {
        int[] ar = new int[n+1];
        Arrays.fill(ar,-1);

        return rec(ar,n);
    }
    public int rec(int[] dp,int n){
        if(n < 0)
        return 0;

        if(n == 0)
        return dp[n]=1;

        if(dp[n] != -1)
        return dp[n];

        dp[n] = rec(dp,n-1) + rec(dp,n-2);
        return dp[n];
    }
}
