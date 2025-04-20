import java.util.ArrayList;
import java.util.List;

/**
 * WinneroftheCircularGame
 */
public class WinneroftheCircularGame {

    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int count = -1;
        while (list.size() > 1) {
            count += k;
            if (count >= list.size()) {
                count = count % list.size();
                list.remove(count);
                count--;
            } else {
                list.remove(count);
                count--;
            }
        }

        return list.getFirst();
    }

    public static void main(String[] args) {

        int winner = findTheWinner(6, 5);

        System.out.println(winner);

        // List<Integer> hi = new ArrayList<>();

        // for (int i = 0; i < 5; i++) {
        //     hi.add(i+1);
        // }

      

        // System.out.println(hi.size());
      
    }
}