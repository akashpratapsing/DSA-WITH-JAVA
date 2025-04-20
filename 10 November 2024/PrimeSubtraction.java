import java.util.Arrays;

public class PrimeSubtraction {

    public static boolean primeSubOperation(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

          
                nums[i - 1] -= getPrime(nums[i - 1]);
          

            System.out.format("Array after %dth iteration => ", i);
            System.out.println(Arrays.toString(nums));
        }

        return true;
    }

    static int getPrime(int n) {

        int prime = 2;
        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                prime = i;
            }
        }
        return prime;
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
