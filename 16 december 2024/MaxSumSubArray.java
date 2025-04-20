class MaxSumSubArray {

    static int getMaxSum(int[] arr, int k) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = k; i < arr.length - k; i++) {
            sum -= arr[i - k];
            sum += arr[i + k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 6, 3, 8, 84, 89 };

        System.out.println(getMaxSum(arr, 2));
    }
}