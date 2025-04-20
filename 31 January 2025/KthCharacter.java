import java.util.Scanner;

public class KthCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String input = sc.next();
        sc.close();

        System.out.println(input.charAt(n - k));
    }
}