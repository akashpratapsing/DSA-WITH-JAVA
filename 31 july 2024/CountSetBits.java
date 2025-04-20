/**
 * CountSetBits
 */
public class CountSetBits {

    static int count(int n) {

        int x = n;
        int count = 0;

        while (x != 0) {
            if ((x & 1) == 1) {
                count++;
            }

            x >>= 1;
        }

        return count;
    }

    static int countBitsTillN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += count(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 0;

        System.out.println(countBitsTillN(n));

    }
}