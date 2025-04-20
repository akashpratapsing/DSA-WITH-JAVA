public interface MinimumNumber {

    static int searchMin(int arr[]){
        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        

        int arr[] = {55, 8, 95, 2, 4, 68, 4, 0, -5, 750};
        int res = searchMin(arr);
        System.out.println(res);
    }
}
