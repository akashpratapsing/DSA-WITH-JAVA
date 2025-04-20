public class SearchIn2D {

    static int search(int[][] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

       // int index;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return target;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3, 4 },
                { 21, 85, 96, 56, 89 },
                { 87, 75, 25, 258, 564 },
                { 5, 12, 45, 24, 232 }
        };

        int result = search(arr, 24);

        System.out.println(result);

    }
}
