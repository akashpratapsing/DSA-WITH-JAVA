
/**
 * LinearSearch
 */
public class LinearSearch {

    static int linearSearch(int arr[], int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int data[] = { 5, 44, 89, 63, 55, 47, 2, 87 };
        int res = linearSearch(data, 8);
        System.out.println(res);
    }
}