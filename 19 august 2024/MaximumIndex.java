public class MaximumIndex {

    static int maxIndexDiff(int[] arr) {
        
        int max = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] <= arr[j] && i <= j){

                    if (max < j - i){
                        max = j - 1;
                    }
        
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        System.out.println(maxIndexDiff(arr));
        

    }
}
