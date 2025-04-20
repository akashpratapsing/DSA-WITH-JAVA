import java.util.LinkedList;
import java.util.Queue;

public class SubarrayProblem {

    public static void firstNegativeNumberInSubarray(int[] arr, int k){

        Queue<Integer> list = new LinkedList<>();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            if (j - i + 1 < k){  
                j++;
            }else{
                if(list.isEmpty()){
                    System.out.print("0 ");
                }else{
                    int min = list.peek();
                    System.out.print(min + " ");
                    if (list.peek() == arr[i]) {
                        list.poll();
                    }
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 4, -5, 8, -1, 5, 6};

        firstNegativeNumberInSubarray(arr, 3);
    }
}