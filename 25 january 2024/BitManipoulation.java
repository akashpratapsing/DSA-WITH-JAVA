import java.util.Scanner;

/**
 * BitManipoulation
 */
public class BitManipoulation {

    static String decimalToBinary(int n){

        String binary = "";

       while (n >= 1) {
        int x = n % 2;
        n /= 2;
        binary = x + binary;
       }

       return binary;
    }

    static int binaryToDecimal(String b){

        int res = 0;
        int powerOfTwo = 1;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                res += powerOfTwo;
            }
            powerOfTwo *= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String binary = decimalToBinary(n);
        System.out.println(binary);

        System.out.println(binaryToDecimal(binary));
    }
}