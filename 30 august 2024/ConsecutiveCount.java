/**
 * ConsecutiveOness
 */
public class ConsecutiveCount {

    static int countConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    static int maxEvenOdd(int[] arr) {

        int max = 1;
        int currMax = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currMax++;
                max = Math.max(currMax, max);
            }else{
                currMax = 1;
            }
        }


        return max;

    }

    public static void main(String[] args) {

        int[] aaa = { 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0 };

        int[] aa = { 1, 2, 8, 4, 5, 6, 7, 15, 15, 10, 1, 0 };

        //System.out.println(countConsecutiveOnes(aaa));
        System.out.println(maxEvenOdd(aa));
    }
}