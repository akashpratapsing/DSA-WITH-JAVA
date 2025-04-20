import java.util.ArrayList;

/**
 * PairWithGivenSum
 */
public class PairWithGivenSum {

    static boolean hasPair(int[] arr, int sum){


        ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        //  list.add(arr[i]);
        // }

        for (int i = 0; i < arr.length; i++) {
            if (list.contains(sum - arr[i])) {
                return true;
            }
            list.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int x = 14;

        System.out.println(hasPair(arr, x));

    }
}