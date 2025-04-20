public class MissingNumber {

    static int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int actualSum = (n * (n + 1)) / 2;

        int missingNum = actualSum - sum;

        return missingNum;
    }

    static int usingCyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        int ans = usingCyclicSort(arr);

        System.out.println(ans);
    }

}
