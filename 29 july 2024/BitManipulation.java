public class BitManipulation {

    static int clearBitInRange(int n, int i, int j) {

        int range = j - i;
      //  int mask = ((1 << range) - 1) << (i + 1);

        int mask =((int) Math.pow(2, range) - 1) << (i + 1);

        int result = n & ~mask;

        return result;
    }

    static int clearBitInRangeUsingLoop(int n, int i, int j) {

        int result = n;
        int mask = 1 << (i + 1);

        for (int k = 0; k < (j - i); k++) {
           result &= ~mask;

           mask <<= 1;
        }

        return result;
    }



    public static void main(String[] args) {

        System.out.println(clearBitInRange(1023, 2, 7));

    }
}
