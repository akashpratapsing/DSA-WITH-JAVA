import java.util.Scanner;

/**
 * POTD2
 */
public class POTD2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.charAt(k - 1));

    }
}