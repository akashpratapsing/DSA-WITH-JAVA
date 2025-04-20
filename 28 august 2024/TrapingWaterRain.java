public class TrapingWaterRain {

    static int store(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int max = 0;

        if (arr[start] <= arr[end]) {

            for (int i = 1; i < end; i++) {

                max += Math.max(0, (arr[start] - arr[i]));
                System.out.println("max = " +  max);
                if (arr[i] > arr[start]) {
                    start = i;
                }
            }

            return max;
        } else {

            for (int i = end; i > 0; i--) {
                max += Math.max(0, (arr[end] - arr[i]));
                System.out.println("max = " +  max);
                if (arr[i] > arr[end]) {
                    end = i;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,0, 1, 5 };

        System.out.println(store(arr));

    }
}
