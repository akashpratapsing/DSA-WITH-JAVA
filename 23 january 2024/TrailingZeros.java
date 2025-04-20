import java.util.Scanner;

public class TrailingZeros {

     static int countTrailingZero(int n){
        int res = 0;
        int powerOfFive = 5;

        while (n >= powerOfFive) {
            res += n/powerOfFive;
            powerOfFive *= 5;
        }

        return res;

   }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(countTrailingZero(n));

    }
}
