import java.util.HashMap;
import java.util.Map;

public class BestPrize {

    static int[] bestPrice(int n, int price[][], int k, int q, int queries[][]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = price[0][0]; i <= price[0][price.length - 1]; i++) {
            map.put(i, null);
        }

        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                if (map.containsKey(price[i][j])) {
                    // map.get(price[i][j]) + 1
                    int x = map.get(price[i][j]);
                  //  map.put(price[i][j], x + 1);
                  map.replace(price[i][j], x);
                 // map.
                }
            }
        }

        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {

                if (e.getValue() == k) {

                    int x = e.getKey();

                    if (x >= queries[i][0] && x <= queries[i][1]) {
                        ans[i] += 1;
                    }
                }
            }

        }

        return ans;

    }

    public static void main(String[] args) {

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < 5; i++) {
        // map.put(i, i + 1);
        // }

        // for (Integer value : map.keySet()) {
        // System.out.println(value);
        // }

        int n = 2;
        int k = 2;
        int q = 1;

        int[][] price = { { 1, 3 }, { 2, 4 } };

        int[][] queries = { { 1, 4 } };

        bestPrice(n, price, k, q, queries);
    }
}
