/**
 * SearchInInfiniteArray
 */
public class SearchInInfiniteArray {

    static int search(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end;
            end = end + (end - start + 1) * 2;
            start = temp + 1;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170 };
        int target = 10;
        // Function call
        int ans = search(arr, target);
        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "
                    + ans);
    }
}