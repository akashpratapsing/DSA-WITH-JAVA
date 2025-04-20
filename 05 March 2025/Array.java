import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        int[] arr = {5,8,3,5,9,7};

        // Question : Find the Largest element of Array?

        // Brute Force - First Sort Than return the last element
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);

        // Optimal - Iterate through entire array and compare elements one-by-one to find the largest element.
        // int largest = 0;
        // for (int x: arr){
        //     if (x > largest) {
        //         largest = x;
        //     }
        // }
        // System.out.println(largest);

        // Question : Find the second largest element of array?
        // Brute Force - First Sort Than return the second last element
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);

        // Better - Find the largest by iterating the array the find the second largest
        // int largest = 0;
        // for (int i : arr) {
        //     if (i > largest){
        //         largest = i;
        //     }
        // }
        // int sLargest = -1;
        // for (int i : arr) {
        //     if (i > sLargest && i != largest){
        //         sLargest = i;
        //     }
        // }
        // System.out.println(sLargest);

        // Optimal - One Pass Solution
        // int largest = Integer.MIN_VALUE;
        // int secondLargest = Integer.MIN_VALUE;

        // for (int i : arr) {
        //     if (i > largest) {
        //         secondLargest = largest;
        //         largest = i;
        //     }else if (i > secondLargest && i != largest){
        //         secondLargest = i;
        //     }
        // }
        // System.out.println(secondLargest);

        // Question : Check if the Array is sorted?
        // Solution - Comapare value one-by-one

        // for (int i = 1; i < arr.length; i++){
        //     if (arr[i] < arr[i-1]){
        //         System.out.println("Array is not sorted");
        //         break;
        //     }
        // }
        // System.out.println("Array is sorted");

    }
}