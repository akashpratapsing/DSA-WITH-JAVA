import java.util.ArrayList;

class Subsequence {

    // Prints all the sub sequence with sum k
    public static void allSubSecOfSumK(int[] arr, int idx, int sum, int k, ArrayList<Integer> list) {

        if (idx == arr.length) {
            if (sum == k) {
                for (Integer i : list) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }

        list.add(arr[idx]);
        sum += arr[idx];
        allSubSecOfSumK(arr, idx + 1, sum, k, list);

        sum -= arr[idx];
        list.remove(Integer.valueOf(arr[idx]));

        allSubSecOfSumK(arr, idx + 1, sum, k, list);

    }

    // It Counts All the sub sequence with sum k
    public static int countAllSubSecOfSumK(int[] arr, int idx, int sum, int k) {

        if (idx == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        sum += arr[idx];
        int taken = countAllSubSecOfSumK(arr, idx + 1, sum, k);

        sum -= arr[idx];
        int nonTaken = countAllSubSecOfSumK(arr, idx + 1, sum, k);

        return taken + nonTaken;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 2;
        allSubSecOfSumK(arr, 0, 0, sum, list);
        System.out.println("Total Sub sec with sum K : " + countAllSubSecOfSumK(arr, 0, 0, sum));

    }
}