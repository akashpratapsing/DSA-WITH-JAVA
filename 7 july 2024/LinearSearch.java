/**
 * LinearSearch
 */
public class LinearSearch {

    static int search(int[] arr, int element) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }

    static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 85, 4, 21, 1, 58, 89, 63, 54 };

        // int result = search(arr, 544);\

        int result = searchInRange(arr, 58, 2, 5);

        System.out.println(result);
    }
}