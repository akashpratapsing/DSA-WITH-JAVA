import java.util.*;

public class KthSmallestElement {

    static int findKthSmallest(int[] arr, int k) {

        int l=0,r=arr.length-1;
        while(l<=r){
            int p=QuickSort.lomutoPartition(arr,l,r);
            if(p==k-1)
                return arr[p];
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 4, 2, 9 };

        System.out.println(findKthSmallest(arr, 3));
    }
}
