public class ValidPalindrome {

    static boolean isValidPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char first = s.charAt(start);
            char last = s.charAt(end);

            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(last)) {
                end--;
            } else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama")); 

    }
}