import java.util.HashSet;

public class SubarrayWithGivenSum {

    static boolean isSubarrayWithGivenSum(int[] arr, int sum) {

        int prevSum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            prevSum += arr[i];

            if (prevSum - sum == 0 || set.contains((prevSum -sum))) {
                return true;
            }
            set.add(prevSum);
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 22, 8, 6, 1, 3, 1 };
        int sum = 22;

        System.out.println(isSubarrayWithGivenSum(arr, sum));
    }
}
