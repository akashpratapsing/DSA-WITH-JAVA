import java.util.Arrays;

public class FrogJump {

    // Recursive Solution
    public static int frogJump(int n, int heights[]) {
        return f(n - 1, heights);
    }

    public static int f(int n, int[] heights) {

        if (n == 0) {
            return 0;
        }

        int l = f(n - 1, heights) + Math.abs(heights[n] - heights[n - 1]);

        int r = Integer.MAX_VALUE;
        if (n > 1) {
            r = f(n - 2, heights) + Math.abs(heights[n] - heights[n - 2]);
        }

        return Math.min(l, r);
    }

    // Using DP - Memoization
    public static int frogJump2(int n, int heights[]) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f2(n - 1, heights, dp);
    }

    public static int f2(int n, int[] heights, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int l = f2(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int r = Integer.MAX_VALUE;
        if (n > 1) {
            r = f2(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }

        return dp[n] = Math.min(l, r);
    }

    // Using DP - Tabulation
    public static int frogJump3(int n, int heights[]) {

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int prev = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int prev2 = Integer.MAX_VALUE;
            if (i > 1) {
                prev2 = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }

            dp[i] = Math.min(prev, prev2);
        }

        return dp[n - 1];
    }

    // Using DP - Tabulation - Space Optimization
    public static int frogJump4(int n, int heights[]) {

        int prev = 0;
        int prev2 = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int fs = prev + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1) {
                ss = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }

            int temp  = Math.min(fs, ss);
            prev2 = prev;
            prev = temp;
        }

        return prev;
    }


}