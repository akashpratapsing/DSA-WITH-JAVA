public class MagicNumber {

    static int getMagicNumber(int n) {

        int num = 0;
        int x = n;
        int power = 1;
        while (x != 0) {
            if ((x & 1) == 1) {
                num += Math.pow(5, power);
               
            }
            power++;
            x >>= 1;
        }

        return num;
    }

    public static void main(String[] args) {

        int n = 15;

        System.out.println(getMagicNumber(n));

    }
}
