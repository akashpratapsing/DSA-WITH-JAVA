public class TwoSum {

    // Using Binary Search Time Complexity - O(n * log n)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            int j = bianrySearch(nums, i + 1, target - nums[i]);
            if (j != -1) {
                return new int[] { i + 1, j + 1 };
            }
        }
        return new int[] {};
    }

    static int bianrySearch(int[] nums, int start, int target) {

        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Approach Two Pointer
    public static int[] twoSum2(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] {};
    }
}
