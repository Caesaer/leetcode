public class No70 {

    public int climbStairs(int n) {
        if (n < 2)
            return 1;

        int[] dp = new int[n];
        dp[0] = 1; dp[1] = 2;
        for (int i = 2; i < dp.length; i++)
            dp[i] = dp[i-1] + dp[i-2];

        return dp[n-1];
    }

}
