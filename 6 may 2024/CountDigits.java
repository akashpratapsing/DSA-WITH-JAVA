import java.util.Scanner;

public class CountDigits {

    static int countDig(int n){

        int number = n;
        int count = 0;
        int digit;

        while (n != 0) {
            
            digit = n % 10;

            // if (digit == 0){
            //     n /= 10;
            //     digit = n % 10;
            // }

            try {
                if (number % digit == 0) {
                    count++;
                }               
            } catch (ArithmeticException e) {
                
            }
            // if (number % digit == 0) {
            //     count++;
            // }

            n /= 10;

        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int n = scanner.nextInt();

        int res = countDig(n);
        System.out.println(res);
        scanner.close();
    }
}