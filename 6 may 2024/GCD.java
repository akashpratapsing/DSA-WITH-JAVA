import java.util.Scanner;

public class GCD {

    static int findGcd(int a, int b){

       for (int i = Math.min(a, b); i >= 1; i--) {
        if(a % i == 0 && b % i == 0){
            return i;
        }
       } 
            return 1;
    }

    static int optimalGcd(int a, int b){

      while (a != 0 && b != 0) {
        if (a > b) {
            
            a = a % b;
        }else{
            b = b % a;
        }
      }

        if (a == 0) {
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = optimalGcd(a, b);

        System.out.println(res);

        scanner.close();
    }
}
