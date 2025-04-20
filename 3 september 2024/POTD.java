import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * POTD
 */
public class POTD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int k = sc.nextInt();

        sc.close();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (list.contains(arr[i])) {
                list.remove(arr[i]);
            } else {
                list.add(arr[i]);
            }
        }

       

        String[] distinctArr2 = new String[list.size()];

        for (int i = 0; i < distinctArr2.length; i++) {
            distinctArr2[i] = list.get(i);
        }

        if (distinctArr2.length == 1) {
            System.out.println(distinctArr2[0]);
        } else {
            String ans2 = distinctArr2[k - 1];
            System.out.println(ans2);
        }

    }
}