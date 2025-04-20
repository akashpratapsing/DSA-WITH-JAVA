import java.util.HashSet;

public class Subarraywithzerosum {

    static boolean isSubArrWZS(int[] arr){

        int sum = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(sum);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }

        return false;
    }
    public static void main(String[] args) {

        int arr[] = new int[]{-3 , 2, 1};
        
        System.out.println(isSubArrWZS(arr));
        
    }
}
