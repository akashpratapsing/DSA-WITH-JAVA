public class Celling {


    static int findCelling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            
            mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return arr[mid];
            }

            if (arr[mid] > target) {
                end = mid - 1 ;
            }else{
                start = mid + 1;
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 20, 22, 30, 35, 40, 50, 54, 56, 66, 86, 98 };

        System.out.println(findCelling(arr, 11));
    }
}