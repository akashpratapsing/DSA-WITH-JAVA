public class FilterOdd {
    
    static int[] filterOdd(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] odd = new int[count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] % 2 != 0) {
                odd[j] = arr[i];
                j++;
            }
        }

        return odd;
    }

    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] res = filterOdd(arr);

        print(res);;
        
    }
}
