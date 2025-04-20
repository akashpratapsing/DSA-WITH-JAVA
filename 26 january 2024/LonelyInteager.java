import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LonelyInteager {

    // Brute force Approach
    // Time Complexcity O(nlogn)
    static int lonelyInterer1(int[] arr){

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i = i + 2) {
            if(arr[i] != arr[i + 1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    
    // Using Set 
    // Time Complexitiy O(n)

    static int lonelyInterer2(int[] arr){

        HashSet<Integer> s = new HashSet<Integer>();

        for (int element : arr) {
            if (s.contains(element)) {
               s.remove(element);
            }else{
                s.add(element);
            }
        }
        for (int i : s) {
            return i;
        }
        return -1;
    }

    static int lonelyInterer3(int[] arr){

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        return res;
    }
    public static void main(String[] args) {
        
        int n = 5;
        int[] arr = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(lonelyInterer2(arr));
    }
}
