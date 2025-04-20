public class MissingNumber {

    static int findMissingNumber(int[] arr) {

        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 6, 4, 3, 2, 5};

        System.out.println(findMissingNumber(arr));

    }
}
