public class MinMax {


    static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }

        return max;
    }


    static int getMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int min = getMin(arr);
        int max = getMax(arr);


        System.out.println("Min element = " + min + ", Max element = " + max);
    }
}
