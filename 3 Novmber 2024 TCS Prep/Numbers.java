import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static List<Integer> findPalindromeInRange(int begin, int end) {

        List<Integer> ans = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            if (isPalindrome(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static boolean isPrime(int n) {

        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }  
        
        return true;
    }

    public static List<Integer> findPrimeInRange(int begin, int end){

        List<Integer> list = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static String oddOrEven(int n){

        if(n % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static int sumOfFirstNNaturalNumbers(int n){
        return n * (n + 1) / 2;
    }
}
