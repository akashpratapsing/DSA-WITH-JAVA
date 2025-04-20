import java.util.Scanner;

public class MostSetBit {

    static void rightMostSetBit(String binary) {

        int len = binary.length();
        for (int i = len - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                System.out.println(i + 1);
                break;
            }
        }

    }

    static int posOfRMSB(int n) {

        // int m = 1;
        // int pos = 0;

        // if (n == 0){
        // return -1;
        // }

        // while ((n & m) == 0) {
        // m = m << 1;
        // pos++;
        // }
        // return pos +1;

        return (int) (Math.log10(n ^ (n & (n - 1))) / Math.log10(2)) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String b = sc.next();
        // int n = sc.nextInt();
        sc.close();

        rightMostSetBit(b);
        // System.out.println(posOfRMSB(n));

    }
}
