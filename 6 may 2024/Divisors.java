import java.util.Scanner;

public class Divisors {

    static void printDivisor(int n){

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int n = scanner.nextInt();

        printDivisor(n);
        scanner.close();
    }
}
