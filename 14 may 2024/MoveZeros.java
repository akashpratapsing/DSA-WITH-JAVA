public class MoveZeros {
    

    static void move(int[] arr){

       
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[j] == 0 && arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }    
        }

        print(arr);
    }

    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 0, 6, 0, 45, 8, 0};

        move(arr);


    }
}
