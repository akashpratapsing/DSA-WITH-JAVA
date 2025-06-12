import java.util.Arrays;

public class FrogJumpWithKDistance {

    // Recursive solution
    public static int frogJumpWithK(int n, int heights[], int k) {
        return f(n - 1, heights, k);
    }

    public static int f(int n, int[] heights, int k) {

        if (n == 0) {
            return 0;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = f(n - i, heights, k) + Math.abs(heights[n] - heights[n - i]);
                mini = Math.min(mini, jump);
            }
        }

        return mini;
    }

    // DP solution - Memoization
    public static int frogJumpWithK2(int n, int heights[], int k) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f2(n - 1, heights, k, dp);
    }

    public static int f2(int n, int[] heights, int k, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (n - i >= 0) {
                int jump = f2(n - i, heights, k, dp) + Math.abs(heights[n] - heights[n - i]);
                mini = Math.min(mini, jump);
            }
        }

        return dp[n] = mini;
    }

    // DP solution - Tabulation
    public static int frogJumpWithK3(int n, int heights[], int k) {
        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int mini = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    mini = Math.min(mini, jump);
                }
            }
            dp[i] = mini;

        }

        return dp[n - 1];

    }
}