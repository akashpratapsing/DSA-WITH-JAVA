public class OrderAgnosticBS {

    static int binatySerach(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end--;
                } else {
                    start++;
                }
            }
        } else {

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
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

        System.out.println(binatySerach(reverse(arr, arr.length), 56));
    }
}
