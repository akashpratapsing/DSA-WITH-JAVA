import java.util.*;

class Array {

    // Q1. Find the smallest element in an array

    // Brute Force - Time Complexity - O(n logn)
    // static int findMin(int[] arr){

    // Arrays.sort(arr); // Sorts the array
    // return arr[0]; // return 1st element
    // }

    // Optimal - using min variable - Time Complexity - O(n)
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Q2. Find the Largest element in an array
    // Brute Force - Time Complexity - O(n logn)
    // static int findLargest(int[] arr) {

    //     Arrays.sort(arr); // Sorts the array
    //     return arr[arr.length - 1]; // return last element

    // }

    // Optimal - using min variable - Time Complexity - O(n)
    static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    // Q3. Find Second Smallest and Second Largest Element in an array

    // Optimal - Time Complexity - O(n)
    static int secLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (largest < num){
                secLargest = largest;
                largest = num;
            }else if (secLargest < num && num != largest){
                secLargest = num;
            }
        }
        return secLargest;
    }

    // Optimal - Time Complexity - O(n)
    static int secSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for (int num : arr){
            if (smallest > num){
                secSmallest = smallest;
                smallest = num;
            }else if (secSmallest > num && num != smallest){
                secSmallest = num;
            }
        }
        return secSmallest;
    }

    // Q4. Reverse a given Array

    // Two Pointer approach - Time Complexity - O(n)
    static void Reverse(int[] arr){

        int l = 0;
        int r = arr.length - 1;

        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 0 };

        int min = findMin(arr);
        System.out.println(min);

        int largest = findLargest(arr);
        System.out.println(largest);

        int secLargest = secLargest(arr);
        System.out.println(secLargest);

        int secSmallest = secSmallest(arr);
        System.out.println(secSmallest);

        Reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}