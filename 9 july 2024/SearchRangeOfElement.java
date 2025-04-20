import java.util.Arrays;

public class SearchRangeOfElement {

    // My Solution

    // public static int[] searchRange(int[] nums, int target) {

    // if (nums.length == 0) {
    // return new int[] { -1, -1 };
    // }

    // int start = 0;
    // int end = nums.length - 1;

    // if (nums.length == 1) {
    // // return new int[] { 0, 0 };
    // if (nums[0] == target) {
    // // return new int[] { 0, 0 };
    // }
    // }

    // if (nums[start] == nums[end]) {
    // return new int[] { start, end };
    // }

    // while (start <= end) {

    // int mid = start + (end - start) / 2;

    // if (nums[mid] == target) {
    // start = mid;
    // end = mid;

    // if (nums[start] == nums[0]) {
    // start = 0;
    // } else {
    // while (nums[start] == nums[mid]) {
    // start--;
    // }
    // start = start + 1;
    // }

    // if (nums[end] == nums[nums.length - 1]) {
    // System.out.println("Hello");
    // end = nums.length - 1;
    // } else {
    // while (nums[end] == nums[mid]) {
    // end++;
    // }
    // end = end - 1;
    // }

    // return new int[] { start, end };
    // } else if (nums[mid] > target) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }

    // return new int[] { -1, -1 };
    // }

    static int[] searchRange(int[] arr, int target) {

        int[] ans = { -1, -1 };
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] arr, int target, boolean isFirstIndex) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {1};
        int target = 2;

        int[] result = searchRange(nums, target);
        // System.out.println(nums[0]);

        System.out.println(Arrays.toString(result));
    }
}
