public class ArraySubset {


    public static boolean isSubset1(int[] arr1, int[] arr2, int m, int n) {
        // Iterate over each element in the second array
        for (int i = 0; i < n; i++) {
            boolean found = false;
            // Check if the element exists in the first array
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            // If any element is not found, return false
            if (!found)
                return false;
        }
        // If all elements are found, return true
        return true;
    }

    public static void main(String[] args) {

        long[] a1 = { 1, 2, 3, 4, 4, 5, 6 };
        long[] a2 = { 1, 2, 4 };

        int[] x = { 1, 2, 3, 4, 4, 5, 6 };
        int[] y = { 1, 2, 4 };


       // System.out.println(isSubset1(x, y, x.length, y.length));

     
    }
}
