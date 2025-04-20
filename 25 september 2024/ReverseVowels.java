import java.util.Arrays;

public class ReverseVowels {

    static String reverse(String s) {

        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            if (!isVowel(arr[start])) {
                start++;
            }
            if (!isVowel(arr[end])) {
                end--;
            }
            if (isVowel(arr[start]) && isVowel(arr[end])) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        StringBuilder sb = new StringBuilder().append(arr);
        return sb.toString();
    }

    static boolean isVowel(char c) {
        return (Character.toUpperCase(c) == 'A') ||
                (Character.toUpperCase(c) == 'E') ||
                (Character.toUpperCase(c) == 'I') ||
                (Character.toUpperCase(c) == 'O') ||
                (Character.toUpperCase(c) == 'U');
    }

    public static void main(String[] args) {
        String str = "leetcode";

        System.out.println(reverse(str));
     //  System.out.println(isVowel('O'));
    }
}
