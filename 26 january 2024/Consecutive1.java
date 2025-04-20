import java.util.Scanner;

public class Consecutive1 {

    static boolean hasConsecutiveOnce(int n){
        if ((n & (n << 1)) == 0) {
            return false;
        }else{
            return true;
        }
    }

    static int countConsecutiveOnes(int n){

        int count = 0;

        while (n > 0) {
            count++;
            n = (n & (n << 1));
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.println(countConsecutiveOnes(n));
    }
}
