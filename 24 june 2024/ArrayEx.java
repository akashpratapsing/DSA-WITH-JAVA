/**
 * ArrayEx
 */
public class ArrayEx {

    public static void main(String[] args) {
        

        int[] arr = {7, 4, 3, 77, 777};

        System.out.println(arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArr, 0, 2);
        newArr[2] = 5;

        System.arraycopy(arr, 2, newArr, 3, arr.length - 2);
        arr = newArr;

        System.out.println("\nAfter Insertion");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        int[] newArr2 = new int[arr.length - 1];

        System.arraycopy(arr, 0, newArr2, 0, arr.length - 1);
        arr = newArr2;

        System.out.println("\nAfter Delettion");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}