import java.util.Arrays;

public class ConcatenationOfArray {

    static int[] concat(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int[] res = concat(arr);

        System.out.println(Arrays.toString(res));
    }
}