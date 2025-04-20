import java.util.Arrays;

public class Arraay {

    public static int getSecondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

    public static int getSecondSamllest(int[] arr) {

        if (arr.length < 2) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (secondMin > arr[i] && min != arr[i]) {
                secondMin = arr[i];
            }
        }

        return (secondMin == Integer.MAX_VALUE) ? -1 : secondMin;
    }

    public static float getMedian(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (float) (arr[(n / 2) - 1] + arr[n / 2]) / 2;
        }
    }

    public static int linearSearcha(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
