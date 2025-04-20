/**
 * BitManipulation
 */
public class BitManipulation {

    static boolean isPowerOfTwo(long n) {

        // Only works till 2 ^ 30 if parmeter is int and if parameter is long it works
        // till 2 ^ 62

        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    static int getFirstSetBit(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            if ((n & 1) == 1) {
                break;
            }
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = Integer.toBinaryString(55);
        // System.out.println(isPowerOfTwo(0));
        System.out.println(getFirstSetBit(55) +  "  "  +s);

    }
}