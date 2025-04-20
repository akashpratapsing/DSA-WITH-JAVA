public class PrintUsingRecurrsion {

    // function to print numbers from n to 1
    static void printNTo1(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNTo1(n - 1);
    }

    // function to print numbers from 1 to n
    static void print1ToN(int n) {

        if (n == 0) {
            return;
        }

        print1ToN(n - 1);
        System.out.println(n);
    }

    // function to get the factorial of a number
    static int getFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }

    // function to get the Sum of n natural number
    static int getSum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + getSum(n - 1);
    }

    static int sumOfDigit(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigit(n / 10);
    }

    public static void main(String[] args) {

        // print1ToN(5);

        System.out.println(sumOfDigit(12345));

    }
}
