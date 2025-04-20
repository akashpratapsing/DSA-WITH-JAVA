import java.util.Arrays;
import java.util.Scanner;

public class CoronaVIrus {

    static int[]  getFinalPosition(int[] arr, int s, int n){
        
        for (int i = 0; i < n; i++){
            arr[i] = arr[i] >> s;
        }

        return arr;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int spikes = sc.nextInt();
        System.out.println(Arrays.toString(arr));

        int[] result = getFinalPosition(arr, spikes,n);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
        
    }
}
