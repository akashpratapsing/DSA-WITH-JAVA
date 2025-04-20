public class TargetInMountain {

    static int searchTarget(int[] arr, int target) {

        int start = 0;
        int end = findPeak(arr);
        int mid = start + (end - start) / 2;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        if (arr[mid] != target) {

            start = findPeak(arr);
            end = arr.length - 1;

            while (start <= end) {

                mid = start + (end - start) / 2;

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }

        return -1;
    }

    static int findPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 4, 2, 1 };

        int ans = searchTarget(arr, 3);
        // int ans = findPeak(arr);

        System.out.println(ans);

    }
}
