import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = { 4, 7, 1, 2, 5, 6 };
        // System.out.println(Arraay.getSecondLargest(arr));
        // System.out.println(Arraay.getSecondSamllest(arr));
        // RearrangeArray.rearangeAcendingDecending(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arraay.getMedian(arr));

        // int element = Arraay.linearSearcha(arr, 4);
        int element = Arraay.binarySearch(arr, 5);
        if (element == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found : " + element);

        System.out.println(Numbers.isPalindrome(121211));
        System.out.println(Numbers.findPalindromeInRange(11, 121));

        System.out.println(Numbers.isPrime(91));
        System.out.println(Numbers.findPrimeInRange(1, 10));
        System.out.println(Numbers.oddOrEven(6));
        System.out.println(Numbers.sumOfFirstNNaturalNumbers(10));
    }
}