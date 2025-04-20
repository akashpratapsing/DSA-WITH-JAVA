public class MaximumSumOfK {

    static int maxSum(int[] arr, int k) {

        if (k >= arr.length){
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            sum = Math.max(sum, (sum - arr[i - k] + arr[i]));
        }

        return sum;
    }

    public static void main(String[] args) {

        int  arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};

        System.out.println(maxSum(arr, 4));
    }
}
