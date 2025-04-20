public class PeakInMountain {

    static int search(int[] arr) {

        // int peak = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // if (arr[mid] > arr[peak]) {
            // peak = mid;
            // } else
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 10, 11, 13, 15, 51, 45, 40, 0 };

        int ans = search(arr);

        System.out.println(ans);

    }
}
