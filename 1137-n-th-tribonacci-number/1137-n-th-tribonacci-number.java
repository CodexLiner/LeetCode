class Solution {
    public int tribonacci(int n) {
        n = n + 1;
        if (n == 0 || n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1] + dp[i - 3];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}