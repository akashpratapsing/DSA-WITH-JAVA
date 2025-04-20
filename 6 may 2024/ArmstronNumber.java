import java.util.Scanner;

public class ArmstronNumber {

    static int numberOfDigits(int n) {

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static boolean check(int n) {

        int num = n;
        int res = 0 ;
        int digit = String.valueOf(n).length();

        while (num != 0) {

            int x = num % 10;
            res = res + (int) Math.pow(x, digit);
            num /= 10;
        }

        if (n == res) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int n = scanner.nextInt();

        System.out.println(check(n));

        scanner.close();
    }
}
