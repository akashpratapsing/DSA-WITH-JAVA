import java.util.Arrays;

public class ShuffleTheArray {

    static int[] shuffle(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i += 2) {
            ans[i] = nums[i / 2];
            ans[i + 1] = nums[(i / 2) + (n / 2)];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };

        int[] res = shuffle(arr);

        System.out.println(Arrays.toString(res));

    }
}
