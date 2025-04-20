import java.util.Scanner;

public class ReveserANumber {


    static boolean reverse(int n){

        int rev = 0;
        int num = n;

        while (num != 0) {
             rev = (rev * 10) + (num % 10);
             num /= 10;
        }

        if (rev == n) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int n = scanner.nextInt();

        if (reverse(n)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
        scanner.close();
    }
}
