class Fibonacci {

    // Using Recursion
    public int nthFibo(int n) {

        if (n <= 1) {
            return n;
        }

        return nthFibo(n - 1) + nthFibo(n - 2);
    }

    // Using DP - memoization
    public int fibo(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }

    // Using DP - Tabulation
    public int fiboTabulation(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

     // Using DP - Tabulation - Optimal Space O(1)
    public int fiboTabulation2(int n) {

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}