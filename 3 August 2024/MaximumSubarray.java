/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    static int maxSum(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
            }
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2 };

        int res = maxSum(arr);

        System.out.println(res);
    }
}