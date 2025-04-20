import java.util.Scanner;

/**
 * DigitCount
 */
public class DigitCount {


    static int countDigit(int n){

        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(countDigit(n));
    }
}