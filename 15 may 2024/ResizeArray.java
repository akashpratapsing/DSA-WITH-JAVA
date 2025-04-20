public class ResizeArray {

    static int[] extendArray(int[] arr,int capcity){

        int[] temp = new int[capcity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 8, 6, 7};

        System.out.println(arr.length);

        arr = extendArray(arr, 10);

        System.out.println(arr.length);

    }
}