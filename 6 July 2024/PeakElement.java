public class PeakElement {


    static int peak(int[] array){

        int peak = 0;

        if(array[0] > array[1]){
            return array[0];
        }
        if ( array[array.length - 1] > array[array.length - 2]) {
            return array[array.length - 1];
        }

        for(int i = 1; i < array.length - 1; i++){
            if(array[i] >= array[i - 1] && array[i] >= array[i + 1]){
                peak = array[i];
            }
        }
        return peak; 
    }

    public static void main(String[] args) {
        

        int[] arr = { 1, 3, 20, 4, 1, 0 };

        int res = peak(arr);
        System.out.println(res);
    }
}