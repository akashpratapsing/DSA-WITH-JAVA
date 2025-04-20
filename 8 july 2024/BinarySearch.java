public class BinarySearch {

    static int searchInAsend(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        int mid;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int searchInDesend(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        int mid;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int[] reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    } 

    public static void main(String[] args) {

        int[] arr = { 10, 15, 20, 22, 30, 35, 40, 50, 54, 56, 66, 86, 98 };

        int[] reverse = reverse(arr, arr.length);
        

        int result = searchInDesend(reverse, 54);

        System.out.println(result);
    }
}
