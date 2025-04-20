/**
 * Subsequence
 */
public class Subsequence {


    static boolean isSubSeq(String str, String targetStr){
        int j = 0;
        int i = 0;

        while (i < str.length() && j < targetStr.length()) {
            if (str.charAt(i) == targetStr.charAt(j)) {
                i++;
                j++;
            }else {
                i++;
            }
        }

        if(j == targetStr.length()) return true;
        return false;
    }
    public static void main(String[] args) {
        
    }
}