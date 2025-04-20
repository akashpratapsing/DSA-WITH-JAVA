import java.util.Arrays;

class KnapsackProblem {

    // Using only recursion
    public static int recursiveKnapsack(int[] weights, int[] values, int capacity, int n) {

        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (weights[n - 1] <= capacity) {
            return Math.max(values[n - 1] + recursiveKnapsack(weights, values, capacity - values[n - 1], n - 1),
                    recursiveKnapsack(weights, values, capacity, n - 1));
        } else {
            return recursiveKnapsack(weights, values, capacity, n - 1);
        }

    }

    // Using Dynamic Programming - Momoization
    public static int memoizationKnapsack(int[] weights, int[] values, int capacity, int n) {
        int[][] memo = new int[n + 1][capacity + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return recKnapsack(weights, values, capacity, n, memo);

    }

    public static int recKnapsack(int[] weights, int[] values, int capacity, int n, int[][] memo) {

        if (n == 0 || capacity == 0) {
            return 0;
        }

        if (memo[n][capacity] != -1) {
            return memo[n][capacity];
        }

        if (weights[n - 1] <= capacity) {
            memo[n][capacity] = Math.max(
                    values[n - 1] + recKnapsack(weights, values, capacity - values[n - 1], n - 1, memo),
                    recursiveKnapsack(weights, values, capacity, n - 1));
        } else {
            memo[n][capacity] = recKnapsack(weights, values, capacity, n - 1, memo);
        }

        return memo[n][capacity];

    }

    public static void main(String[] args) {
        int[] weights = { 4, 5, 1 };
        int[] values = { 1, 2, 3 };
        int capacity = 4;
        int n = values.length;

        // System.out.println(recursiveKnapsack(weights, values, capacity, n));
        System.out.println(memoizationKnapsack(weights, values, capacity, n));

    }
}