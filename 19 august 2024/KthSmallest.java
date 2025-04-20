import java.util.*;

public class KthSmallest {

    // Solution 1.
    static int kthSmallestelement(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 1; i <= k - 1; i++) {
            int min = findmin(list);
            list.remove(min);
        }

        int result = findmin(list);
        return list.get(result);

    }

    static int findmin(List<Integer> list) {

        int min = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(min) > list.get(i)) {
                min = i;
            }
        }

        return min;
    }

    // Solution 2
    static int findKthSmallest(int[] arr, int k) {

        sort(arr);

        return arr[k - 1];
    }

    static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[] { 5, 4, 1, 9, 25 };

        int[] arr1 = new int[] { 7, 10, 4, 20, 15 };

        List<Integer> list = Arrays.asList(arr);

        // System.out.println(findmin(list));
        // System.out.println(kthSmallestelement(arr1, 4));

        System.out.println(findKthSmallest(arr1, 4));

        

    }
}